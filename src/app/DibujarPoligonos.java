package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DibujarPoligonos extends JFrame {
    private List<Point> puntos;
    private List<Point> puntosRotados;
    private int anguloRotacion = 0;
    private int desplazamientoX = 0;
    private int desplazamientoY = 0;

    public DibujarPoligonos() {
        super("Dibujar Polígonos");
        puntos = new ArrayList<>();
        puntosRotados = new ArrayList<>();

        // Configuración básica de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Agregar un panel personalizado para dibujar
        DibujoPanel dibujoPanel = new DibujoPanel();
        add(dibujoPanel);

        // Manejador de eventos del ratón para registrar los puntos
        dibujoPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                puntos.add(new Point(e.getX(), e.getY()));
                // Inicialmente, los puntos rotados son los mismos que los originales
                puntosRotados.add(new Point(e.getX(), e.getY()));
                calcularCentro();
                dibujoPanel.requestFocusInWindow(); // Solicitar el foco al panel
                repaint();
            }
        });

        // Manejador de eventos del teclado para la rotación y el desplazamiento
        dibujoPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        anguloRotacion += 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        anguloRotacion -= 10;
                        break;
                    case KeyEvent.VK_W:
                        desplazamientoY -= 10;
                        break;
                    case KeyEvent.VK_S:
                        desplazamientoY += 10;
                        break;
                    case KeyEvent.VK_A:
                        desplazamientoX -= 10;
                        break;
                    case KeyEvent.VK_D:
                        desplazamientoX += 10;
                        break;
                }
                actualizarPuntosRotados();
                repaint();
            }
        });

        // Permitir que el panel tenga el foco para recibir eventos del teclado
        dibujoPanel.setFocusable(true);
    }

    private class DibujoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Dibujar los polígonos basados en los puntos rotados y desplazados
            if (puntosRotados.size() > 1) {
                int[] xPoints = puntosRotados.stream().mapToInt((Point point) -> point.x).toArray();
                int[] yPoints = puntosRotados.stream().mapToInt((Point point) -> point.y).toArray();
                int n = puntosRotados.size();

                g.drawPolygon(xPoints, yPoints, n);
            }
        }
    }

    // Función para actualizar los puntos rotados y desplazados
    private void actualizarPuntosRotados() {
        puntosRotados.clear();
        for (Point point : puntos) {
            int x = point.x - centro.x + desplazamientoX;
            int y = point.y - centro.y + desplazamientoY;
            puntosRotados.add(new Point(rotateX(x, y, anguloRotacion) + centro.x, rotateY(x, y, anguloRotacion) + centro.y));
        }
        calcularCentro(); // Actualizar el centro después del desplazamiento
    }

    // Funciones para rotar puntos
    private int rotateX(int x, int y, double angle) {
        return (int) (x * Math.cos(Math.toRadians(angle)) - y * Math.sin(Math.toRadians(angle)));
    }

    private int rotateY(int x, int y, double angle) {
        return (int) (x * Math.sin(Math.toRadians(angle)) + y * Math.cos(Math.toRadians(angle)));
    }

    // Variables para almacenar el centro del polígono
    private Point centro;

    // Función para calcular el centro del polígono
    private void calcularCentro() {
        if (!puntos.isEmpty()) {
            int sumaX = puntos.stream().mapToInt((Point point) -> point.x).sum();
            int sumaY = puntos.stream().mapToInt((Point point) -> point.y).sum();
            int centerX = sumaX / puntos.size();
            int centerY = sumaY / puntos.size();
            centro = new Point(centerX, centerY);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DibujarPoligonos ventana = new DibujarPoligonos();
            ventana.setVisible(true);
        });
    }
}
