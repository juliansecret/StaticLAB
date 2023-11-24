package vista;

public class ObtenerVectores {
    private double[] angulos;

    public ObtenerVectores() {
    }

    public void setAngulos(double[] angulos) {
        if (angulos.length >= 2 && angulos.length <= 5) {
            this.angulos = angulos;
        } else {
            System.out.println("Numero de anngulos no valido.");
        }
    }

    public void graficar() {
        if (angulos != null) {
            Grafica grafica = new Grafica(angulos);
            grafica.setVisible(true);
        } else {
            System.out.println("No se han establecido angulos para graficar.");
        }
    }
}