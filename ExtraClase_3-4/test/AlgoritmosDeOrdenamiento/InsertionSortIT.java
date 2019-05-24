
package AlgoritmosDeOrdenamiento;

import Lista.InsertionSort;
import Lista.LinkedList;
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
public class InsertionSortIT {
    
    /**
     * testInsertion1 Comprueba que la lista esta vacía
     */
    @Test
    public void testInsertion1() {
        System.out.println("testInsertion1");
        LinkedList insertion = new LinkedList();
        assertEquals(0 , insertion.tamano());
        InsertionSort.Insertion(insertion);

    }
    
    /**
     * testInsertion2() Comprueba la cantidad de elementos de tiene la lista
     */
    @Test
    public void testInsertion2() {
        System.out.println("testInsertion2");
        LinkedList insertion = new LinkedList();
        insertion.add(5);
        insertion.add(4);
        insertion.add(9);
        insertion.add(1);
        insertion.add(15);
        insertion.add(2);
        insertion.add(8);
        assertEquals(7, insertion.tamano());    
        InsertionSort.Insertion(insertion);
        assertEquals(7, insertion.tamano());
    }
    
    /**
     * testInsertion3() Inserta un nuevo valor en el íncice seleccionado
     */
    @Test
    public void testInsertion3() {
        System.out.println("testInsertion3");
        LinkedList insertion = new LinkedList();
        insertion.add(5);       
        insertion.set(0, 99);   
        assertEquals(99, insertion.get(0));
        InsertionSort.Insertion(insertion);
        assertEquals(99, insertion.get(0));
    }
    
    /**
     * testInsertion4() Remueve un nodo según el indice seleccionado
     */
    @Test
    public void testInsertion4() {
        System.out.println("testInsertion4");
        LinkedList insertion = new LinkedList();
        insertion.add(1);
        insertion.remover(0);
        assertEquals(0 , insertion.tamano());
        InsertionSort.Insertion(insertion);
    }
    
    /**
     * testInsertion5() Comprueba que se ordenó la lista correctamente
     */
    @Test
    public void testInsertion5() {
        System.out.println("testInsertion5");
        LinkedList insertion = new LinkedList();
        insertion.add(2);
        insertion.add(3);
        insertion.add(1);
        InsertionSort.Insertion(insertion);
        assertEquals(1, insertion.get(0));
        assertEquals(2, insertion.get(1));
        assertEquals(3, insertion.get(2));  
    }
    
    public InsertionSortIT() {
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
