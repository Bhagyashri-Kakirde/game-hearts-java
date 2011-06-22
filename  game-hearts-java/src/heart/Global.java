/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heart;

import java.util.ArrayList;

/**
 *
 * @author mr_Hit
 */
public class Global {

    public static int Width = 900;
    public static int Height = 700;
    public static int Co = 0;
    public static int Ro = 1;
    public static int Chuon = 2;
    public static int Bich = 3;
    public static int J = 11;
    public static int Q = 12;
    public static int K = 13;
    public static int A = 14;
    public static ArrayList<LaBai> laBai = new ArrayList<LaBai>();

    public static void createLabai() {
        String s = "pictures/";
        String s2 = "pictures/b2.jpeg";
        int i = 0;
        laBai.add(new LaBai(s + "2s.gif", s2, i++, 2));
        laBai.add(new LaBai(s + "3s.gif", s2, i++, 3));
        laBai.add(new LaBai(s + "4s.gif", s2, i++, 4));
        laBai.add(new LaBai(s + "5s.gif", s2, i++, 5));
        laBai.add(new LaBai(s + "6s.gif", s2, i++, 6));
        laBai.add(new LaBai(s + "7s.gif", s2, i++, 7));
        laBai.add(new LaBai(s + "8s.gif", s2, i++, 8));
        laBai.add(new LaBai(s + "9s.gif", s2, i++, 9));
        laBai.add(new LaBai(s + "ts.gif", s2, i++, 10));
        laBai.add(new LaBai(s + "js.gif", s2, i++, J));
        laBai.add(new LaBai(s + "qs.gif", s2, i++, Q));
        laBai.add(new LaBai(s + "ks.gif", s2, i++, K));
        laBai.add(new LaBai(s + "as.gif", s2, i++, A));

        laBai.add(new LaBai(s + "2c.gif", s2, i++, 2));
        laBai.add(new LaBai(s + "3c.gif", s2, i++, 3));
        laBai.add(new LaBai(s + "4c.gif", s2, i++, 4));
        laBai.add(new LaBai(s + "5c.gif", s2, i++, 5));
        laBai.add(new LaBai(s + "6c.gif", s2, i++, 6));
        laBai.add(new LaBai(s + "7c.gif", s2, i++, 7));
        laBai.add(new LaBai(s + "8c.gif", s2, i++, 8));
        laBai.add(new LaBai(s + "9c.gif", s2, i++, 9));
        laBai.add(new LaBai(s + "tc.gif", s2, i++, 10));
        laBai.add(new LaBai(s + "jc.gif", s2, i++, J));
        laBai.add(new LaBai(s + "qc.gif", s2, i++, Q));
        laBai.add(new LaBai(s + "kc.gif", s2, i++, K));
        laBai.add(new LaBai(s + "ac.gif", s2, i++, A));

        laBai.add(new LaBai(s + "2d.gif", s2, i++, 2));
        laBai.add(new LaBai(s + "3d.gif", s2, i++, 3));
        laBai.add(new LaBai(s + "4d.gif", s2, i++, 4));
        laBai.add(new LaBai(s + "5d.gif", s2, i++, 5));
        laBai.add(new LaBai(s + "6d.gif", s2, i++, 6));
        laBai.add(new LaBai(s + "7d.gif", s2, i++, 7));
        laBai.add(new LaBai(s + "8d.gif", s2, i++, 8));
        laBai.add(new LaBai(s + "9d.gif", s2, i++, 9));
        laBai.add(new LaBai(s + "td.gif", s2, i++, 10));
        laBai.add(new LaBai(s + "jd.gif", s2, i++, J));
        laBai.add(new LaBai(s + "qd.gif", s2, i++, Q));
        laBai.add(new LaBai(s + "kd.gif", s2, i++, K));
        laBai.add(new LaBai(s + "ad.gif", s2, i++, A));

        laBai.add(new LaBai(s + "2h.gif", s2, i++, 2));
        laBai.add(new LaBai(s + "3h.gif", s2, i++, 3));
        laBai.add(new LaBai(s + "4h.gif", s2, i++, 4));
        laBai.add(new LaBai(s + "5h.gif", s2, i++, 5));
        laBai.add(new LaBai(s + "6h.gif", s2, i++, 6));
        laBai.add(new LaBai(s + "7h.gif", s2, i++, 7));
        laBai.add(new LaBai(s + "8h.gif", s2, i++, 8));
        laBai.add(new LaBai(s + "9h.gif", s2, i++, 9));
        laBai.add(new LaBai(s + "th.gif", s2, i++, 10));
        laBai.add(new LaBai(s + "jh.gif", s2, i++, J));
        laBai.add(new LaBai(s + "qh.gif", s2, i++, Q));
        laBai.add(new LaBai(s + "kh.gif", s2, i++, K));
        laBai.add(new LaBai(s + "ah.gif", s2, i++, A));
    }
}
