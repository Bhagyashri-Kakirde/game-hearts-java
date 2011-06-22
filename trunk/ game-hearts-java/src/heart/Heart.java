/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heart;

/**
 *
 * @author mr_Hit
 */
public class Heart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Global.createLabai();
        BanChoi bc = new BanChoi();
        bc.createObject();
        bc.setBanChoi();
        bc.setVisible(true);
    }
}
