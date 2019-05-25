
package Lista;

/**
 *
 * @author Kevin Rodriguez
 */
public class QuickSort {
    
    public static void Quick(LinkedList list){
//        list.cabeza = quickSort(list.cabeza, null);
//        quickSort(list.getCabeza(), null);

    }
    
    private static Nodo quickSort(Nodo L, Nodo R){
        Nodo pivot = getMedio(L,R);
        Nodo Lswap = L;
        Nodo Rswap = pivot.getSiguiente();
        while(Lswap.esSiguiente() && Rswap.esSiguiente() && !Lswap.getSiguiente().equals(pivot))
            if(Rswap.dato().compareTo(pivot.dato()) < 0)
                if(Lswap.dato().compareTo(pivot.dato()) >= 0){
                    intercambiar(Lswap, Rswap);
                    break;
                }else {
                    Lswap = Lswap.getSiguiente();
                }
        return pivot;
    }
    private static Nodo getMedio(Nodo n, Nodo R){
        if(n == null)
            return n;
        
        Nodo rapido = n.getSiguiente();
        Nodo lento = n;

        while(rapido != null && !rapido.equals(R)){
            rapido = rapido.getSiguiente();
            if(rapido != null && !rapido.equals(R)){
                lento = lento.getSiguiente();
                rapido = rapido.getSiguiente();
            }
        }
        return lento;
    }
    public static Nodo getUltimo(Nodo n, Nodo R){
        if(n == null)
            return n;
        Nodo ultimo = n;
        while(ultimo.esSiguiente() && !ultimo.getSiguiente().equals(R))
            ultimo = ultimo.getSiguiente();
        return ultimo;
    }
    
    private static void intercambiar(Nodo L, Nodo R){
        Nodo temp = L;
        L = R;
        R = temp;
    }
    
}
