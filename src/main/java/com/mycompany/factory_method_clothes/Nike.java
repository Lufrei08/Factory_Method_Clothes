package com.mycompany.factory_method_clothes;

public class Nike extends Branded_Product {

    public Nike(String size) {
        this.size = size;
        this.brand = brand;
        this.value = 0;

        if (size.equals("p")) {
            this.setValue(79.90);
            System.out.println("Você comprou uma camiseta da "
                    + "Nike, da seleção brasileira "
                    + "no tamanho P, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("m")) {
            this.setValue(93.50);
            System.out.println("Você comprou uma camiseta da "
                    + "Nike, da seleção brasileira "
                    + "no tamanho M, no valor de R$ " + this.value);
            return;
        }
        if (size.equals("g")) {
            this.setValue(105.00);
            System.out.println("Você comprou uma camiseta da "
                    + "Nike, da seleção brasileira "
                    + "no tamanho G, no valor de R$ " + this.value);
        } else {
            System.out.println("Tamanho não disponivel");
        }

    }

}
