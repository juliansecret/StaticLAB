package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Grafica extends JFrame {
    private double[] angulos;
    private Color[] colores = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.MAGENTA};

    public Grafica(double[] angulos) {
        setTitle("Vectores en el plano cartesiano");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        if (angulos.length >= 2 && angulos.length <= 5) {
            this.angulos = angulos;
        } else {
            System.out.println("Se requieren entre 2 y 5 ángulos para graficar.");
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando la ventana de Grafica.");
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(centerX, 0, centerX, getHeight());
        g2.drawLine(0, centerY, getWidth(), centerY);

        // Etiquetas de los ejes
        Font axisFont = new Font("Arial", Font.BOLD, 18);
        g2.setFont(axisFont);
        g2.drawString("X", getWidth() - 20, centerY + 20);
        g2.drawString("Y", centerX - 20, 20);

        // Etiqueta en el extremo superior del eje Y
        FontMetrics metrics = g2.getFontMetrics(axisFont);
        int yOffset = metrics.getHeight();
        int yLabelYPosition = yOffset; // Posición ajustable
        g2.drawString("Y", centerX - 20, yLabelYPosition);


        if (angulos != null) {
            for (int i = 0; i < angulos.length; i++) {
                double angulo = angulos[i];
                double radianes = Math.toRadians(angulo);
                int longitud = 100 + i * 50;

                int xFinal = centerX + (int) (longitud * Math.cos(radianes));
                int yFinal = centerY - (int) (longitud * Math.sin(radianes));

                g2.setColor(colores[i % colores.length]);
                g2.setStroke(new BasicStroke(3));

                g2.drawLine(centerX, centerY, xFinal, yFinal);

                // Etiqueta con nombre y ángulo (mayor tamaño y en negrita)
                Font font = new Font("Arial", Font.BOLD, 16);
                g2.setFont(font);
                g2.drawString(String.format("Vector %d: %.0f°", i + 1, angulo), xFinal + 10, yFinal - 10);
            }
        } else {
            System.out.println("No hay angulos para graficar.");
        }
    }
}






