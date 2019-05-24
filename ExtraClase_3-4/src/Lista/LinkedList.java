
package Lista;

import java.util.NoSuchElementException;

/**
 * 
 * @author Bryan
 * @param <T> El tipo genérico de esta lista.
 */
public class LinkedList<T extends Comparable<T>>{
    private Nodo<T> cabeza;
    T max;
    private int tamano;

    /**
     * Constructor sin argumentos que inicializa una lista enlazada vacía.
     */
    public LinkedList(){
        tamano=0;
    }

    /**
     * Inserta el elemento especificado al principio de esta lista.
     * 
     * @param dato El elemento a ser agregado a esta lista.
     */
    public void add(T dato){
        max = (tamano() == 0) ? dato : (dato.compareTo(max) > 0) ? dato:max;
        cabeza = new Nodo<>(dato,cabeza);
        tamano++;
    }

    /**
     * Inserta los elementos de la matriz especificada para
     * El comienzo de esta lista.
     * 
     * @param a La matriz que se añadirá a esta lista.
     */
    public void add(T[] a){
        for(T dato:a)
            add(dato);
    }

    /**
     * Inserta el elemento especificado al final de esta lista.
     * 
     * @param dato El elemento a añadir a esta lista.
     */
    public void addUltimo(T dato){
        if(tamano() == 0)
            add(dato);
        else{
            max = (dato.compareTo(max) > 0) ? dato:max;
            Nodo<T> thisNode = cabeza;
            while(thisNode.esSiguiente())
                thisNode = thisNode.getSiguiente();
            thisNode.setSiguiente(new Nodo<>(dato));
            tamano++;
        }
    }

    /**
     * Inserta la lista como un nuevo nodo al final de esta lista.
     * 
     * @param list La lista que se adjuntará a esta lista.
     */
    public void adjuntar(LinkedList<T> list){
        while(list.tamano() > 0)
            addUltimo(list.remover());
    }
    
    /**
     * Elimina todos los elementos de esta lista.
     */
    public void limpiar(){
        cabeza = null;
        tamano = 0;
    }

    /**
     * Devuelve verdadero si esta lista contiene el elemento especificado.
     * 
     * @param dato El elemento a buscar.
     * @return si el elemento está o no contenido en esta lista.
     * @throws NoSuchElementException si esta lista esta vacia
     */
    public boolean contains(T dato) throws NoSuchElementException {
        if(tamano() == 0) throw new NoSuchElementException("Lista vacía");
        Nodo temp = cabeza;
        boolean noContiene=false;
        for(int i = 0; i < tamano() && !noContiene; i++){
            noContiene = (dato == null ? temp.dato() == null : temp.dato().equals(dato));
            temp = temp.getSiguiente();
        }
        return noContiene;
    }

    /**
     * Devuelve una nueva lista que contiene todos los elementos en esta lista.
     * 
     * @return una referencia a una copia de esta lista.
     * @throws NoSuchElementException si esta lista esta vacia
     */
    public LinkedList<T> copiar() throws NoSuchElementException{
        if(tamano() == 0) throw new NoSuchElementException("Lista vacía");
        LinkedList<T> copiar = new LinkedList<>();
        Nodo<T> temp = cabeza;
        copiar.addUltimo(temp.dato());
        while(temp.esSiguiente()){
            copiar.addUltimo(temp.getSiguiente().dato());
            temp = temp.getSiguiente();
        }
        return copiar;
    }

    /**
     * Devuelve el elemento en la posición especificada en esta lista.
     * 
     * @param index El índice en esta lista para recuperar el elemento.
     * @return La información contenida en el nodo en el índice especificado.
     * @throws IndexOutOfBoundsException Si el índice está fuera de los límites de esta lista.
     */
    public T get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= tamano()) throw new IndexOutOfBoundsException("'Get' Índice fuera de límites");
        Nodo<T> temp = cabeza;
        for(int i = 0; i < index; i++)
            temp = temp.getSiguiente();
        return temp.dato();
    }

    /**
     * Reemplaza el elemento en la posición especificada en esta lista.
     * 
     * @param index El índice en esta lista para reemplazar el elemento.
     * @param value El elemento a colocar en el índice.
     */
    public void set(int index, T value){
        if(index < 0 || index >= tamano()) throw new IndexOutOfBoundsException("'Set' Índice fuera de los límites");
        Nodo<T> temp = cabeza;
        if(index == 0){
            cabeza = new Nodo<>(value);
            cabeza.setSiguiente(temp.getSiguiente());
        }else{
            for(int i = 0; i < index-1; i++)
                temp = temp.getSiguiente();
            Nodo<T> siguiente = temp.getSiguiente().getSiguiente();
            Nodo<T> add = new Nodo<>(value);
            temp.setSiguiente(add);
            add.setSiguiente(siguiente);
        }
    }

    /**
     * Reemplaza la referencia principal de esta lista con el nodo especificado.
     * 
     * @param n El nodo para colocar en el campo principal de esta lista.
     */
    public void setCabeza(Nodo<T> n){
        cabeza = n;
    }

    /**
     * Intercambia los dos elementos en las posiciones especificadas en esta lista.
     * 
     * @param a el índice del primer elemento que se intercambiará en esta lista.
     * @param b El índice del segundo elemento que se intercambiará en esta lista.
     */
    public void intercambiar(int a,int b){
        T temp = get(a);
        set(a, get(b));
        set(b, temp);
    }

    /**
     * Devuelve el nodo principal de esta lista.
     * 
     * @return El elemento en el campo principal de esta lista.
     */
    public Nodo<T> getCabeza(){
        return cabeza;
    }

    /**
     * Devuelve el valor máximo en la lista enlazada.
     * 
     * @return El valor máximo contenido en está lista.
     */
    public T getMax(){
        return max;
    }

    /**
     * Elimina y devuelve el elemento principal de esta lista.
     * 
     * @return Los datos contenidos en el nodo eliminado.  
     * @throws NoSuchElementException si la lista está vacía
     */
    public T remover() throws NoSuchElementException{
        if(tamano() == 0) throw new NoSuchElementException("Lista vacía");
        Nodo<T> removerNodo = cabeza;
        cabeza = cabeza.getSiguiente();
        tamano--;
        return removerNodo.dato();
    }

    /**
     * Elimina el elemento de esta lista en el índice especificado.
     * Devuelve verdadero al completar
     * 
     * @param index El índice en esta lista para eliminar el elemento.
     * @return Los datos contenidos en el nodo eliminado.
     * @throws IndexOutOfBoundsException Si el índice está fuera de los límites de esta lista.
     */
    public T remover(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= tamano()) throw new IndexOutOfBoundsException("'remover' Índice fuera de los límites");
        if(index == 0) 
            return LinkedList.this.remover();
        Nodo<T> temp = cabeza;
        for(int i = 0; i < index-1; i++)
            temp = temp.getSiguiente();
        tamano--;
        T removedData = temp.getSiguiente().dato();
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        return removedData;
    }

    /**
     * Elimina todos los elementos duplicados en la lista.
     * 
     * @return una referencia a la lista que contiene todos los elementos no repetidos de esta lista.
     * @throws NoSuchElementException si esta lista esta vacía
     */
    public LinkedList<T> removerRepetidos() throws NoSuchElementException{
        if(tamano() == 0) throw new NoSuchElementException("Lista vacía");
        Nodo<T> temp = cabeza;
        Nodo<T> objetivo = cabeza;
        int contadorExterior = 0;
        while(objetivo.esSiguiente()){
            int contadorInterno = 1 + contadorExterior;
            while(temp.esSiguiente())
                if(temp.getSiguiente().dato().equals(objetivo.dato()))
                    remover(contadorInterno);
                else{
                    temp = temp.getSiguiente();
                    contadorInterno++;
                }
            if(objetivo.esSiguiente()){
                temp = objetivo.getSiguiente();
                objetivo = objetivo.getSiguiente();
            }
            contadorExterior++;
        }
        return this;
    }

    /**
     * Devuelve el número de elementos en la lista.
     * 
     * @return El tamaño de esta lista.
     */
    public int tamano(){
        return this.tamano;
    }
    
    @Override
    public String toString(){
        if(tamano() == 0) throw new NoSuchElementException("Lista vacía");
        String out = "[" + this.cabeza + "]";
        Nodo<T> temp = this.cabeza;
        int linea = 0;
        while(temp.esSiguiente()){
            if(linea == 100){
                out += "\n";
                linea = 0;
            }
            out += "[" + temp.getSiguiente() + "]";
            temp = temp.getSiguiente();
            linea++;
        }
        return out;
    }
}