package br.unipar.trabalho_edd;

import br.unipar.trabalho_edd.models.Ordenar;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        int[]vetor = {90,23,12,43,54,75};
        
        Ordenar o1 = new Ordenar();
        
        o1.ordenacaoInsercao(vetor);
        
        System.out.println(o1.toString());
        
        
    }
}
