package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String nome;
        int opcao;
        float valorHoraTrabalho, adicionalnoturno, comissao;
        long cnpj;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de usuário deseja calcular o salário?\n1.Vigia Noturno\n2.Vendedor\n3.Freelancer"));
                switch (opcao){
                    case 1:
                        nome = JOptionPane.showInputDialog("Insirá o nome do Vigia");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Imforme a carga de trabalho do vigia"));
                        adicionalnoturno = Float.parseFloat(JOptionPane.showInputDialog("Imforme o adicional noturno do vigia"));
                        VigiaNoturno isthatfreedyfazbear = new VigiaNoturno(nome, valorHoraTrabalho, adicionalnoturno);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nHoras trabalhadas: %.2f\nSalário atual: %.2f", isthatfreedyfazbear.getNome(), isthatfreedyfazbear.getValorHoraTrabalho(), isthatfreedyfazbear.calcularSalario()), "Imformação",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Imforme o nome do Vendedor");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Insirá a carga de trabalho do vendedor"));
                        comissao = Float.parseFloat(JOptionPane.showInputDialog("Insirá o valor da comissão do vendedor"));
                        Vendedor vend = new Vendedor(nome, valorHoraTrabalho, comissao);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nHoras trabalhadas: %.2f\nValor da comissão: %.2f\nSalário atual: %.2f", vend.getNome(), vend.getValorHoraTrabalho(), vend.getComissao(),vend.calcularSalario()), "Imformação",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Imforme o nome do Freelancer");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Insirá a carga de trabalho do Freelancer"));
                        cnpj = Long.parseLong(JOptionPane.showInputDialog("Imforme o CNPJ do Freelancer"));
                        Freelancer fre = new Freelancer(nome, valorHoraTrabalho, cnpj);
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nHoras trabalhadas: %.2f\nCNPJ: %d\nSalário atual: %.2f", fre.getNome(), fre.getValorHoraTrabalho(), fre.getCNPJ(), fre.calcularSalario()), "Imformação",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
        while (JOptionPane.showConfirmDialog(null, "Deseja continuar o programa?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Programa encerrado!\nObrigado e volte sempre!");
    }
}
