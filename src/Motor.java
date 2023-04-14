    public class Motor {
    //atributos
        private String numero;
        private double cilindrada;
        private String tipo;


        //CONTRUCTORES

        public Motor(String numero, double cilindrada, String tipo) {
            this.numero = numero;
            setCilindrada(cilindrada);
            this.tipo = tipo;
        }


        public void setCilindrada(double cilindrada) {
            if(cilindrada>0) {
                this.cilindrada = cilindrada;
            }
        }

        @Override
        public String toString() {
            return "Motor{" +
                    "numero='" + numero + '\'' +
                    ", cilindrada=" + cilindrada +
                    ", tipo='" + tipo + '\'' +
                    '}';
        }


    }
