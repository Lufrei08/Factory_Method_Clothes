package com.mycompany.factory_method_clothes;

public class Kappa extends Branded_Product {

    public Kappa(String size) {
        this.size = size;
        this.brand = brand;
        this.value = 0;

        if (size.equals("p")) {
            this.setValue(38.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Kappa, do time Vasco "
                    + "no tamanho P, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("m")) {
            this.setValue(46.60);
            System.out.println("Você comprou uma camiseta da "
                    + "Kappa, do time Vasco "
                    + "no tamanho M, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("g")) {
            this.setValue(59.99);
            System.out.println("Você comprou uma camiseta da "
                    + "Kappa, do time Vasco "
                    + "no tamanho G, no valor de R$ " + this.value);
        } else {
            System.out.println("Tamanho não disponivel");
        }

    }

}
