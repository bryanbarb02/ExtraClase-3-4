/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Bryan
 */
public class MergeSort {
    
    public static void Merge(LinkedList lista){
        lista.setCabeza(RSort(lista.getCabeza()));
    }
    
    // Merge recursivo
    private static Nodo sortedMerge(Nodo a,Nodo b){
        if(a == null)
            return b;
        if(b == null)
            return a;
        
        Nodo resultado;
        if(a.dato().compareTo(b.dato()) <= 0){
            resultado = a;
            resultado.setSiguiente(sortedMerge(a.getSiguiente(),b));
        }else{
            resultado = b;
            resultado.setSiguiente(sortedMerge(a,b.getSiguiente()));
        }
        return resultado;
    }

    private static Nodo RSort(Nodo n){
        // Caso base: si la cabeza es nula
        if(n == null || n.getSiguiente() == null)
            return n;
        Nodo medio = getMedio(n);
        Nodo siguienteDelMedio = medio.getSiguiente();

        medio.setSiguiente(null);

        Nodo izquierda = RSort(n);

        Nodo derecha = RSort(siguienteDelMedio);

        return sortedMerge(izquierda, derecha);
    }
    
    private static Nodo getMedio(Nodo n){
        if(n == null)
            return n;
        Nodo rapido = n.getSiguiente();
        Nodo lento = n;
        // Mueve rapido por dos y lento ptr por uno
        // Finalmente, elnto apuntará al nodo medio
        while(rapido != null){
            rapido = rapido.getSiguiente();
            if(rapido != null){
                lento = lento.getSiguiente();
                rapido = rapido.getSiguiente();
            }
        }
        return lento;
    }
    
}
