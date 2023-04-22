package br.unipar.trabalho_edd;

import br.unipar.trabalho_edd.models.Ordenar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int[]vetor = null;   
                
        Ordenar o1 = new Ordenar();
        
        String input = JOptionPane.showInputDialog("Qual método de ordenação deseja visualizar: "
                + " Ordenação por Inserção(I), Ordenação por Seleção(S), Ordenação Bolha(B) ou comparar todos(T)");
        //Solicitado ao usuário método que deseja visualizar
        
        
        //Switch vai ler quando o método que o usuário escolheu e rodar os métodos de execução
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
            case "T":
                vetor = o1.inserirVetor(vetor);
                o1.ordenacaoInsercao(vetor);
                o1.ordenacaoSelecao(vetor);
                o1.ordenacaoBolha(vetor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }

        
        
        JOptionPane.showMessageDialog(null, o1.toString());
        
    }
}
