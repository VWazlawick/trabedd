package br.unipar.trabalho_edd.models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ordenar {
    private ArrayList<Integer> listaNumeros = new ArrayList<>();
    private long tempoTotal;
    private String msg = "";
    //ArrayList criada para manter o vetor original na main e nesta array ordenar ela
    //Msg feita para retorno quando usuário seleciona para retornar todos os métodos
    

    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer listaNumeros) {
        this.listaNumeros.add(listaNumeros);
    }

    public long getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(long tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
            
    private void inclusaoValores(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            listaNumeros.add(vetor[i]);
        }
    }
    //Método usado para fazer uma copia do vetor original para ser ordenado
      
    private String imprimirVetor(int[]vetor){
        String msgRetorno = "";
        for(int i=0;i<vetor.length;i++){
            msgRetorno += vetor[i]+",";
        }
        return msgRetorno;
    }
    //Faz uma String com os valores que estão no vetor original para impressão 
        
    public int[] inserirVetor(int[]vetor){
        String inputTam = JOptionPane.showInputDialog("Informe o tamanho do vetor: ");
        int tamanho = Integer.parseInt(inputTam);
        vetor = new int[tamanho];
                
        for(int i=0; i<vetor.length;i++){
            String inputValor = JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:");
            vetor[i] = Integer.parseInt(inputValor);
        }
        inclusaoValores(vetor);
        return vetor;
        
    }
    //Método inserirVetor serve para o usuário inserir o tamanho do vetor selecionado 
    //e inserir os valores segundo o tamanho escolhido
    
    public void ordenacaoInsercao(int[]vetor){
        int j,chave;           
        
        long inicio = System.currentTimeMillis();
        for(int i=1; i<listaNumeros.size();i++){
            chave = listaNumeros.get(i);
            
            for(j= i-1; j>=0 && listaNumeros.get(j)>chave;j--){
                listaNumeros.set(j+1, listaNumeros.get(j));
            }
            listaNumeros.set(j+1, chave);
        }
        long fim = System.currentTimeMillis();
        
        this.tempoTotal = fim-inicio;
        
        msg += "\nORDENAÇÃO POR INSENRÇÃO" + "\nLista Inicial: " + "["+ imprimirVetor(vetor) + "]" + "\nLista Ordenada: " + this.listaNumeros 
                + "\nTempo execução: " + this.tempoTotal;
    }
    //Método de ordenação por inserção, tem o calculo do tempo dentro dele e o preenchimento da váriavel msg com 
    //vetor original, o vetor ordenado e o tempo total
    
    public void ordenacaoSelecao(int[]vetor){
        long inicio = System.currentTimeMillis();
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
        long fim = System.currentTimeMillis();
        this.tempoTotal = fim-inicio;
        
        msg += "\nORDENAÇÃO POR SELEÇÃO" + "\nLista Inicial: " + "["+ imprimirVetor(vetor) + "]" + "\nLista Ordenada: " + this.listaNumeros 
                + "\nTempo execução: " + this.tempoTotal;
    }
    //Método de ordenação por seleção, tem o calculo do tempo dentro dele e o preenchimento da váriavel msg com 
    //vetor original, o vetor ordenado e o tempo total
    
    public void ordenacaoBolha(int[]vetor){       
        long inicio = System.currentTimeMillis();
        
        for(int i=0; i<listaNumeros.size()-1;i++){
            for(int j=0; j<listaNumeros.size()-i-1; j++){
                if(listaNumeros.get(j)>listaNumeros.get(j+1)){
                    int aux = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j+1));
                    listaNumeros.set(j+1, aux);
                }
            }
        }
        long fim = System.currentTimeMillis();
        
        this.tempoTotal = fim-inicio;
        
        msg += "\nORDENAÇÃO BOLHA" + "\nLista Inicial: " + "[" + imprimirVetor(vetor) + "]"+ "\nLista Ordenada: " + this.listaNumeros 
                + "\nTempo execução: " + this.tempoTotal;
    }
    //Método de ordenação bolha, tem o calculo do tempo dentro dele e o preenchimento da váriavel msg com 
    //vetor original, o vetor ordenado e o tempo total
    
    

    @Override
    public String toString() {
        return msg;
    }
    //Feito alteração no toString para retornar a váriavel msg já formatada
    
    
}
