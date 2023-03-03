package com.mycompany.projetocalculadora;

import java.util.Scanner;

/**
 *
 * @author MarcusPC
 */
public class Opcoes {

    public void mensagemMenuInicial() {
        System.out.println("-----CALCULADORA-----");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da divisão");
        System.out.println("6 - Porcentagem de um valor");
        System.out.println("7 - Sair");
        System.out.println("Digite uma opção: ");
    }

    public void validaOpcoes(int opcao, float valor1, float valor2) {

        Scanner input = new Scanner(System.in);
        Operadores operadores = new Operadores();
        if (opcao == 1) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado da adição é: " + operadores.soma(valor1, valor2));
        }
        if (opcao == 2) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado da subtração é: " + operadores.subtracao(valor1, valor2));
        }
        if (opcao == 3) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado da multiplicação é: " + operadores.multiplicacao(valor1, valor2));
        }
        if (opcao == 4) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado da divisão é: " + operadores.divisao(valor1, valor2));
        }
        if (opcao == 5) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado do resto da divisão é: " + operadores.restoDaDivisao(valor1, valor2));
        }
        if (opcao == 6) {
            System.out.println("Digite o valor 1: ");
            valor1 = input.nextFloat();
            System.out.println("Digite o valor 2: ");
            valor2 = input.nextFloat();
            System.out.println("O resultado da porcentagem é: " + operadores.porcentagemDeUmValor(valor1, valor2));
        }

    }

}
