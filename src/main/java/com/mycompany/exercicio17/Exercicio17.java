package com.mycompany.exercicio17;

import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog(
                "Escolha uma profissão:\n"
                + "e - Engenheiro\n"
                + "m - Médico\n"
                + "d - Designer\n"
                + "p - Programador\n"
                + "a - Advogado\n"
        );

        String profissao;

        switch (opcao) {
            case "e":
                profissao = "Engenheiro";
                break;

            case "m":
                profissao = "Médico";
                break;

            case "d":
                profissao = "Designer";
                break;

            case "p":
                profissao = "Programador";
                break;

            case "a":
                profissao = "Advogado";
                break;

            default:
                profissao = "DESEMPREGADO";
                break;

        }

        JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao);

    }
}
