package com.mycompany.projetocalculadora;


/**
 *
 * @author MarcusPC
 */
public class Operadores {

    public float soma(float a, float b) {
        return a + b;
    }

    public float subtracao(float a, float b) {
        return a - b;
    }

    public float multiplicacao(float a, float b) {
        return a * b;
    }

    public float divisao(float a, float b) {
        return a / b;
    }

    public float restoDaDivisao(float a, float b) {
        return a % b;
    }

    public float porcentagemDeUmValor(float a, float b) {
        return (a * b) / 100;
    }

}
