/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Fabian Fallas
 */
public class BubbleSort {
    
    private int tamano;
    Nodo primero;
    
    public int bubbleSort(LinkedList list) {
        int R = tamano - 2;
        boolean swapped = true;
        int amountOfSwaps = 0;

        while (R >= 0 && swapped) {
            swapped = false;
            Nodo node = primero;
            for (int i = 0; i <= R; i++) {
                if (node.item.compareTo(node.nextNode.item) > 0) {
                    swapped = true;
                    swap(node, node.siguiente);
                    amountOfSwaps++;
                }
                node = node.nextNode;
            }
            R--;
        }
        return amountOfSwaps;
    }
    
    public void swap(Nodo currentNode, Nodo nextNode) {
        Item item = currentNode.item;
        currentNode.item = nextNode.item;
        nextNode.item = item;
    }
    
}
