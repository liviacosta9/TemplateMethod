// SortByLastLetter.java
public class OrdenacaoUltimaLetra extends AbstractSorter{

    @Override
    protected int compare(String a, String b){

        if (a.isEmpty() || b.isEmpty()) return 0;  //evitar erros c strings vazias

        char lastA = a.toLowerCase().charAt(a.length() - 1);
        char lastB = b.toLowerCase().charAt(b.length() - 1);
        
        return Character.compare(lastA, lastB);
    }
}