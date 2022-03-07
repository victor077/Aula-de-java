package exerciciosvictor;

import java.util.Scanner;

public class ExerciciosVictor {

    public static void main(String[] args) {
        Scanner leitoTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Bem vindo administrador! Faça o controle de produtos");
        System.out.println("Informe a quantidade de produtos no seu estoque");
        Integer qntEstoque = leitorNumero.nextInt();

        System.out.println("Muito bem agora informe a sua meta de vendas");
        Double meta = leitorNumero.nextDouble();
        Double estoquePorcetagem = (qntEstoque * meta) / 100;

        Integer produto = 0;
        if (meta <= qntEstoque) {
            System.out.println("Para atingir sua meta você precisa de " + estoquePorcetagem + " produtos");
        }
        System.out.println("1 - Realizar Venda");
        System.out.println("2 - Sair");

        Integer proximoPasso = leitorNumero.nextInt();

        switch (proximoPasso) {
            case 1: {
                System.out.println("Informe a quantidade de produtos desejado");
            }
            Integer qntProdutosDesejados = leitorNumero.nextInt();
            if (qntProdutosDesejados > qntEstoque) {
                System.out.println("Digite uma quatidade valida, Quantidade disponivel: " + qntEstoque);
                Integer qntValida = leitorNumero.nextInt();

                for (int contador = 1; contador < qntValida + 1;
                        contador++) {
                    qntEstoque--;
                    produto++;
                    System.out.println("venda do " + produto + " produto"
                            + " registrada, restam " + qntEstoque + " em estoque");

                    if (qntProdutosDesejados > qntEstoque) {
                        System.out.println("Infelizmente não temos a quantidade de"
                                + " produtos digitada. "
                                + " Quantidade disponível: " + qntEstoque);
                        System.out.println("Digite uma quantidade valida");
                    }

                }
            }
            for (int contador = 1; contador < qntProdutosDesejados + 1;
                    contador++) {
                qntEstoque--;
                produto++;
                System.out.println("venda do " + produto + " produto"
                        + " registrada, restam " + qntEstoque + " em estoque");

                if (qntProdutosDesejados > qntEstoque) {
                    System.out.println("Infelizmente não temos a quantidade de"
                            + " produtos digitada. "
                            + " Quantidade disponível: " + qntEstoque);
                    System.out.println("Digite uma quantidade valida");
                }

            }
            if (meta > qntProdutosDesejados) {
                System.out.println("Você acabou de vender " + produto + " produtos"
                        + " (sua meta é vender " + meta + " !! )");
            }

            if (meta <= qntProdutosDesejados) {
                System.out.println("Parabens você bateu sua meta");
            }

            break;
            default:

        }
    }

}
