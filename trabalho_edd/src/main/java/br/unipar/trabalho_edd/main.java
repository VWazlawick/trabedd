package br.unipar.trabalho_edd;

import br.unipar.trabalho_edd.models.Ordenar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();
        
        Ordenar o1 = new Ordenar();
        
        String input = JOptionPane.showInputDialog("Qual método de ordenação deseja visualizar: "
                + " Ordenação por Inserção(I), Ordenação por Seleção(S) ou Ordenação Bolha(B)");
        
        
        
        
        switch (input.toUpperCase()) {
            case "I":
                o1.ordenacaoInsercao(vetor);
                break;
            case "S":
                o1.ordenacaoSelecao(vetor);
                break;
            case "B":
                o1.ordenacaoBolha(vetor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        
        System.out.println(o1.toString());
        
        
    }
}
