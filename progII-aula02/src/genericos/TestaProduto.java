
package genericos;

public class TestaProduto {
    public static void main(String[] args) {
        Produto<Integer> p1 = new Produto<>(123, "Teclado", 345);
        Produto<String> p2 = new Produto<>("ABC12F", "Notebook", 4000);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}
