package com.cod;

public class Comprobador {
    private static Comprobador instance=null;

    String nombre = "";
    String ip = "127.0.0.2";

    Comprobador() {
        nombre = "anonymous@danielcastelao.org";
    }

    Comprobador(String parametro1) {
        this.nombre = parametro1;
    }
public static Comprobador getInstance(){
    /** Este metodo serve para ver o primer usuario e instanciando en Singleton.
     *
     */

    if(instance==null){

            instance=new Comprobador();
        }

        return instance;
}
    public boolean con() {
                if (nombre != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
