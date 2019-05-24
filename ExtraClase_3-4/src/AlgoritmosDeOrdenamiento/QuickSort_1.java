/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

//import AlgoritmosDeOrdenamiento.RadixSort.Node;
import Lista.Nodo;
import java.util.*;
import Lista.LinkedList;

/**
 *
 * @author kejor
 */
public class QuickSort_1 
{
    
/**
 * Quick sort implementation for singly linked list.
 * Worst case complexity - O(n^2). Worst case is rare.
 * Preferred over merge sort as this is in-place sorting (requires no additional memory).
 */
    public static void Quick(LinkedList lista){
        //lista.setCabeza(RSort(lista.getCabeza()));
    }
    public Nodo quickSort(Nodo start, Nodo end){
        
        /* Exist condition */
        // If the list contains one or less node, return the start node itself.
        if(null == start || null == start.getSiguiente() || start == end){
            return start;
        }
        /* Partition the list */
        // Result contains start/end of left and right segments and the pivot.
        Nodo[] result = partition(start, end);
        /* Recur the left side */
        Nodo resultLeft = null; //Start of left result.
        if(null != result[0]) {
            resultLeft = quickSort(result[0], result[1]);
        }
        /* Recur the right side */
        Nodo resultRight = null; // Start of right result.
        if(null != result[3]){
            resultRight = quickSort(result[3], result[4]);
        }
        /* Connect the pivot to the start of right segmen */
        if(resultRight !=null) {
            result[2].setSiguiente(resultRight);
        }
        /* Return start of the list */
        if(null == resultLeft){
            // If left segment has nothing, return pivot.
            return result[2];
        }else{
            // Else return the start of left.
            return  resultLeft;
        }
    }
    /**
     * Partitioning.
     * <p>
     *     Details - Choose the last node as pivot.
     *     Traverse and move the nodes with bigger value than pivot to the right of pivot.
     * </p>
     * @param start
     * @param end
     * @return Array of nodes[Start of left, end of left, pivot, start of right, end of right]
     */
    private Nodo[] partition (Nodo start, Nodo end){
        /* Choose a pivot */
        // We are not moving pivot but the other nodes.
        Nodo pivot = end;
        /* Define the required pointers */
        // Tail points to the end of new list
        Nodo tail = end;
        // Start of newly arranged list
        Nodo newStart = null;
        // Iteration pointers
        Nodo current = start;
        Nodo previous = null;
        /* Iterate and move nodes */
        // Iterate the original list till the end.
        boolean isFirstNodeWithoutMove = true;
        int i = 0;
        while(null != current && end != current){
            Nodo next = (Nodo) current.getSiguiente();
            // For nodes with value grater than pivot move to the right of pivot.
            if(current.dato().compareTo(pivot.dato())< 0){
            /**LinkedList li = new LinkedList();
            int k = li.getindice((Comparable) pivot);
            if(li.get(i) < li.get(k)){**/
                // Move the current node to the end of the list.
                moveNodeToEnd(current, previous, tail);
                // Advance tail.
                tail = (Nodo) tail.getSiguiente();
            }else{
                if(isFirstNodeWithoutMove){
                    newStart = current;
                    isFirstNodeWithoutMove = false;
                }
                // Advance iteration pointers.
                if(null != previous){
                    previous.setSiguiente(current);
                }
                previous = current;
            }
            current = next;
        }
        /* Prepare result for returning */
        Nodo[] result = new Nodo[5];
        result[0] = newStart;
        result[1] = previous;
        result[2] = pivot;
        result[3] = (Nodo) pivot.getSiguiente();
        result[4] = tail;
        return result;
    }
    private void moveNodeToEnd(Nodo current, Nodo previous, Nodo tail) {
        if(null != previous){
            previous.setSiguiente(current.getSiguiente());
        }
        current.setSiguiente(null);
        tail.setSiguiente(current);
    }
}

