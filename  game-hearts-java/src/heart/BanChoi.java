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
public class BanChoi extends JFrame implements Observer, Runnable {

    private JLabel status;
    private JLabel memA, memB, memC, memD;
    private Color bgColor;
    private JPanel mainPanel;

    public BanChoi() {
        status = new JLabel();
        memA = new JLabel();
        memB = new JLabel();
        memC = new JLabel();;
        memD = new JLabel();
        bgColor = new Color(40, 100, 15);
        mainPanel = new JPanel(null);
    }

    protected void setBanChoi() {
        //sets panel in center
        mainPanel.setBackground(this.bgColor);
        
        memA = new JLabel("Y");
        memA.setBounds((Global.Width / 2) - 40,
                this.getHeight() - 110, 100, 50);
        memA.setForeground(Color.white);

        memB = new JLabel("West");
        memB.setBounds(20, 110, 100, 50);
        memB.setForeground(Color.white);
        memC = new JLabel("North");
        memC.setBounds(400, 1, 100, 30);
        memC.setForeground(Color.white);
        memD = new JLabel("East");
        memD.setBounds(this.getWidth() - 100, 110, 100, 50);
        memD.setForeground(Color.white);

        mainPanel.add(memA);
        mainPanel.add(memB);
        mainPanel.add(memC);
        mainPanel.add(memD);
        //set card positions
        ArrayList<Integer> index;
        LaBai Temp;
        int x, y, plus;
        int Width = Global.laBai.get(0).getSize().width;

        // --- bottom ---
        x = Global.Width - 320;
        y = Global.Height - 120 - Width;
        plus = -30;
        index = new ArrayList<Integer>();
        index.add(0);
        index.add(1);
        index.add(2);
        index.add(3);
        index.add(4);
        index.add(5);
        index.add(6);
        index.add(7);
        index.add(8);
        index.add(9);
        index.add(10);
        index.add(11);
        index.add(12);
        for (int i = 0; i < index.size(); ++i) {
            Temp = Global.laBai.get(index.get(i));
            Temp.setLocation(x, y);
            Temp.setIsUp(true);
            Temp.setVisible(true);
            Temp.setBorder(null);
            mainPanel.add(Temp);
            x += plus;
        }

        // --- left ---
        x = 20;
        y = 150;
        plus = 20;
        index.clear();
        index.add(13);
        index.add(14);
        index.add(15);
        index.add(16);
        index.add(17);
        index.add(18);
        index.add(19);
        index.add(20);
        index.add(21);
        index.add(22);
        index.add(23);
        index.add(24);
        index.add(25);
        for (int i = 0; i < index.size(); ++i) {
            Temp = Global.laBai.get(index.get(i));
            Temp.setLocation(x, y);
            Temp.setIsUp(false);
            Temp.setVisible(true);
            Temp.setBorder(null);
            mainPanel.add(Temp);
            y += plus;
        }

        // --- top ---
        x = Global.Width - 320;
        y = 30;
        plus = -30;
        index.clear();
        index.add(26);
        index.add(27);
        index.add(28);
        index.add(29);
        index.add(30);
        index.add(31);
        index.add(32);
        index.add(33);
        index.add(34);
        index.add(35);
        index.add(36);
        index.add(37);
        index.add(38);
        for (int i = 0; i < index.size(); ++i) {
            Temp = Global.laBai.get(index.get(i));
            Temp.setLocation(x, y);
            Temp.setIsUp(false);
            Temp.setVisible(true);
            Temp.setBorder(null);
            mainPanel.add(Temp);
            x += plus;
        }

        // --- right ---
        x = Global.Width - Width - 30;
        y = 150;
        plus = 20;
        index.clear();
        index.add(39);
        index.add(40);
        index.add(41);
        index.add(42);
        index.add(43);
        index.add(44);
        index.add(45);
        index.add(46);
        index.add(47);
        index.add(48);
        index.add(49);
        index.add(50);
        index.add(51);
        for (int i = 0; i < index.size(); ++i) {
            Temp = Global.laBai.get(index.get(i));
            Temp.setLocation(x, y);
            Temp.setIsUp(false);
            Temp.setVisible(true);
            Temp.setBorder(null);
            mainPanel.add(Temp);
            y += plus;
        }

        //add to JFrame
        if (this.getContentPane().getComponentCount() > 1) {
            this.getContentPane().remove(1);
        }
        this.add(mainPanel, BorderLayout.CENTER);
    }

    protected void createObject() {


        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Hearts");
        setLocation(50, 50);
        setSize(Global.Width, Global.Height);
        setLayout(new BorderLayout());

        //khoi tao phan menu 
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //newGame();
            }
        });
        file.add(newGame);
        file.addSeparator();
        JMenuItem score = new JMenuItem("Score");
        score.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //showPoints();
            }
        });
        file.add(score);
        file.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(exit);


        menu.add(file);
        this.setJMenuBar(menu);

        //sets status
        JToolBar status = new JToolBar();
        JLabel l = new JLabel("wellcome to hearts game");
        l.setForeground(Color.BLUE);
        status.add(l);
        this.status = new JLabel(" ");
        this.status.setForeground(Color.RED);
        status.add(this.status);
        status.setSize(this.getWidth() - 2, 100);
        this.add(status, BorderLayout.SOUTH);
        //this.add(this.mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
