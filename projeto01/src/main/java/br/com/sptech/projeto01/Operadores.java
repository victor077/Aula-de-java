package br.com.sptech.projeto01;

public class Operadores {

    public static void main(String[] args) {
        Integer numero1 = 10;
        Integer numero2 = 5;

        System.out.println(numero1 + numero2);
        
        Double a = 5.5;
        Double b = 10.0;
        
        Math.pow(5.0, 5.0);
        // Maneira 1;
        Double retorno = Math.pow(a, b);
        System.out.println(retorno);
        
        // Maneira 2:
        System.out.println( Math.pow(5.0, 5.0));
    }
}
