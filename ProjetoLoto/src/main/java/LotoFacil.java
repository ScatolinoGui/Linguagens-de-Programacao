package main.java;

import java.util.InputMismatchException;
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
        
        try{
                do {
                    System.out.println("**************************");
                    System.out.println("Menu LOTOFÁCIL:");
                    System.out.println("1) Apostar de 0 até 100");
                    System.out.println("2) Apostar de A até Z");
                    System.out.println("3) Apostar em par ou ímpar");
                    System.out.println("0) Sair");
                    System.out.println("**************************");

                    System.out.println("Escolha uma opção para jogar:");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1 -> {
                            System.out.println("Aposta de 0 até 100 selecionada.");
                            System.out.println("Escolha um número de 0 até 100 para apostar:");
                            int numeroAposta = random.nextInt(101);
                            apostaNumero = scanner.nextInt();
                                if (apostaNumero > 100) {
                                    System.out.println("\nAposta inválida\n");
                                }
                                else if (apostaNumero == numeroAposta) {
                                    System.out.println("\nVocê ganhou R$ 1.000,00 reais.\n");
                                } else {
                                    System.out.println("\nQue pena! O número sorteado foi: " + numeroAposta + "\n");
                                }
                        }
                        case 2 -> {
                            System.out.println("Aposta de A até Z selecionada.");
                            System.out.println("Escolha uma letra de A até Z para apostar.");
                            apostaLetra = scanner.next().toUpperCase().charAt(0);
                            if (!Character.isLetter(apostaLetra)) {
                                System.out.println("\nAposta inválida, tente novamente!\n");
                            } else {
                                if (apostaLetra == letraViciada) {
                                    System.out.println("\nVocê ganhou R$ 500,00 reais.\n");
                                } else {
                                    System.out.println("\nQue pena! A letra sorteada foi: " + letraViciada + "\n2");
                                }
                            }
                        }
                        case 3 -> {
                            System.out.println("Aposta entre par ou ímpar selecionada.");
                            System.out.println("Escolha um número inteiro para apostar:");
                                apostaParImpar = scanner.nextInt();   
                                if (apostaParImpar % 2 == 0) {
                                    System.out.println("\nVocê ganhou R$ 100,00 reais.\n");
                                } else {
                                    System.out.println("\nQue pena! O número digitado é ímpar e a premiação foi para números pares.\n");
                                }                   
                        }
                        case 0 -> System.out.println("\n**Saindo do programa, obrigado por jogar.**\n");
                        default -> System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (opcao != 0);
        }    
        
        catch (InputMismatchException e) {
            System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
        }
            
        scanner.close();
    }
}