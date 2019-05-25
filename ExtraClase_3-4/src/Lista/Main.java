
import AlgoritmosDeOrdenamiento.RadixSort;
import Lista.InsertionSort;
import Lista.LinkedList;
import Lista.MergeSort;
//import Lista.QuickSort;
import Lista.QuickSort_1;

/**
 *
 * @author Bryan
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("InsertionSort: ");
        LinkedList insertion = new LinkedList();
        insertion.add(5);
        insertion.add(4);
        insertion.add(9);
        insertion.add(1);
        insertion.add(15);
        insertion.add(2);
        insertion.add(8);
        insertion.set(0, 99);
        
        System.out.println(insertion);
        InsertionSort.Insertion(insertion);
        System.out.println(insertion + "\n");
        
        System.out.println("MergeSort");
        LinkedList merge = new LinkedList();
        merge.add(6);
        merge.add(9);
        merge.add(4);
        merge.add(1);
        merge.add(5);
        merge.add(2);
        merge.add(8);
        
        System.out.println(merge);
        MergeSort.Merge(merge);        
        System.out.println(merge + "\n");
        
        
        System.out.println("QuickSort");
        LinkedList quick = new LinkedList();
        quick.add(0);
        quick.add(45);
        quick.add(65);
        quick.add(3);
        quick.add(76);
        quick.add(23);
        quick.add(87);
        quick.add(82);
        
        
        
        
        System.out.println(quick);
        System.out.println(quick + "\n");
        
//        System.out.println("RadixSort");
//        LinkedList radix = new LinkedList();
//        radix.add(45);
//        radix.add(65);
//        radix.add(23);
//        radix.add(76);
//        radix.add(23);
//        radix.add(87);
//        radix.add(82);
//        
//        System.out.println(radix);
////        RadixSort.radix();
//        System.out.println(radix + "\n");
        
    }
    
}
