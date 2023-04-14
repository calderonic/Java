// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //SOBRECARGA DE CONSTRUCOTRES Y METODOS
        CuentaBancaria cb = new CuentaBancaria("miAlias", "dolares", "caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria("miAlias2", "dolares2", "caja de ahorros2");
        CuentaBancaria cb3 = new CuentaBancaria("miAlias3", "dolares3", "caja de ahorros3");

        CuentaBancaria cb4 = new CuentaBancaria("pesos", "tarjetadebito");
        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
        cb4.mostrarDatos();


        Robot robotProgramado = new Robot("Robotname");

        robotProgramado.saludarRobot("Alejandro");
        robotProgramado.saludarRobot();

        // STATIC Y TOSTRING AUTO
        //
        // OBETOS ANIDADOS DE MOTOR A CLASE AUTO
        Motor m = new Motor("22", 10.2, "Tipo ciliendrada Gas");


        Auto a1 = new Auto("zxcv1", "samsung", 1000.0, "blanco", m);
        Auto a2 = new Auto("zxcv2", "samsung2", 2000.0, "blanco2", m);
        Auto a3 = new Auto("zxcv3", "samsung3", 3000.0, "blanco3", m);
        System.out.println("/t /t /t /t /n");


        System.out.println(m);
        System.out.println(a1);

        System.out.println(a1);
        // con el metodo set de la clase motor anidada de clase auto
        m.setCilindrada(15.2);
        System.out.println(a2);
        System.out.println(a3);



        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());


        System.out.println(" ");
        Auto.anularDescuento();


        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());





        // STICKER TEMA STATIC

        Sticker s1 = new Sticker("2019/4/1","1111111");
        Sticker s2 = new Sticker("2019/4/2","2111111");
        Sticker s3 = new Sticker("2019/4/3","3111111");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        Documento doc = new Documento("Titulo mi Aprendisaje", "Motivate,\n sigue adelente co la copilacion de conocimiento que puedas absorber para los dias proximos seas cada vez un mejor programador");
        Impresora impresora = new Impresora();

        impresora.encender();
        impresora.imprimir(doc);



    }
}