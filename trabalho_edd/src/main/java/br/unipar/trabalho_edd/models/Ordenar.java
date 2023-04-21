package br.unipar.trabalho_edd.models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ordenar {
    private ArrayList<Integer> listaNumeros = new ArrayList<>();

    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer listaNumeros) {
        this.listaNumeros.add(listaNumeros);
    }
    
    private void inclusaoValores(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            listaNumeros.add(vetor[i]);
        }
    }
    
//    public void inserirVetor(ArrayList<Integer> vetor){
//        for(int i=0;i<100;i++){
//            String opcao = JOptionPane.showInputDialog("Para adicionar um número(A) - Para sair(S): ");
//            
//            if(opcao.toUpperCase().equals("A")){
//                String inputValor = JOptionPane.showInputDialog("Informe o valor: ");
//                int valor = Integer.parseInt(inputValor);
//                vetor.add(valor);
//            }else if(opcao.toUpperCase()equals("S")){
//                i =101;
//            }
//        }
//    }
    
    
    public int[] inserirVetor(int[]vetor){
        String inputTam = JOptionPane.showInputDialog("Informe o tamanho do vetor: ");
        int tamanho = Integer.parseInt(inputTam);
        vetor = new int[tamanho];
                
        for(int i=0; i<vetor.length;i++){
            String inputValor = JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:");
            vetor[i] = Integer.parseInt(inputValor);
        }
        return vetor;
    }
    public void ordenacaoInsercao(int[]vetor){
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
    
    public void ordenacaoSelecao(int[]vetor){
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
    
    public void ordenacaoBolha(int[]vetor){
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
