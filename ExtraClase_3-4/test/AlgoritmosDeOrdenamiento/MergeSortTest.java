
package AlgoritmosDeOrdenamiento;

import Lista.LinkedList;
import Lista.MergeSort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan
 */
public class MergeSortTest {
        
    /**
     * testInsertion1 Comprueba que la lista esta vacía
     */
    @Test
    public void testMerge1() {
        System.out.println("testInsertion1");
        LinkedList merge = new LinkedList();
        assertEquals(0 , merge.tamano());
        MergeSort.Merge(merge);

    }
    
    /**
     * testInsertion2() Comprueba la cantidad de elementos de tiene la lista
     */
    @Test
    public void testMerge2() {
        System.out.println("testInsertion2");
        LinkedList merge = new LinkedList();
        merge.add(5);
        merge.add(4);
        merge.add(9);
        merge.add(1);
        merge.add(15);
        merge.add(2);
        merge.add(8);
        assertEquals(7, merge.tamano());    
        MergeSort.Merge(merge);
        assertEquals(7, merge.tamano());
    }
    
    /**
     * testInsertion3() Inserta un nuevo valor en el íncice seleccionado
     */
    @Test
    public void testMerge3() {
        System.out.println("testInsertion3");
        LinkedList merge = new LinkedList();
        merge.add(5);       
        merge.set(0, 99);   
        assertEquals(99, merge.get(0));
        MergeSort.Merge(merge);
        assertEquals(99, merge.get(0));
    }
    
    /**
     * testInsertion4() Remueve un nodo según el indice seleccionado
     */
    @Test
    public void testMerge4() {
        System.out.println("testInsertion4");
        LinkedList merge = new LinkedList();
        merge.add(1);
        merge.remover(0);
        assertEquals(0 , merge.tamano());
        MergeSort.Merge(merge);
    }
    
    /**
     * testInsertion5() Comprueba que se ordenó la lista correctamente
     */
    @Test
    public void testMerge5() {
        System.out.println("testInsertion5");
        LinkedList merge = new LinkedList();
        merge.add(2);
        merge.add(3);
        merge.add(1);
        MergeSort.Merge(merge);
        assertEquals(1, merge.get(0));
        assertEquals(2, merge.get(1));
        assertEquals(3, merge.get(2));  
    }
    
    public MergeSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
}
