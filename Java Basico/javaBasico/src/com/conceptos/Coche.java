package com.company;

public class Coche {

        // atributos
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double Largo;
        Integer velocidad = 0;

        // constructores
        public Coche(String color, String fabricante, String modelo, Double peso, Double Largo){
                this.color = color;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.peso = peso;
                this.Largo = Largo;
        }

        public Coche() {

        }

        // comportamiento
        public void acelerar (Integer cantidad){
                if(cantidad > 0 && cantidad <= 120){
                        this.velocidad += cantidad;
                }
        }

        @Override
        public String toString() {
                return "Coche{" +
                        "color='" + color + '\'' +
                        ", fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", peso=" + peso +
                        ", Largo=" + Largo +
                        ", velocidad=" + velocidad +
                        '}';
        }
}
