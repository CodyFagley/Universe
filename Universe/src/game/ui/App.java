/*
 *  App.java
 *  Cody Fagley
 *  May 8, 2017
 */

//  Contains the implementation for opening the main game window
package game.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author cody
 */
public class App extends JFrame
{   
    
    //  Constructors
    public App()
    {
        init();
    }
    
    
    //  Initialize the Game's Window
    private void init()
    {
        setTitle("Exploration: Universe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBounds(this.getGraphicsConfiguration().getBounds());
        
        setVisible(true);
        
        getContentPane().add(new MainMenu());
    }
    
    
}
