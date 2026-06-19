public class OrdenacaoTamanho extends AbstractSorter{

    @Override
    protected int compare(String a, String b){
        //retorna positivo se o tamanho de a for maior que b
        return Integer.compare(a.length(), b.length());
    }
    
}