package br.unipar.trabalho_edd.models;

import java.util.ArrayList;

public class Ordenar {
    private ArrayList<Integer> listaNumeros = new ArrayList<>();

    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer listaNumeros) {
        this.listaNumeros.add(listaNumeros);
    }
    
    private void inclusaoValores(ArrayList<Integer> vetor){
        for(int i=0;i<vetor.size();i++){
            listaNumeros.add(vetor.get(i));
        }
    }
    
    public void ordenacaoInsercao(ArrayList<Integer> vetor){
        int j,chave;
        
        inclusaoValores(vetor);
        
        for(int i=1; i<listaNumeros.size();i++){
            chave = listaNumeros.get(i);
            
            for(j= i-1; j>=0 && listaNumeros.get(j)>chave;j--){
                listaNumeros.set(j+1, listaNumeros.get(j));
            }
            listaNumeros.set(j+1, chave);
        }
    }
    
    public void ordenacaoSelecao(ArrayList<Integer> vetor){
        inclusaoValores(vetor);
        
        for(int i=0;i<listaNumeros.size()-1;i++){
            int posMenor = i;
            
            for(int j=i+1;j<listaNumeros.size();j++){
                if(listaNumeros.get(j)<listaNumeros.get(posMenor)){
                    posMenor = j;
                }
            }
            if(posMenor!=i){
                int aux = listaNumeros.get(posMenor);
                listaNumeros.set(posMenor, listaNumeros.get(i));
                listaNumeros.set(i, aux);
            }
        }
    }
    
    public void ordenacaoBolha(ArrayList<Integer> vetor){
        inclusaoValores(vetor);
        
        for(int i=0; i<listaNumeros.size()-1;i++){
            for(int j=0; j<listaNumeros.size()-i-1; j++){
                if(listaNumeros.get(j)>listaNumeros.get(j+1)){
                    int aux = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j+1));
                    listaNumeros.set(j+1, aux);
                }
            }
        }
    }
    
    

    @Override
    public String toString() {
        return "Ordenar{" + "listaNumeros=" + listaNumeros + '}';
    }
    
    
}
