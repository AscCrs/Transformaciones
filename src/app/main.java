package app;

/**
 *
 * @author AscCrs
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class main extends javax.swing.JFrame {

    int c = 0;
    ArrayList<Polygon> formas;
    DefaultListModel modelo = new DefaultListModel();
    ArrayList arr = new ArrayList();

    public main() {
        this.formas = new ArrayList<>();
        this.setTitle("MINICAD");
        initComponents();
        lista.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnescalamientoX = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnrotacion = new javax.swing.JButton();
        btnDibujar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btntraslacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        escalaXjSpinner = new javax.swing.JSpinner();
        escalaYjSpinner = new javax.swing.JSpinner();
        rotarjSpinner = new javax.swing.JSpinner();
        traslaXjSpinner = new javax.swing.JSpinner();
        traslaYjSpinner = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnescalamientoY = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Escalamiento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("X:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Y:");

        btnescalamientoX.setText("Escalar X");
        btnescalamientoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescalamientoXActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Rotación:");

        btnrotacion.setText("Rotar");
        btnrotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrotacionActionPerformed(evt);
            }
        });

        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar Pizarra");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Traslación");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setText("X:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Y:");

        btntraslacion.setText("Trasladar");
        btntraslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntraslacionActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(lista);

        btnescalamientoY.setText("Escalar Y");
        btnescalamientoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescalamientoYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(traslaXjSpinner))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rotarjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(traslaYjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntraslacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(escalaXjSpinner))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(escalaYjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnescalamientoY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnescalamientoX, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escalaXjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnescalamientoX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escalaYjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnescalamientoY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rotarjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(traslaXjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(traslaYjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntraslacion)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JOptionPane.showMessageDialog(this, "Selecciona un punto dentro de la pizarra", "Alerta", HEIGHT);
    }//GEN-LAST:event_formMouseClicked


    private void btnescalamientoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescalamientoXActionPerformed
        // Obtén el valor de escalaX del Spinner como entero
        int escalaXInt = (int) escalaXjSpinner.getValue();
        // Convierte el entero a double
        double escalaX = (double) escalaXInt;
        // Obtén el índice seleccionado en la lista
        int index = lista.getSelectedIndex();

        // Genera la matriz escalada a partir de la matriz generada por la forma en el índice seleccionado
        int[][] matrizEscalar = escalar(generarMatriz(formas.get(index)), escalaX / 10, 1.0d);

        // Elimina la forma actual en el índice seleccionado y agrega la forma escalada
        formas.remove(index);
        formas.add(index, crearPolygonos(matrizEscalar));

        // Vuelve a pintar el componente
        repaint();
    }//GEN-LAST:event_btnescalamientoXActionPerformed

    private void btnrotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrotacionActionPerformed
        // Obtiene el valor de rotación del Spinner como entero
        int anguloRotacion = (int) rotarjSpinner.getValue();
        // Obtiene el índice seleccionado en la lista
        int index = lista.getSelectedIndex();
        // Genera la matriz de rotación a partir de la matriz generada por la forma en el índice seleccionado
        int[][] matrizRotacion = rotacion(generarMatriz(formas.get(index)), anguloRotacion);

        // Elimina la forma actual en el índice seleccionado y agrega la forma rotada
        formas.remove(index);
        formas.add(index, crearPolygonos(matrizRotacion));

        // Vuelve a pintar el componente
        repaint();
    }//GEN-LAST:event_btnrotacionActionPerformed

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        int lastIndex = formas.size() - 1;
        draw(formas.get(lastIndex));
        // Restablece la variable 'c' a 0
        c = 0;
        // Crea el mensaje de la figura y lo agrega a la lista 'arr'
        String figuraMessage = "Figura: " + (lastIndex + 1);
        arr.add(figuraMessage);
        // Actualiza la lista de visualización
        fillList();
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // Limpia la lista de formas
        formas.clear();
        // Restablece la variable 'c' a 0
        c = 0;
        // Limpia el modelo de la lista
        modelo.removeAllElements();
        // Limpia la lista 'arr'
        arr.clear();
        // Vuelve a pintar el componente
        repaint();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btntraslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntraslacionActionPerformed
        // Obtiene los valores de traslación en los ejes X e Y desde los Spinners
        int moveX = (int) traslaXjSpinner.getValue();
        int moveY = (int) traslaYjSpinner.getValue();
        // Obtiene el índice seleccionado en la lista
        int index = lista.getSelectedIndex();
        // Obtiene los puntos x e y de la forma en el índice seleccionado
        int[] puntosX = formas.get(index).xpoints;
        int[] puntosY = formas.get(index).ypoints;
        // Obtiene el centro de la forma
        int centroX = formas.get(index).getBounds().x;
        int centroY = formas.get(index).getBounds().y;
        // Aplica la traslación a cada punto de la forma
        for (int i = 0; i < puntosX.length; i++) {
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;

            int nuevoX = centroX + x + moveX;
            int nuevoY = centroY + y - moveY;

            puntosX[i] = nuevoX;
            puntosY[i] = nuevoY;
        }
        // Remueve la forma actual en el índice seleccionado y agrega la forma trasladada
        formas.remove(index);
        formas.add(index, new Polygon(puntosX, puntosY, puntosX.length));
        // Vuelve a pintar el componente
        repaint();
    }//GEN-LAST:event_btntraslacionActionPerformed

    private void btnescalamientoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescalamientoYActionPerformed
        // Obtiene el valor de escalaY del Spinner como entero
        int escalaYInt = (int) escalaYjSpinner.getValue();
        // Convierte el entero a double
        double escalaY = (double) escalaYInt;
        // Obtiene el índice seleccionado en la lista
        int index = lista.getSelectedIndex();
        // Genera la matriz escalada a partir de la matriz generada por la forma en el índice seleccionado
        int[][] matrizEscalar = escalar(generarMatriz(formas.get(index)), 1.0d, escalaY / 10);
        // Elimina la forma actual en el índice seleccionado y agrega la forma escalada
        formas.remove(index);
        formas.add(index, crearPolygonos(matrizEscalar));
        // Vuelve a pintar el componente
        repaint();
    }//GEN-LAST:event_btnescalamientoYActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // Si es la primera vez, agrega un nuevo Polygon a la lista 'formas'
        if (c == 0) {
            formas.add(new Polygon());
        }
        // Obtiene el componente contenido en el JScrollPane
        Component componentInScrollPane = jScrollPane1.getViewport().getView();
        // Obtiene la posición del mouse en relación con el componente contenido
        Point componentMousePosition = SwingUtilities.convertPoint(
                jScrollPane1, evt.getPoint(), componentInScrollPane);
        // Agrega un nuevo punto al último Polygon en la lista 'formas'
        formas.get(formas.size() - 1).addPoint(
                componentMousePosition.x, componentMousePosition.y);
        // Incrementa la variable 'c'
        c++;
    }//GEN-LAST:event_jScrollPane1MouseClicked

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Random rand = new Random();

        for (Polygon forma : formas) {
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);

            g.fillPolygon(forma);
        }
    }

    public void draw(Polygon p) {
        if (formas.isEmpty()) {
            return;
        }

        Graphics g = getGraphics();
        // Genera un color aleatorio
        Color randomColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        g.setColor(randomColor);
        // Dibuja el último Polygon en la lista 'formas'
        g.fillPolygon(formas.get(formas.size() - 1));
    }

    public void fillList() {
        modelo.removeAllElements();
        for (int i = 0; i < arr.size(); i++) {
            modelo.addElement(arr.get(i));
        }
    }

    public int[][] rotacion(int[][] matriz, int alpha) {
        int totalPuntos = matriz[0].length;
        int xCentro = 0;
        int yCentro = 0;

        // Calcula el centro de los puntos en la matriz
        for (int i = 0; i < totalPuntos; i++) {
            xCentro += matriz[0][i];
            yCentro += matriz[1][i];
        }

        xCentro /= totalPuntos;
        yCentro /= totalPuntos;

        // Aplica la rotación alrededor del centro
        int[][] matrizTraslada = aplicarTraslacion(matriz, -xCentro, -yCentro);
        double[][] matrizRotada = aplicarRotacion(matrizTraslada, alpha);
        int[][] matrizFinal = aplicarTraslacion(convertirInt(matrizRotada), xCentro, yCentro);

        return matrizFinal;
    }

    public int[][] escalar(int[][] matriz, double x, double y) {
        // Puntos en X y Y de base para llevarlo al origen
        int xBase = matriz[0][0];
        int yBase = matriz[1][0];

        // Aplica traslación al origen, escalado y traslación de regreso
        int[][] matrizTraslada = aplicarTraslacion(matriz, -xBase, -yBase);
        double[][] matrizEscalada = aplicarEscalado(matrizTraslada, x, y);
        int[][] matrizFinal = aplicarTraslacion(convertirInt(matrizEscalada), xBase, yBase);

        return matrizFinal;
    }

    public double[][] aplicarEscalado(int[][] matriz, double esX, double esY) {
        // Genera la matriz de escalado
        double[][] matrizEscalado = generarMatrizEscalado(esX, esY);

        // Realiza el producto de la matriz de escalado con la matriz original
        return productoMatriz(matrizEscalado, convertirDouble(matriz));
    }

    public int[][] aplicarTraslacion(int[][] matriz, int valorX, int valorY) {
        // Genera la matriz de traslación
        int[][] matrizTraslacion = generarMatrizTraslacion(valorX, valorY);

        // Realiza el producto de la matriz de traslación con la matriz original
        return convertirInt(productoMatriz(convertirDouble(matrizTraslacion), convertirDouble(matriz)));
    }

    public double[][] aplicarRotacion(int[][] matriz, int angulo) {
        // Genera la matriz de rotación
        double[][] matrizRotacion = generarMatrizRotacion(angulo);

        // Realiza el producto de la matriz de rotación con la matriz original
        return productoMatriz(matrizRotacion, convertirDouble(matriz));
    }

    public Polygon crearPolygonos(int[][] matriz) {
        int numPuntos = matriz[0].length;
        int[] arrX = new int[numPuntos];
        int[] arrY = new int[numPuntos];

        for (int i = 0; i < numPuntos; i++) {
            arrX[i] = matriz[0][i];
            arrY[i] = matriz[1][i];
        }

        return new Polygon(arrX, arrY, numPuntos);
    }

    public double[][] productoMatriz(double[][] matrizA, double[][] matrizB) {
        int filaA = matrizA.length;
        int columnaA = matrizA[0].length;
        int columnaB = matrizB[0].length;

        double[][] resultado = new double[filaA][columnaB];

        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaB; j++) {
                for (int k = 0; k < columnaA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public int[][] generarMatriz(Polygon poligono) {
        int totalPuntos = poligono.npoints;
        int[][] matrizDelPoligono = new int[3][totalPuntos];
        int[] pX = poligono.xpoints;
        int[] pY = poligono.ypoints;

        for (int i = 0; i < totalPuntos; i++) {
            matrizDelPoligono[0][i] = pX[i];
            matrizDelPoligono[1][i] = pY[i];
            matrizDelPoligono[2][i] = 1;
        }

        return matrizDelPoligono;
    }

    public int[][] generarMatrizTraslacion(int trasX, int trasY) {
        int[][] matrizTraslacion = new int[3][3];

        matrizTraslacion[0][0] = 1;
        matrizTraslacion[0][1] = 0;
        matrizTraslacion[0][2] = trasX;

        matrizTraslacion[1][0] = 0;
        matrizTraslacion[1][1] = 1;
        matrizTraslacion[1][2] = trasY;

        matrizTraslacion[2][0] = 0;
        matrizTraslacion[2][1] = 0;
        matrizTraslacion[2][2] = 1;

        return matrizTraslacion;
    }

    public double[][] generarMatrizEscalado(double escalaX, double escalaY) {
        double[][] matrizEscalado = new double[3][3];

        matrizEscalado[0][0] = escalaX;
        matrizEscalado[0][1] = 0;
        matrizEscalado[0][2] = 0;

        matrizEscalado[1][0] = 0;
        matrizEscalado[1][1] = escalaY;
        matrizEscalado[1][2] = 0;

        matrizEscalado[2][0] = 0;
        matrizEscalado[2][1] = 0;
        matrizEscalado[2][2] = 1;

        return matrizEscalado;
    }

    public int[][] convertirInt(double[][] matriz) {
        int[][] tmp = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tmp[i][j] = (int) matriz[i][j];
            }
        }
        return tmp;
    }

    public double[][] convertirDouble(int[][] matriz) {
        double[][] tmp = new double[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tmp[i][j] = (double) matriz[i][j];
            }
        }
        return tmp;
    }

    public double[][] generarMatrizRotacion(int angulo) {
        double radianes = Math.toRadians(angulo);

        double cosAngulo = Math.cos(radianes);
        double sinAngulo = Math.sin(radianes);

        double[][] matrizRotacion = {
            {cosAngulo, -sinAngulo, 0},
            {sinAngulo, cosAngulo, 0},
            {0, 0, 1}
        };

        return matrizRotacion;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDibujar;
    private javax.swing.JButton btnescalamientoX;
    private javax.swing.JButton btnescalamientoY;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnrotacion;
    private javax.swing.JButton btntraslacion;
    private javax.swing.JSpinner escalaXjSpinner;
    private javax.swing.JSpinner escalaYjSpinner;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JSpinner rotarjSpinner;
    private javax.swing.JSpinner traslaXjSpinner;
    private javax.swing.JSpinner traslaYjSpinner;
    // End of variables declaration//GEN-END:variables
}
