
package Lista;

/**
 *
 * @author Bryan
 * @param <T> El tipo genérico de este nodo.
 */

public class Nodo<T extends Comparable<T>> {    
    
    /*
    * La 'T extends Comparable <T>' restringe
     * a los tipos que implementan 'Comparable <T>'
     */
    
    private final T DATO;
    private Nodo<T> siguiente;
    
    public Nodo(T dato){
        this.DATO = dato;
    }
    
    public Nodo(T dato, Nodo n){
        DATO = dato;
        siguiente = n;
    }
    
    public T dato(){
        return this.DATO;
    }
    
    public boolean esSiguiente(){
        return this.siguiente != null;
    }
    
    public Nodo<T> getSiguiente(){
        return this.siguiente;
    }
    
    public boolean setSiguiente(Nodo<T> n) {
        this.siguiente = n;
        return true;
    }
    
    @Override
    public String toString(){
        return DATO.toString();
    }    
}