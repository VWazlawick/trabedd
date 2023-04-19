package br.unipar.trabalho_edd.models;

import java.util.ArrayList;

public class Ordenar {
    private ArrayList<Integer> listaNumeros = new ArrayList<>();
    int jInsercao,chave;
    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer listaNumeros) {
        this.listaNumeros.add(listaNumeros);
    }
    
    public void ordenacaoInsercao(int[]vetor){
        for(int i=0; i<vetor.length;i++){
            listaNumeros.add(vetor[i]);
        }
        for(int i=0; i<listaNumeros.size();i++){
            chave = listaNumeros.get(i);
            
            for(jInsercao = i-1; jInsercao>=0 && listaNumeros.get(jInsercao)>chave;jInsercao--){
                listaNumeros.set(jInsercao+1, listaNumeros.get(jInsercao));
            }
            listaNumeros.set(jInsercao+1, chave);
        }
    }

    @Override
    public String toString() {
        return "Ordenar{" + "listaNumeros=" + listaNumeros + '}';
    }
    
    
}
