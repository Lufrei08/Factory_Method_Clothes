package com.mycompany.factory_method_clothes;

public class Puma extends Branded_Product {

    public Puma(String size) {
        this.size = size;
        this.brand = brand;
        this.value = 0;

        if (size.equals("p")) {
            this.setValue(74.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Puma, do time Botafogo "
                    + "no tamanho P, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("m")) {
            this.setValue(89.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Puma, do time Botafogo "
                    + "no tamanho M, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("g")) {
            this.setValue(95.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Puma, do time Botafogo "
                    + "no tamanho G, no valor de R$ " + this.value);
        } else {
            System.out.println("Tamanho não disponivel");
        }

    }

}
