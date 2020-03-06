
package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TestaLista {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", 8.5f);
        Aluno a2 = new Aluno("Ana", 8f);
        Aluno a3 = new Aluno("Maria", 10f);
        Aluno a4 = new Aluno("Pedro", 7f);
        Aluno a5 = new Aluno("Bob", 9f);
        
        Aluno[] lista1 = new Aluno[5];
        lista1[0] = a1;
        lista1[1] = a2;
        lista1[2] = a3;
        lista1[3] = a4;
        lista1[4] = a5;
        //lista1[5] = a1;//ERRO
        
        List<Aluno> lista2 = new ArrayList<Aluno>();
        lista2.add(a1);
        lista2.add(a2);
        lista2.add(a1);
        lista2.add(a3);
        lista2.add(a1);
        lista2.add(a4);
        lista2.add(a1);
        lista2.add(a5);
        //lista2.add("Aluno"); Apenas podemos inserir objetos do tipo Aluno
        
        System.out.println("Tamanho da lista: " + lista2.size());
        System.out.println("Posicao 3 da lista: " + lista2.get(3));
        
        for(int i = 0; i < lista2.size(); i++){
            System.out.println(lista2.get(i));
        }
        
        lista2.remove(3);
        lista2.remove(a1);
      
        
        System.out.println("Apos a remocao dos elementos");
        
         for(int i = 0; i < lista2.size(); i++){
            System.out.println(lista2.get(i));
        }
        
    }
}
