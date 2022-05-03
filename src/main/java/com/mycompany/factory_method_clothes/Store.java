package com.mycompany.factory_method_clothes;

public class Store implements FactoryProduct {

    @Override
    public Branded_Product getBrand(String brand, String size) {
        if (brand.equals("brasil")) {
            return new Nike(size);
        }
        if (brand.equals("flamengo")) {
            return new Adidas(size);
        }
        if (brand.equals("botafogo")) {
            return new Puma(size);
        }
        if (brand.equals("fluminense")) {
            return new Umbro(size);
        }
        if (brand.equals("vasco")) {
            return new Kappa(size);
        } else {
            System.out.println("Desculpe, mas este modelo não está disponível!");
            return null;
        }

    }

}
