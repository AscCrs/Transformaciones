package main;

import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author crist
*/

public class MainView extends javax.swing.JFrame {
    ArrayList<Polygon> forms = new ArrayList<Polygon>();
    Matrix m = new Matrix();
    int c = 0; // Contador
    double xp,yp,hp;
    double[][] matrix = new double[3][3];
    
    public MainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldRazonX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldRazony = new javax.swing.JTextField();
        btnEscalar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldAngulo = new javax.swing.JTextField();
        btnRotar = new javax.swing.JButton();
        btnDibujar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbxPoligonos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnTrasladar = new javax.swing.JButton();
        fieldDesplazarX = new javax.swing.JTextField();
        fieldDesplazarY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transformaciones");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Haz Click en la zona blanca para marcar los vertices de un polígono");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Razon en X:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Escalar");

        fieldRazonX.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Razon en Y:");

        fieldRazony.setText("0");
        fieldRazony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRazonyActionPerformed(evt);
            }
        });

        btnEscalar.setBackground(new java.awt.Color(0, 102, 255));
        btnEscalar.setForeground(new java.awt.Color(255, 255, 255));
        btnEscalar.setText("APLICAR");
        btnEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Rotar");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Angulo:");

        fieldAngulo.setText("0");

        btnRotar.setBackground(new java.awt.Color(0, 102, 255));
        btnRotar.setForeground(new java.awt.Color(255, 255, 255));
        btnRotar.setText("APLICAR");
        btnRotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotarActionPerformed(evt);
            }
        });

        btnDibujar.setBackground(new java.awt.Color(51, 255, 51));
        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 51));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbxPoligonos.setBackground(java.awt.Color.white);
        cmbxPoligonos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una figura" }));
        cmbxPoligonos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxPoligonosItemStateChanged(evt);
            }
        });
        cmbxPoligonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxPoligonosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Trasladar");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setText("Desplazamiento en X:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Desplazamiento en Y:");

        btnTrasladar.setBackground(new java.awt.Color(0, 102, 255));
        btnTrasladar.setForeground(new java.awt.Color(255, 255, 255));
        btnTrasladar.setText("APLICAR");
        btnTrasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasladarActionPerformed(evt);
            }
        });

        fieldDesplazarX.setText("0");

        fieldDesplazarY.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Lista de poligonos Creados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldDesplazarY, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldDesplazarX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fieldRazony, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldRazonX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(fieldAngulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRotar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbxPoligonos, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRotar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldDesplazarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldDesplazarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldRazonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldRazony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxPoligonos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (c == 0) {
            forms.add(new Polygon());
        }
        forms.get(forms.size() - 1).addPoint(evt.getX(), evt.getY());
        c++;
    }//GEN-LAST:event_formMouseClicked
        
    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        draw(forms.get(forms.size() - 1));
        c = 0;
        fillCombo();
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        forms.clear();
        c = 0;
        cmbxPoligonos.removeAllItems();
        repaint();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbxPoligonosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxPoligonosItemStateChanged
        int selectedIndex = cmbxPoligonos.getSelectedIndex();
        if (selectedIndex >= 0) {
            Graphics g = getGraphics();
            Polygon selectedPolygon = forms.get(selectedIndex);
            g.drawPolygon(selectedPolygon);
        }
    }//GEN-LAST:event_cmbxPoligonosItemStateChanged

    private void btnTrasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasladarActionPerformed
        int mvX = Integer.parseInt(fieldDesplazarX.getText());
        int mvY = Integer.parseInt(fieldDesplazarY.getText());
        int index = cmbxPoligonos.getSelectedIndex();

        if (index >= 0 && index < forms.size()) {
            Polygon selectedPolygon = forms.get(index);
            int[] dotsX = selectedPolygon.xpoints;
            int[] dotsY = selectedPolygon.ypoints;

            int centerX = selectedPolygon.getBounds().x;
            int centerY = selectedPolygon.getBounds().y;

            for (int i = 0; i < dotsX.length; i++) {
                int x = dotsX[i] - centerX;
                int y = dotsY[i] - centerY;
                    
                int newX = centerX + x + mvX;
                int newY = centerY + y - mvY;

                dotsX[i] = newX;
                dotsY[i] = newY;
            }

            forms.set(index, new Polygon(dotsX, dotsY, dotsX.length));
            repaint();
        }
    }//GEN-LAST:event_btnTrasladarActionPerformed

    private void btnEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalarActionPerformed
        double sx = Double.parseDouble(fieldRazonX.getText());
        double sy = Double.parseDouble(fieldRazony.getText());
        int index = cmbxPoligonos.getSelectedIndex();

        if (index >= 0 && index < forms.size()) {
            Polygon selectedPolygon = forms.get(index);
            int[] dotsX = selectedPolygon.xpoints;
            int[] dotsY = selectedPolygon.ypoints;

            int centerX = selectedPolygon.getBounds().x;
            int centerY = selectedPolygon.getBounds().y;

            for (int i = 0; i < dotsX.length; i++) {
                int x = dotsX[i] - centerX;
                int y = dotsY[i] - centerY;

                int newX = centerX + (int) (x * sx);
                int newY = centerY + (int) (y * sy);

                dotsX[i] = newX;
                dotsY[i] = newY;
            }

            forms.set(index, new Polygon(dotsX, dotsY, dotsX.length));
            repaint();
        }
    }//GEN-LAST:event_btnEscalarActionPerformed

    private void fieldRazonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRazonyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRazonyActionPerformed

    private void btnRotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotarActionPerformed
        double alpha = Math.toRadians(Double.parseDouble(fieldAngulo.getText()));
        int index = cmbxPoligonos.getSelectedIndex();

        if (index >= 0 && index < forms.size()) {
            Polygon selectedPolygon = forms.get(index);
            int[] dotsX = selectedPolygon.xpoints;
            int[] dotsY = selectedPolygon.ypoints;

            int centerX = selectedPolygon.getBounds().x;
            int centerY = selectedPolygon.getBounds().y;

            for (int i = 0; i < dotsX.length; i++) {
               int x = dotsX[i] - centerX;
               int y = dotsY[i] - centerY;
            
                int newX = centerX + (int) (x * Math.cos(alpha) - y * Math.sin(alpha));
                int newY = centerY + (int) (x * Math.sin(alpha) + y * Math.cos(alpha));

                dotsX[i] = newX;
                dotsY[i] = newY;
            }

            forms.set(index, new Polygon(dotsX, dotsY, dotsX.length));
            repaint();
        }
    }//GEN-LAST:event_btnRotarActionPerformed

    private void cmbxPoligonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxPoligonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxPoligonosActionPerformed

    @Override
    public void paint(Graphics g) {
        super.paint(g);
            for (Polygon polygon : forms) {
                drawPolygonWithRandomColor(g, polygon);
        }
    }

    public void draw(Polygon p) {
        if (p != null) {
            Graphics g = getGraphics();
            drawPolygonWithRandomColor(g, p);
        }
    }

    public void fillCombo() {
        cmbxPoligonos.removeAllItems();
        for (int i = 0; i < forms.size(); i++) {
            Polygon polygon = forms.get(i);
            int numSides = polygon.npoints;
            cmbxPoligonos.addItem("Figura " + (i + 1) + " No. Lados: " + numSides);
        }
    }

    private void drawPolygonWithRandomColor(Graphics g, Polygon polygon) {
        if (polygon != null) {
            Color randomColor = getRandomColor();
            g.setColor(randomColor);
            g.fillPolygon(polygon);
        }
    }

    private Color getRandomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
    
        return new Color(red, green, blue);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDibujar;
    private javax.swing.JButton btnEscalar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRotar;
    private javax.swing.JButton btnTrasladar;
    private javax.swing.JComboBox<String> cmbxPoligonos;
    private javax.swing.JTextField fieldAngulo;
    private javax.swing.JTextField fieldDesplazarX;
    private javax.swing.JTextField fieldDesplazarY;
    private javax.swing.JTextField fieldRazonX;
    private javax.swing.JTextField fieldRazony;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
