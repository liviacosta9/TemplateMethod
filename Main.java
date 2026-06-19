// Main.java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Ana", "Tatiane", "Regina", "Alice"};

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(nomes));
        System.out.println("--------------------------------------------------");

        AbstractSorter sorterLastLetter = new OrdenacaoUltimaLetra();
        sorterLastLetter.sort(nomes);
        System.out.println("Ordenado pela última letra:");
        System.out.println(Arrays.toString(nomes)); 
        
        System.out.println("--------------------------------------------------");

        AbstractSorter sorterLength = new OrdenacaoTamanho();
        sorterLength.sort(nomes);
        System.out.println("Ordenado por tamanho da string:");
        System.out.println(Arrays.toString(nomes));
    }
}