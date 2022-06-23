/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.BookStat;
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
public class BookStatDAOTest {
    
    public BookStatDAOTest() {
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
     * Test of getBookStatistic method, of class BookStatDAO.
     */
    @Test
    public void testGetBookStatistic() throws Exception {
        System.out.println("getBookStatistic");
        String startDate = "2022-01-01";
        String endDate = "2022-03-31";
        BookStatDAO instance = new BookStatDAO();
        
        List<BookStat> result = instance.getBookStatistic(startDate, endDate);
        assertEquals("Lap Trinh C", result.get(0).getTitle());
        assertEquals(1, result.get(0).getBookId());
        assertEquals(2, result.get(0).getBorrowedTime());
        
        
        assertEquals("Lap Trinh Huong Doi Tuong", result.get(1).getTitle());
        assertEquals(2, result.get(1).getBookId());
        assertEquals(1, result.get(1).getBorrowedTime());
        
      
        assertEquals("Doraemon", result.get(2).getTitle());
        assertEquals(5, result.get(2).getBookId());
        assertEquals(2, result.get(2).getBorrowedTime());
        
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
     @Test
    public void testGetBookStatistic1() throws Exception {
        System.out.println("getBookStatistic");
        String startDate = "2022-01-01";
        String endDate = "2022-02-28";
        BookStatDAO instance = new BookStatDAO();
        List<BookStat> expResult = null;
        List<BookStat> result = instance.getBookStatistic(startDate, endDate);
        assertTrue(result.isEmpty());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
