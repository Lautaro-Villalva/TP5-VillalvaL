package resol.VillalvaL.Ejercicio1;

public class clasePrenda {

    private String tipo;
    private String talle;
    private double precioBase;

    // Constructor
    public clasePrenda(String tipo, String talle, double precioBase) {
        this.tipo = tipo;
        this.talle = talle;
        this.precioBase = precioBase;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getTalle() {
        return talle;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // 🔹 Para mostrar en resumen
    public String getDescripcion() {
        return tipo + " - Talle: " + talle;
    }

    // 🔹 Para mostrar en catálogo
    public void mostrarPrenda() {
        System.out.println(tipo + " | Talle: " + talle + " | Precio: $" + precioBase);
    }
}