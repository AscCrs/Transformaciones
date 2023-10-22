package main;

/**
 *
 * @author crist
 */

public class Matrix {
    private double[][] m;
    
    public Matrix() {
        // Inicializa la matriz como una matriz identidad
        m = new double[3][3];
        identityMatrix();
    }
    
    public double[] pprima(double punto[]) {
        double[] res = new double[3];
        
        double xp = punto[0] * m[0][0] + punto[1] * m[0][1] + punto[2] * m[0][2];
        double yp = punto[0] * m[1][0] + punto[1] * m[1][1] + punto[2] * m[1][2];
        double hp = punto[0] * m[2][0] + punto[1] * m[2][1] + punto[2] * m[2][2];
        
        res[0] = xp;
        res[1] = yp;
        res[2] = hp;
        
        return res;
    }
    
    private void identityMatrix() {
        m[0][0] = 1;
        m[0][1] = 0;
        m[0][2] = 0;
        m[1][0] = 0;
        m[1][1] = 1;
        m[1][2] = 0;
        m[2][0] = 0;
        m[2][1] = 0;
        m[2][2] = 1;
    }
    
    public void escalar(int escala) {
        double[][] matrizEscala = new double[3][3];
        
        matrizEscala[0][0] = escala;
        matrizEscala[1][1] = escala;
        matrizEscala[2][2] = 1;
        
        m = producto(matrizEscala, m);
    }    
    
    public void escalarXY(double escalaX, double escalaY) {
        double[][] matrizEscala = new double[3][3];
        
        matrizEscala[0][0] = escalaX;
        matrizEscala[1][1] = escalaY;
        matrizEscala[2][2] = 1;
        
        m = producto(matrizEscala, m);
    }     
    
    public void rotacion(double angulo) {
        double radianes = Math.toRadians(angulo);
        double cos = Math.cos(radianes);
        double sin = Math.sin(radianes);

        double[][] matrizRotacion = {
            {cos, -sin, 0},
            {sin, cos, 0},
            {0, 0, 1}
        };

        m = producto(matrizRotacion, m);
    }
    
    public void traslacion(int tx, int ty) {
        double[][] matrizTraslacion = {
            {1, 0, tx},
            {0, 1, ty},
            {0, 0, 1}
        };

        m = producto(matrizTraslacion, m);
    }         
    
    private double[][] producto(double[][] matrixA, double[][] matrixB) {
        double[][] resultante = new double[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultante[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultante[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return resultante;
    }
}
