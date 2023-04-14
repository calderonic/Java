public class Impresora {


    //    atributos
    private boolean estaEncendida;

//    constructor que por defecto es false a no colocarle ningun parametro


    public void encender() {
        estaEncendida = true;
    }
    public void imprimir(Documento doc) {
        if (estaEncendida) {
            System.out.println("imprimiedo doc" + doc.getTitulo());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(doc.getCuerpoDocumento());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
        else{
                System.out.println("La impresora esta apagada");
            }
        }
    }

