public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    //CONSTRUCTOR  (donde se inicializa los datos)
    public CuentaBancaria(String alias, String moneda, String tipo){
        this.CBU = generaCBU();//SE GENERA AUTOMATICAMENTE DENTRO DE LA CLASE
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
        // respecto a saldo queremos que quede 0,0 asi que lo dejamos por defecto

        // NO SE ESTARIA VALIDANDO --->
        //        this.alias = alias;
        //        this.moneda = moneda;
        //        this.tipo = tipo;
    }


    public CuentaBancaria(String moneda, String tipo) {
        this("alias.por.defecto", moneda, tipo); // dejamos el cbu, y alias tambien, solo que el alias es un alias por defecto de la clase CuentaBancaria.java

//        this.CBU = generaCBU();
//        setAlias("aliasPorDefecto");
//        setMoneda(moneda);
//        setTipo(tipo);
    }



    private String generaCBU() {
        return "12345678"; // pendiente
    }
    void mostrarDatos() {
        System.out.println(CBU + " " + alias + " " + saldo + " " + moneda + " " + tipo + " ");
    }
    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }

    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}






