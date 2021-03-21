/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import javax.swing.*;
import java.net.*;
import javax.swing.*;

/**
 *
 * @author Pedro
 */
public class Client {

    String nom, texto;
    String env;
    String repo;
    DatagramPacket p;
    DatagramSocket s;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void EnvRecept() {
        while (true) {
            try {
//                System.out.println("Vous: ");
                env = getTexto();
                byte[] te = env.getBytes();
                byte[] i = new byte[]{127, 0, 0, 1};
                p = new DatagramPacket(te, te.length, InetAddress.getByAddress(i), 9090);
                s = new DatagramSocket();
                s.send(p);
                te = new byte[256];
                p = new DatagramPacket(te, te.length);
                s.receive(p);
                env = new String(te, 0, p.getLength());
//               System.out.println("Serveur : "+env);
                s.close();

            } catch (Exception e) {
            }

        }
    }

    public void recp() {
        while (true) {
            try {
                byte[] te = new byte[256];
                p = new DatagramPacket(te, te.length);
                s.receive(p);
                repo = new String(te, 0, p.getLength());
//               System.out.println("Serveur : "+env);
                s.close();
            } catch (Exception e) {
            }

        }
    }

    public void afficher(JTextArea jta) {
        jta.setText(jta.getText() + "Vous : " + env + "\n");
        jta.setText(jta.getText() + "Serveur : " + repo + "\n");
    }
}
