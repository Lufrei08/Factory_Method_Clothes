package com.mycompany.factory_method_clothes;

public class Adidas extends Branded_Product {

    public Adidas(String size) {
        this.size = size;
        this.brand = brand;
        this.value = 0;

        if (size.equals("p")) {
            this.setValue(65.50);
            System.out.println("Você comprou uma camiseta da "
                    + "Adidas, do time Flamengo "
                    + "no tamanho P, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("m")) {
            this.setValue(74.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Adidas, do time Flamengo "
                    + "no tamanho M, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("g")) {
            this.setValue(89.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Adidas, do time Flamengo "
                    + "no tamanho G, no valor de R$ " + this.value);
        } else {
            System.out.println("Tamanho não disponivel");
        }

    }

}
