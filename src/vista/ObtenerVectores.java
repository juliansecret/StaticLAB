package vista;

public class ObtenerVectores {
    private double[] angulos;

    public ObtenerVectores() {
        // Constructor sin argumentos
    }

    public void setAngulos(double[] angulos) {
        if (angulos.length >= 2 && angulos.length <= 5) {
            this.angulos = angulos;
        } else {
            // Manejar un número no válido de ángulos (puedes lanzar una excepción, imprimir un mensaje, etc.)
            System.out.println("Número de ángulos no válido. Se requieren entre 2 y 5 ángulos.");
        }
    }

    public void graficar() {
        if (angulos != null) {
            Grafica grafica = new Grafica(angulos);
            grafica.setVisible(true);
        } else {
            // Manejar el caso en el que no se hayan establecido ángulos (puedes lanzar una excepción, imprimir un mensaje, etc.)
            System.out.println("No se han establecido ángulos para graficar.");
        }
    }
}