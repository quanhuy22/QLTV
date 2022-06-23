/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HieuTT
 */
public class LibcardDAOTest {
    
    public LibcardDAOTest() {
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
     * Test of checkValidLibCardId method, of class LibcardDAO.
     */
    @Test
    public void testCheckValidLibCardId() throws Exception {
        System.out.println("checkValidLibCardId");
        int libCardId = 4;
        LibcardDAO instance = new LibcardDAO();
        boolean expResult = true;
        boolean result = instance.checkValidLibCardId(libCardId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    @Test
     public void testCheckValidLibCardId1() throws Exception {
        System.out.println("checkValidLibCardId");
        int libCardId = 1;
        LibcardDAO instance = new LibcardDAO();
        boolean expResult = false;
        boolean result = instance.checkValidLibCardId(libCardId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
