/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Pedro
 */
import java.net.*;
import javax.swing.*;

public class ServC {

    String tex, nam;

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }
    DatagramPacket pr;
    DatagramSocket s;
     String msg;
     String rep;
// Client clt =new Client();

    public void envoiReception() {
       
            try {
                byte[] rec = new byte[256];
                pr = new DatagramPacket(rec, rec.length);
                s = new DatagramSocket(9090);
                s.receive(pr);
                 msg = new String(rec, 0, pr.getLength());
//                System.out.println("Client : "+msg); 
//                System.out.println("Vous : ");
                rep = getTex();
                byte[] tr = rep.getBytes();
                InetAddress a = pr.getAddress();
                int p = pr.getPort();
                pr = new DatagramPacket(tr, tr.length, a, p);
                s.send(pr);
                s.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }

    public void Reception() {
        try {
            byte[] rec = new byte[256];
            pr = new DatagramPacket(rec, rec.length);
            s = new DatagramSocket(9090);
            s.receive(pr);
            msg = new String(rec, 0, pr.getLength());
        } catch (Exception e) {
        }
    }
    public void Afficher (JTextArea jta){
          jta.setText(jta.getText()+"Client :"+msg+"\n");
        jta.setText(jta.getText()+"Vous :"+rep+"\n");
    }
}
