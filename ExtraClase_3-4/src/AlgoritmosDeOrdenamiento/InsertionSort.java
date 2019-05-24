
package Lista;

/**
 * 
 * @author Bryan
 */
public class InsertionSort {
    /**
     * 
     * @param lista 
     */
    public static void Insertion(LinkedList lista){
        for(int i = 1; i < lista.tamano(); i++)
            for(int j = i; j > 0 && (lista.get(j-1).compareTo(lista.get(j))) > 0; j--)
                lista.intercambiar(j, j-1);
    }
    
    
}
