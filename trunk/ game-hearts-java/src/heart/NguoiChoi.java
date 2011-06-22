/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heart;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author mr_Hit
 */
public class NguoiChoi {
    public JLabel name;
    public int point;
    private ArrayList<Integer> quanbai;
    public NguoiChoi ()
    {
        quanbai= new ArrayList<Integer>();
        name = new JLabel();
    }

    /**
     * @return the quanbai
     */
    public ArrayList<Integer> getQuanbai() {
        return quanbai;
    }

    /**
     * @param quanbai the quanbai to set
     */
    public void setQuanbai(ArrayList<Integer> quanbai) {
        this.quanbai = quanbai;
    }
}
