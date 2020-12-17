package com.cod;

public class Comprobador {
    String nombre = "";
    String ip = "127.0.0.2";

    Comprobador() {
        nombre = "anonymous@danielcastelao.org";
    }

    Comprobador(String parametro1) {
        this.nombre = parametro1;
    }

    public boolean con() {
        if (nombre != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
