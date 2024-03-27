package main.java;

import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;
        int apostaNumero;
        char apostaLetra;
        char letraViciada = 'G';
        int apostaParImpar;

        do {
            System.out.println("**************************\n");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 até 100");
            System.out.println("2) Apostar de A até Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair\n");
            System.out.println("**************************");

            System.out.println("\nEscolha uma opção para jogar:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Aposta de 0 até 100 selecionada.");
                    System.out.println("Escolha um número de 0 até 100 para apostar:\n");
                    int numeroAposta = random.nextInt(101);
                    apostaNumero = scanner.nextInt();
                        if (apostaNumero > 100) {
                            System.out.println("\nAposta inválida\n");
                        }
                        else if (apostaNumero == numeroAposta) {
                            System.out.println("\nVocê ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("\nQue pena! O número sorteado foi: " + numeroAposta);
                        }
                }
                case 2 -> {
                    System.out.println("Aposta de A até Z selecionada.");
                    System.out.println("Escolha uma letra de A até Z para apostar.\n");
                    apostaLetra = scanner.next().toUpperCase().charAt(0);
                    if (!Character.isLetter(apostaLetra)) {
                        System.out.println("Aposta inválida.");
                    } else {
                        if (apostaLetra == letraViciada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraViciada);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\nAposta entre par ou ímpar selecionada.\n");
                    System.out.println("Escolha um número inteiro para apostar:");
                    apostaParImpar = scanner.nextInt();
                    try {                    
                        if (apostaParImpar % 2 == 0) {
                            System.out.println("Você ganhou R$ 100,00 reais.");
                        } else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                     }
                    catch (java.util.InputMismatchException e) {
                       System.out.println("Erro: Digite uma letra");
                    }                      
                }
                case 0 -> System.out.println("Saindo do programa, obrigado por jogar.");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
          scanner.close();
    }
}