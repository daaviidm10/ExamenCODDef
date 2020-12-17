package com.cod;

public class Main {
    public static void main(String[] args) {
        if (comprobar("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (comprobar2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
}

    /**
     * Nestes dous métodos do main é donde realizamos a instancia.
     **/
    public static boolean comprobar(String u) {
        Comprobador obx1 = Comprobador.getInstance();
        System.out.println("Conectando a " + obx1.ip + ", con el usuario " + u);
        return obx1.con();
    }

    public static boolean comprobar2() {
        Comprobador obx2 = Comprobador.getInstance();
        System.out.println("Conectando a " + obx2.ip + ", con el usuario " + obx2.nombre);
        return obx2.con();
    }
}
