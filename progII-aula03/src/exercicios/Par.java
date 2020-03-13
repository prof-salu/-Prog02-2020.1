
package exercicios;
/*Implemente uma classe Par que possa armazenar dois objetos
  declarados como tipos genéricos
*/
public class Par<T,U> {
    private T valor1;
    private U valor2;

    public Par(T val1, U val2) {
        this.valor1 = val1;
        this.valor2 = val2;
    }

    @Override
    public String toString() {
        return "Par{" + "valor01=" + valor1 + ", valor02=" + valor2 + '}';
    }
}
