
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;

public class Grafica extends JFrame {
    private double[] angulos;

    public Grafica(double[] angulos) {
        setTitle("Vectores en el plano cartesiano");
        setSize(400, 400);

        // Establecer el comportamiento de cierre sin cerrar la aplicación
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);

        // Asegurarse de que haya al menos dos ángulos para graficar
        if (angulos.length >= 2) {
            this.angulos = angulos;
        } else {
            // Manejar un número insuficiente de ángulos
            System.out.println("Se requieren al menos dos ángulos para graficar.");
        }

        // Añadir un WindowListener para manejar el cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Aquí puedes agregar lógica adicional antes de cerrar la ventana
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

        // Dibuja ejes X e Y
        g2.setColor(Color.BLACK);
        g2.draw(new Line2D.Double(centerX, 0, centerX, getHeight())); // Eje Y
        g2.draw(new Line2D.Double(0, centerY, getWidth(), centerY)); // Eje X

        if (angulos != null) {
            for (double angulo : angulos) {
                double radianes = Math.toRadians(angulo);
                int longitud = 100; // Longitud del vector

                int xFinal = centerX + (int) (longitud * Math.cos(radianes));
                int yFinal = centerY - (int) (longitud * Math.sin(radianes));

                g2.setColor(Color.RED); // Color de los vectores
                g2.draw(new Line2D.Double(centerX, centerY, xFinal, yFinal));
            }
        } else {
            // Manejar el caso en el que no haya ángulos para graficar
            System.out.println("No hay ángulos para graficar.");
        }

        // Etiquetas de ejes X e Y
        g2.setColor(Color.BLACK);
        g2.drawString("X", getWidth() - 15, centerY + 15);
        g2.drawString("Y", centerX - 20, 15);
    }
}