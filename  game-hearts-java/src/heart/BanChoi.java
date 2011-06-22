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
    private Color bgColor;
    private JPanel mainPanel;
    private NguoiChoi west;
    private NguoiChoi north;
    private NguoiChoi east;
    private NguoiChoi you;

    public BanChoi() {
        status = new JLabel();
        bgColor = new Color(40, 100, 15);
        mainPanel = new JPanel(null);
        west = new NguoiChoi();
        north = new NguoiChoi();
        east = new NguoiChoi();
        you = new NguoiChoi();
    }

    protected void chiaBai() {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < 52; ++i) {
            data.add(i);
        }

        while (data.size() > 0) {
            Random rand = new Random();
            this.getWest().getQuanbai().add(data.remove(Math.abs(rand.nextInt()) % data.size()));
            this.getNorth().getQuanbai().add(data.remove(Math.abs(rand.nextInt()) % data.size()));
            this.getEast().getQuanbai().add(data.remove(Math.abs(rand.nextInt()) % data.size()));
            this.getYou().getQuanbai().add(data.remove(Math.abs(rand.nextInt()) % data.size()));
        }
    }

    protected void setBanChoi() {
        //sets panel in center
        mainPanel.setBackground(this.bgColor);

        this.getWest().name = new JLabel("You");
        this.getWest().name.setBounds((Global.Width / 2) - 40,
                this.getHeight() - 110, 100, 50);
        this.getWest().name.setForeground(Color.white);

        this.getNorth().name = new JLabel("West");
        this.getNorth().name.setBounds(20, 110, 100, 50);
        this.getNorth().name.setForeground(Color.white);
        this.getEast().name = new JLabel("North");
        this.getEast().name.setBounds(400, 1, 100, 30);
        this.getEast().name.setForeground(Color.white);
        this.getYou().name = new JLabel("East");
        this.getYou().name.setBounds(this.getWidth() - 100, 110, 100, 50);
        this.getYou().name.setForeground(Color.white);

        mainPanel.add(this.getWest().name);
        mainPanel.add(this.getNorth().name);
        mainPanel.add(this.getEast().name);
        mainPanel.add(this.getYou().name);
        //chia bài
        chiaBai();
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
        index  = this.getWest().getQuanbai();
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
        index = this.getNorth().getQuanbai();
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
        index = this.getEast().getQuanbai();
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
        index = this.getYou().getQuanbai();
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

    /**
     * @return the west
     */
    public NguoiChoi getWest() {
        return west;
    }

    /**
     * @param west the west to set
     */
    public void setWest(NguoiChoi west) {
        this.west = west;
    }

    /**
     * @return the north
     */
    public NguoiChoi getNorth() {
        return north;
    }

    /**
     * @param north the north to set
     */
    public void setNorth(NguoiChoi north) {
        this.north = north;
    }

    /**
     * @return the east
     */
    public NguoiChoi getEast() {
        return east;
    }

    /**
     * @param east the east to set
     */
    public void setEast(NguoiChoi east) {
        this.east = east;
    }

    /**
     * @return the you
     */
    public NguoiChoi getYou() {
        return you;
    }

    /**
     * @param you the you to set
     */
    public void setYou(NguoiChoi you) {
        this.you = you;
    }
}
