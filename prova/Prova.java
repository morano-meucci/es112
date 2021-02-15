/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author 39334
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstensioneThread puf = new EstensioneThread("Dotto");
        EstensioneThread puf2 = new EstensioneThread("Brontolo");
        EstensioneThread puf3 = new EstensioneThread("Pisolo");
        EstensioneThread puf4 = new EstensioneThread("Mammolo");
        EstensioneThread puf5 = new EstensioneThread("Gongolo");
        EstensioneThread puf6 = new EstensioneThread("Eolo");
        EstensioneThread puf7 = new EstensioneThread("Cucciolo");
        puf.start();
        puf2.start();
        puf3.start();
        puf4.start();
        puf5.start();
        puf6.start();
        puf7.start();
        Runnable puf8 = new Thread2("nani");
        Thread anc = new Thread(puf8);
        anc.start();
    }

}
