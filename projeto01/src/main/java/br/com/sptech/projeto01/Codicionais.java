package br.com.sptech.projeto01;

import java.util.Scanner;

public class Codicionais {

    public static void main(String[] args) {
        Integer numero = 42;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite qualquer numero");
        Integer numeroDigitado = leitor.nextInt();
        
        
        if (numero > numeroDigitado) {
            System.out.println(numeroDigitado + " é menor que " + numero);
        } else {
            System.out.println(numeroDigitado + " é maior que " + numero);
        }
    }
}
