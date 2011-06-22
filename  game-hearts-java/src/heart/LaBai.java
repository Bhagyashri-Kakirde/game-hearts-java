/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heart;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author mr_Hit
 */
public class LaBai extends JButton implements ActionListener {

    private int index;
    private int cardType;
    private int value;
    private int width;
    private int height;
    private ImageIcon up;
    private ImageIcon down;
    private boolean isUp;
    
    public void mousedMove(int pX, int pY) {
        int x = this.getLocation().x;
        int y = this.getLocation().y;

        if (x <= pX && (y + this.width) >= pX
                && y <= pY && (y + this.height) >= pY) {
            setIsUp(true);
        } else {
            setIsUp(false);
        }
    }

    public LaBai() {
    }

    public LaBai(String imageUp, String imageDown, int index, int cardType) {
        this.index = index;
        this.cardType = cardType;
        this.up = new ImageIcon(imageUp);
        this.down = new ImageIcon(imageDown);
        this.isUp = false;
        this.width = this.up.getIconWidth() + 2;
        this.height = this.up.getIconHeight() + 2;
        this.setSize(this.width, this.height);
        this.addActionListener(this);
        
        this.setContentAreaFilled(false);
       
    }

    public void createObject(String imageUp, String imageDown, int index, int cardType) {
        this.index = index;
        this.cardType = cardType;
        this.up = new ImageIcon(imageUp);
        this.down = new ImageIcon(imageDown);
        this.isUp = false;
        this.width = this.up.getIconWidth() + 2;
        this.width = this.up.getIconHeight() + 2;
        this.setSize(this.width, this.height);
        this.addActionListener(this);
        this.setContentAreaFilled(false);
        
    }

    @Override
    public boolean mouseMove(Event evt, int x, int y) {
       int X = this.getLocation().x;
        int Y = this.getLocation().y;

        if (X <= x && (X + this.width) >= x
                && Y <= y && (Y + this.height) >= y) {
            {
                setIsUp(true);
                return true;
            }
        } else {
            setIsUp(false);
            return false;
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param isUp the isUp to set
     */
    public void setIsUp(boolean isUp) {
        this.isUp = isUp;
        if (isUp == true) {
            this.setIcon(up);
        } else {
            this.setIcon(down);
        }
    }
}
