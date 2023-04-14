public class Robot {

    //atributos
    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    public void saludarRobot (String nombrePersona) {
        System.out.println("Hola " + nombrePersona + ", soy " + nombre);
    }

    public void saludarRobot () {
        saludarRobot("extrano ");
//        System.out.println("Hola soy " + name);

    }



}
