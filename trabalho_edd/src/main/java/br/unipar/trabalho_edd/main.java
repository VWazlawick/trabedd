package br.unipar.trabalho_edd;

import br.unipar.trabalho_edd.models.Ordenar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int[]vetor = null;
        String msg ="";
                
        Ordenar o1 = new Ordenar();
        
        String input = JOptionPane.showInputDialog("Qual método de ordenação deseja visualizar: "
                + " Ordenação por Inserção(I), Ordenação por Seleção(S) ou Ordenação Bolha(B)");
        
        
        
        
        switch (input.toUpperCase()) {
            case "I":
                vetor = o1.inserirVetor(vetor);
                o1.ordenacaoInsercao(vetor);
                break;
            case "S":
                vetor = o1.inserirVetor(vetor);
                o1.ordenacaoSelecao(vetor);
                break;
            case "B":
                vetor = o1.inserirVetor(vetor);
                o1.ordenacaoBolha(vetor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        
        for(int i=0; i<vetor.length;i++){
            msg += vetor[i] + ",";
        }
        
        System.out.println("Primeira lista: {" + msg + "}" +"\nLista Ordenada: " + o1.toString());
        
    }
}
