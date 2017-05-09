/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author cody
 */
public class MainMenu extends JPanel
{
    //  Components
    JFrame frame;
    ImageIcon bg;
    
    
    //  Constructors
    public MainMenu()
    {
        setFrame();
        init();
    }
    
    //  Set owner to be the App
    private void setFrame()
    {
        frame = (JFrame) SwingUtilities.getWindowAncestor(this);   
    }
    
    //  Initialization of Panel
    private void init()
    {
        //  Set Properties
        setVisible(true);
        setOpaque(false);
        setBackground(Color.BLUE);
        bg = new ImageIcon("src/assets/mmBackground.jpg");
        
        
        //  Set Layout
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();
        
        
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        
        
        addComp(new JPanel(), c, 0, 0);
        addComp(new JPanel(), c, 1, 1);
        addComp(new JPanel(), c, 2, 2);
        addComp(new JPanel(), c, 3, 3);
        addComp(new JPanel(), c, 4, 4);
        addComp(new JPanel(), c, 5, 5);
        addComp(new JPanel(), c, 6, 6);
        addComp(new JPanel(), c, 7, 7);
        addComp(new JPanel(), c, 8, 8);
        
        addComp(new JButton("Hello"), c, 3, 2);
        
        
    }
    
    //  NOTE:  MUST ASSIGN OTHER CONSTRAINTS BEFORE USING THIS
    private void addComp(Component comp, GridBagConstraints c, int x, int y)
    {
        c.gridx = x;
        c.gridy = y;
        add(comp, c);
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(bg.getImage(), 0, 0, null);
        super.paint(g);
    }
    
}
