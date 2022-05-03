package com.mycompany.factory_method_clothes;

public class Umbro extends Branded_Product {

    public Umbro(String size) {
        this.size = size;
        this.brand = brand;
        this.value = 0;

        if (size.equals("p")) {
            this.setValue(62.70);
            System.out.println("Você comprou uma camiseta da "
                    + "Umbro, do time Fluminense "
                    + "no tamanho P, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("m")) {
            this.setValue(69.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Umbro, do time Fluminense "
                    + "no tamanho M, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("g")) {
            this.setValue(75.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Umbro, do time Fluminense "
                    + "no tamanho G, no valor de R$ " + this.value);
        } else {
            System.out.println("Tamanho não disponivel");
        }

    }

}
