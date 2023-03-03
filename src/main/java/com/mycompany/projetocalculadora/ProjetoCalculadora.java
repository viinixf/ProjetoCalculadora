package com.mycompany.projetocalculadora;

import java.util.Scanner;

/**
 *
 * @author MarcusPC
 */
public class ProjetoCalculadora {

    public static void main(String[] args) {
        Opcoes opcoes = new Opcoes();
        Scanner input = new Scanner(System.in) ;
        int selecionadorDeOpcao;
        float valor1 = 0;
        float valor2 = 0;

        opcoes.mensagemMenuInicial();
        selecionadorDeOpcao = input.nextInt();

        while (selecionadorDeOpcao != 7) {
            opcoes.validaOpcoes(selecionadorDeOpcao, valor1, valor2);
            System.out.println("");
            opcoes.mensagemMenuInicial();
            selecionadorDeOpcao = input.nextInt();
        }
        System.out.println("Obrigado! Volte sempre!");
    }
}
