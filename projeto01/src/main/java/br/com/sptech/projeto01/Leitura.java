package br.com.sptech.projeto01;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);                                // Criando um novo scanner para o meu nextLine
                                                                                  // poder ser usado em qualquer momento do meu codigo          
        //System.out.println("Digite um número inteiro:");
        //Integer numeroDigitado = leitor.nextInt();
        //System.out.println("Você digitou:" + numeroDigitado);
        System.out.println("Digite seu nome:");                                   
        String nome = leitorString.nextLine();                                          // O next line pega toda a minha frase porém tem q está 
                                                                                   // no começo se não ele pega o espaço que vem sempre no padrão 
        System.out.println("Digite sua idade");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua Altura:");
        Double altura = leitor.nextDouble();

        System.out.println("Seu nome é " + nome + " Sua idade é " + idade
                + " e sua altura " + altura);

    }
}
