/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.SupplierDetail;
import models.SupplierStat;
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
public class SupplierStatDAOTest {
    
    public SupplierStatDAOTest() {
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
     * Test of getSupplierStatistic method, of class SupplierStatDAO.
     */
    @Test
    public void testGetSupplierStatistic() throws Exception {
        System.out.println("getSupplierStatistic");
        String startDate = "2022-01-01";
        String endDate = "2022-03-31";
        SupplierStatDAO instance = new SupplierStatDAO();
        
        List<SupplierStat> result = instance.getSupplierStatistic(startDate, endDate);
         assertEquals("Nha sach Phuong Nam", result.get(0).getNOSupplier());
        assertEquals(1, result.get(0).getIDSupplier());
        assertEquals(2, result.get(0).getImportedTime());
        
        
        assertEquals("Nha Sach Nha Nam", result.get(1).getNOSupplier());
        assertEquals(2, result.get(1).getIDSupplier());
        assertEquals(1, result.get(1).getImportedTime());
        
        assertEquals("Nha Sach Kim Dong", result.get(2).getNOSupplier());
        assertEquals(3, result.get(2).getIDSupplier());
        assertEquals(3, result.get(2).getImportedTime());
        
        assertEquals("Nha Sach Tien Tho", result.get(3).getNOSupplier());
        assertEquals(4, result.get(3).getIDSupplier());
        assertEquals(1, result.get(3).getImportedTime());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testGetSupplierStatistic1() throws Exception {
        System.out.println("getSupplierStatistic");
        String startDate = "2022-01-01";
        String endDate = "2022-02-28";
        SupplierStatDAO instance = new SupplierStatDAO();
        List<SupplierStat> expResult = null;
        List<SupplierStat> result = instance.getSupplierStatistic(startDate, endDate);
        assertTrue(result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
     public void testGetSupplierStatistic2() throws Exception {
        System.out.println("getSupplierStatistic");
        String startDate = "2022-02-28";
        String endDate = "2022-01-01";
        SupplierStatDAO instance = new SupplierStatDAO();
        List<SupplierStat> expResult = null;
        List<SupplierStat> result = instance.getSupplierStatistic(startDate, endDate);
        assertTrue(result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSupplierDetail method, of class SupplierStatDAO.
     */
    @Test
    public void testGetSupplierDetail() throws Exception {
        System.out.println("getSupplierDetail");
        String startDate = "2022-01-01";
        String endDate = "2022-03-31";
        int SupplierID = 1;
        SupplierStatDAO instance = new SupplierStatDAO();
        
        List<SupplierDetail> result = instance.getSupplierDetail(startDate, endDate, SupplierID);
        assertEquals("Nha sach Phuong Nam", result.get(0).getNameSupplier());
        assertEquals("2022-03-05", result.get(0).getImportDate());
        assertEquals(2, result.get(0).getAmount());
        assertEquals(40000.0, result.get(0).getTotalCost(), 0.0);
        
        
        assertEquals("Nha sach Phuong Nam", result.get(1).getNameSupplier());
        assertEquals("2022-03-03", result.get(1).getImportDate());
        assertEquals(3, result.get(1).getAmount());
        assertEquals(60000.0, result.get(1).getTotalCost(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
   
    
}
