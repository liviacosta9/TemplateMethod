// AbstractSorter.java
public abstract class AbstractSorter{

    /**
     * o template method vai definir o algoritmo de ordenação (bubble sort)
    ///o final garante que as subclasses não alterem a estrutura do algoritmo
     */
    public final void sort(String[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (compare(array[j], array[j + 1]) > 0){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /*
     * operaçao primitiva que deve ser implementada pelas subclasses
     * vai retornar > 0 se a for maior que b e < 0 se for menor e 0 se iguais
     */
    protected abstract int compare(String a, String b);
}