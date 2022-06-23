/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import models.Book;
import models.BookCopy;
import models.BorrowingTurn;
import models.CallCard;
import models.CallCardDetail;
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
public class CallCardDAOTest {
    
    public CallCardDAOTest() {
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
     * Test of getCallCArdID method, of class CallCardDAO.
     */
    @Test
    public void testGetCallCArdID() throws Exception {
        System.out.println("getCallCArdID");
        CallCardDAO instance = new CallCardDAO();
        int expResult = 8;
        int result = instance.getCallCArdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addCallCardItem method, of class CallCardDAO.
     */
    @Test
    public void testAddCallCardItem() throws Exception {
        System.out.println("addCallCardItem");
        CallCard callcard = new CallCard(7,"2022-05-11","2022-11-11",5,3);
        List<BookCopy> listBookCopy = new ArrayList<BookCopy>();
        //
        
        //
        listBookCopy.add(new BookCopy(25, new Book(3, "Kimetsu No Yaiba")));
        CallCardDAO instance = new CallCardDAO();
        instance.addCallCardItem(callcard,listBookCopy );
        
    }
        // TODO review the generated test code and remove the default call to fail.
        
    

    /**
     * Test of updateBookCopy method, of class CallCardDAO.
     */
    @Test
    public void testUpdateBookCopy() throws Exception {
        System.out.println("updateBookCopy");
        List<BookCopy> listBookCopy = new ArrayList<BookCopy>();
        listBookCopy.add(new BookCopy(25, new Book(3, "Kimetsu No Yaiba")));
        CallCardDAO instance = new CallCardDAO();
        instance.updateBookCopy(listBookCopy);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    
    /**
     * Test of submit method, of class CallCardDAO.
     */
    @Test
    public void testSubmit() throws Exception {
       
        
        System.out.println("submit");
        CallCard callcard = new CallCard(8,"2022-05-11","2022-11-11",5,3);
        List<BookCopy> listBookCopy = new ArrayList<BookCopy>();
        listBookCopy.add(new BookCopy(25, new Book(3, "Kimetsu No Yaiba")));
        CallCardDAO instance = new CallCardDAO();
        instance.submit(callcard, listBookCopy);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
//
//    /**
//     * Test of getBorrowList method, of class CallCardDAO.
//     */
 @Test
    public void testGetBorrowList() throws Exception {
        System.out.println("getBorrowList");
        String startDate = "2022-01-01";
        String endDate = "2022-05-04";
        int bookId = 1;
        CallCardDAO instance = new CallCardDAO();
       
        List<BorrowingTurn> result = instance.getBorrowList(startDate, endDate, bookId);
        assertEquals("Lap Trinh C", result.get(0).getTitle());
        assertEquals(12, result.get(0).getBookcopyId());
        assertEquals("2022-03-08", result.get(0).getborrowingDate());
        assertEquals("2022-03-15", result.get(0).getdueDate());
        assertEquals(1, result.get(0).getCallcardId());
        
              
        assertEquals("Lap Trinh C", result.get(1).getTitle());
        assertEquals(15, result.get(1).getBookcopyId());
        assertEquals("2022-03-08", result.get(1).getborrowingDate());
        assertEquals("2022-03-15", result.get(1).getdueDate());
        assertEquals(2, result.get(1).getCallcardId());
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
     
    

    

