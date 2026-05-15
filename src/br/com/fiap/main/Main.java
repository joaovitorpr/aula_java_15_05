package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                int  opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de mensagem.\n1.Informação\n2.Aviso"));
                switch (opcao){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Mensagem de Informação","Informação",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem de aviso", "Aviso", JOptionPane.WARNING_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opção inválida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO",JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "OH VIADO!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
