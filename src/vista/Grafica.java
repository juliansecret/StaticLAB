
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Grafica extends JFrame {
    private int numeroVectores;

    public Grafica() {
        setTitle("Vectores en el plano cartesiano");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void setNumeroVectores(int numeroVectores) {
        this.numeroVectores = numeroVectores;
        repaint(); // Vuelve a dibujar la gráfica con el nuevo número de vectores
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Dibuja ejes X e Y
        g2.setColor(Color.BLACK);
        g2.draw(new Line2D.Double(centerX, 0, centerX, getHeight())); // Eje Y
        g2.draw(new Line2D.Double(0, centerY, getWidth(), centerY)); // Eje X

        for (int i = 0; i < numeroVectores; i++) {
            // Obtén los ángulos según el número de vectores
            double angulo = obtenerAnguloParaVector(i, numeroVectores);
            double radianes = Math.toRadians(angulo);
            int longitud = 100; // Longitud del vector

            int xFinal = centerX + (int) (longitud * Math.cos(radianes));
            int yFinal = centerY - (int) (longitud * Math.sin(radianes));

            g2.setColor(Color.RED); // Color de los vectores
            g2.draw(new Line2D.Double(centerX, centerY, xFinal, yFinal));
        }

        // Etiquetas de ejes X e Y
        g2.setColor(Color.BLACK);
        g2.drawString("X", getWidth() - 15, centerY + 15);
        g2.drawString("Y", centerX - 20, 15);
    }

    private double obtenerAnguloParaVector(int vectorIndex, int totalVectores) {
        // Calcula el ángulo en grados
        double angulo = (360.0 * vectorIndex) / totalVectores;

        // Asegúrate de que el ángulo esté en el rango [0, 360) grados
        if (angulo >= 360.0) {
            angulo -= 360.0;
        }

        return angulo;
    }
}
