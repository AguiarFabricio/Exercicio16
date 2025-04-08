/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio16;

/**
 *
 * @author Fabricio de Aguiar Implemente uma calculadora, primeiro peça 2
 * números ao usuário (um de cada vez) e apresente as seguintes opções: adição
 * subtração Mostre o resultado após a operação. (JAVA) EXERCÍCIO 16
 * multiplicação divisão
 */
import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {
        int numero1, numero2;
        double resultado = 0;
        boolean operacaoValida = true;

        JOptionPane.showMessageDialog(null, "Vamos calcular! Digite dois números:");

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        String menu = """
                Escolha a operação:
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                """;
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

        String nomeOperacao = "";

        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                nomeOperacao = "adição";
                break;
            case 2:
                resultado = numero1 - numero2;
                nomeOperacao = "subtração";
                break;
            case 3:
                resultado = numero1 * numero2;
                nomeOperacao = "multiplicação";
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    nomeOperacao = "divisão";
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "O resultado da " + nomeOperacao + " é: " + resultado);
        }
    }
}
