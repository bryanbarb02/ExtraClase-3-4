/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

import Lista.InsertionSort;
import Lista.LinkedList;
import Lista.Nodo;
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

    /**
     * Test of Insertion method, of class InsertionSort.
     */   
    @Test
    public void testInsertion1() {
        System.out.println("testInsertion1");
        LinkedList insertion = new LinkedList();
        assertEquals(0 , insertion.tamano());
        InsertionSort.Insertion(insertion);

    }
    
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

    }
    
    @Test
    public void testInsertion3() {
        System.out.println("testInsertion3");
        LinkedList insertion = new LinkedList();
        insertion.add(5);       
        insertion.set(0, 99);   
        assertEquals(99, insertion.get(0));
        InsertionSort.Insertion(insertion);
    }
    
    @Test
    public void testInsertion4() {
        System.out.println("testInsertion4");
        LinkedList insertion = new LinkedList();
        insertion.add(1);
        insertion.remover(0);
        assertEquals(0 , insertion.tamano());
        InsertionSort.Insertion(insertion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInsertion5() {
        System.out.println("testInsertion5");
        LinkedList lista = null;
        InsertionSort.Insertion(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
