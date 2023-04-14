public class Sticker {

    //atributos

   private static int contador = 0;
   private int numero;
   private String fecha;
   private String dni;

    public Sticker(String fecha, String dni) {
        contador++;
        this.numero = contador;
        this.fecha = fecha;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "numero=" + numero +
                ", fecha='" + fecha + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
