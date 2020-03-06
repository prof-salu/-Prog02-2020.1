
package genericos;

public class DadoGenerico<E> {
   private E dado;
   
   public DadoGenerico(E dado){
       this.dado = dado;
   }
   
   public E getDado(){
       return this.dado;
   }
}
