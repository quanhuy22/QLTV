/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.User;
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
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
     * Test of checkUser method, of class LoginDAO.
     */
    @Test
    public void testCheckUser() throws Exception {
        System.out.println("checkUser");
        String username = "hieu";
        String password = "123";
        LoginDAO instance = new LoginDAO();
        
        User result = instance.checkUser(username, password);
         assertEquals(3, result.getId());
         assertEquals("hieu", result.getUsername());
         assertEquals("123", result.getPassword());
         assertEquals("Tran Trung Hieu", result.getName());
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testCheckUser1() throws Exception {
        System.out.println("checkUser");
        String username = "manager";
        String password = "123";
        LoginDAO instance = new LoginDAO();
        
        User result = instance.checkUser(username, password);
         assertEquals(1, result.getId());
         assertEquals("manager", result.getUsername());
         assertEquals("123", result.getPassword());
         assertEquals("Nguyen Nam Anh", result.getName());
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testCheckUser2() throws Exception {
        System.out.println("checkUser");
        String username = "hieu123";
        String password = "123";
        LoginDAO instance = new LoginDAO();
        
        User result = instance.checkUser(username, password);
         assertEquals(null, result);
        
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
