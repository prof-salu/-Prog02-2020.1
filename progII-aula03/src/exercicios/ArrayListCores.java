
package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCores {
    public static void main(String[] args) {
        /*1.Escreva um programa em Java que crie um ArrayList
            chamado cores e adicione cinco cores diferentes (
         2. Percorra todos os elementos do ArrayList cores e os
            imprima na tela
         3. Adicione um nova cor na primeira posição da lista cores
         4. Remover o terceiro elemento da lista cores
         5. Ordenar o ArrayList de cores pelo nome*/
        
        //CTRL + SHIFT + I --> Corrigir os imports
        List<String> cores = new ArrayList<>();
        
        cores.add("Rosa");
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Roxo");
        cores.add("Preto");
        
        //For each
        for(String cor : cores){
            System.out.println(cor);
        }
        
        cores.add(0, "Laranja");
        
        System.out.println("");
        
        for(String cor : cores){
            System.out.println(cor);
        }
       
        cores.remove(2);
        
        System.out.println("");
        
        for(String cor : cores){
            System.out.println(cor);
        }
        
        //Ordena uma lista
        Collections.sort(cores);
        
        System.out.println("");
        
        for(String cor : cores){
            System.out.println(cor);
        }
        
//        for (int i = 0; i < cores.size(); i++){
//            System.out.println(cores.get(i));
//        }
        
//        int[] numeros = {1,2,3,4,5,6,7,8};
//        
//        for(int num : numeros){
//            System.out.println(num);
//        }
//        
//        
//        List<Par> pares = new ArrayList<>();
//        
//        Par<Integer, Integer> ponto1 = new Par<Integer, Integer>(5,8);
//        Par<Integer, Integer> ponto2 = new Par<Integer, Integer>(15,68);
//        Par<Integer, Integer> ponto3 = new Par<Integer, Integer>(25,38);
//        
//        pares.add(ponto1);
//        pares.add(ponto2);
//        pares.add(ponto3);
//        
//        for(Par x: pares){
//            System.out.println(x);
//        }
    }
}
