public class Auto {
    //ATRIBUTOS
    private String patente;
    private String MARCA;
    private Double precio;
    private String color;
    private Motor motor;
    // variable de clase
    private static double descuento;

    public Auto(String patente, String MARCA, Double precio, String color, Motor motor) {
        this.patente = patente;
        this.MARCA = MARCA;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
        // variable que nos retorna con el this, sino con la clase
        Auto.descuento= 0.1;
    }

    public double precioPromocional() {
        return this.precio - this.precio * Auto.descuento;
    }

    public static void anularDescuento() {
        Auto.descuento = 0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", MARCA='" + MARCA + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}