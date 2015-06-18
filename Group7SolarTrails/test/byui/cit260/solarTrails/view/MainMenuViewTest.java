/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiatt-Adam
 */
public class MainMenuViewTest {
    
    public MainMenuViewTest() {
    }

    /**
     * Test of displayMenu method, of class MainMenuView.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        MainMenuView instance = new MainMenuView();
        instance.display();

    }

    /**
     * Test of getInput method, of class MainMenuView.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        MainMenuView instance = new MainMenuView();
        String expResult = "N";
        String result = instance.getInput();
        assertEquals(expResult, result);

    }

    /**
     * Test of doAction method, of class MainMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char choice = 'N';
        MainMenuView instance = new MainMenuView();
        instance.doAction(choice);

    }
    
}
