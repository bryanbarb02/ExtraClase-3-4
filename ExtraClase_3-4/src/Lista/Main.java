/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;
//import AlgoritmosDeOrdenamiento.*;

/**
 *
 * @author Bryan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(5);
        l.add(4);
        l.add(9);
        l.add(1);
        
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));
//        System.out.println("");
//        
//        l.swap(1, 2);
        
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println("");
        System.out.println("Insertion");
//        InsertionSort.Insertion(l);
//        System.out.println("Insertion");
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));
//        System.out.println("");
        
//          MergeSort.Merge(l);
        System.out.println("Quik");
        QuickSort.Quick(l);
        
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println("");
        
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));
        
        
    }
    
}
