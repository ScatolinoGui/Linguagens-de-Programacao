package main.java.loto;

/**
 * @author Guilherme Pereira Scatolino
 * @since 28/03/2024
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("**************************");
        System.out.println("*****Menu LOTOFÁCIL:******");
        System.out.println("1) Apostar de 0 até 100");
        System.out.println("2) Apostar de A até Z");
        System.out.println("3) Apostar em par ou ímpar");
        System.out.println("0) Sair");
        System.out.println("**************************");

        System.out.print("Escolha uma opção para jogar: ");
        opcao = scanner.nextInt();

        try {
            switch (opcao) {
                case 1:
                    aposta1();
                    break;
                case 2:
                    aposta2();
                    break;
                case 3:
                    aposta3();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close();
    }

    private static void aposta1() {

        int apostaNumero;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aposta de 0 até 100 selecionada.");
        System.out.print("Escolha um número de 0 até 100 para apostar: ");
        int numeroAposta = random.nextInt(101);
        apostaNumero = scanner.nextInt();
        if (apostaNumero > 100) {
            System.out.println("\nAposta inválida\n");
        } else if (apostaNumero == numeroAposta) {
            System.out.println("\nVocê ganhou R$ 1.000,00 reais.\n");
        } else {
            System.out.println("\nQue pena! O número sorteado foi: " + numeroAposta + "\n");
        }
        scanner.close();
    }

    private static void aposta2() {

        char apostaLetra;
        char letraViciada = 'G';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aposta de A até Z selecionada.");
        System.out.print("Escolha uma letra de A até Z para apostar: ");
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
        scanner.close();
    }

    private static void aposta3() {

        int apostaParImpar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aposta entre par ou ímpar selecionada.");
        System.out.print("Escolha um número inteiro para apostar: ");
        apostaParImpar = scanner.nextInt();
        if (apostaParImpar % 2 == 0) {
            System.out.println("\nVocê ganhou R$ 100,00 reais.\n");
        } else {
            System.out.println("\nQue pena! O número digitado é ímpar e a premiação foi para números pares.\n");
        }
        scanner.close();
    }
}