/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tchatapp;

/**
 *
 * @author Pedro
 */
import java.net.*;
import javax.swing.*;
import java.io.*;
//import java.net.*;
//import javax.swing.*;

public class Serveur extends javax.swing.JFrame {

//    static byte[] tab;
//    static byte[] A;
//    static DatagramPacket PQ;
//    static DatagramSocket SC;
//    static String TXTO;
    static ServerSocket sock;
    static Socket sc;
    static DataInputStream dtin;
    static DataOutputStream dtout;
 static String Nom1;

    public Serveur() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SMSZERO");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        jTMessage = new javax.swing.JTextField();
        BtAnnuler = new javax.swing.JButton();
        BtEnvoi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 162, 164));

        msgArea.setColumns(20);
        msgArea.setFont(new java.awt.Font("Verdana Ref", 0, 14)); // NOI18N
        msgArea.setLineWrap(true);
        msgArea.setRows(5);
        msgArea.setWrapStyleWord(true);
        msgArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        jScrollPane1.setViewportView(msgArea);

        jTMessage.setFont(new java.awt.Font("Verdana Ref", 0, 14)); // NOI18N
        jTMessage.setText("Entrer le message ici");
        jTMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMessageMouseClicked(evt);
            }
        });

        BtAnnuler.setFont(new java.awt.Font("Verdana Ref", 0, 14)); // NOI18N
        BtAnnuler.setText("Effacer la discussion");
        BtAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAnnulerActionPerformed(evt);
            }
        });

        BtEnvoi.setBackground(new java.awt.Color(0, 0, 51));
        BtEnvoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tchatapp/ok.png"))); // NOI18N
        BtEnvoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEnvoiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tchatapp/main.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("SERVEUR");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("CHAT-APP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setText("                       The G.A.D developping club");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(48, 48, 48))
        );

        jMenuBar1.setBackground(new java.awt.Color(5, 97, 5));

        jMenu1.setText("Options");

        jMenuItem1.setText("Nouveau message");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Enregistrer contact");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Inserer");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Appeler");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMessageMouseClicked
        // TODO add your handling code here:
        jTMessage.setText("");
    }//GEN-LAST:event_jTMessageMouseClicked

    private void BtEnvoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEnvoiActionPerformed
        // TODO add your handling code here:
        if (!jTMessage.getText().equals("")) {
            try {
               String msgout = "";
            msgout = jTMessage.getText();
            msgArea.setText(msgArea.getText()+"Moi: "+msgout+"\n");
            dtout.writeUTF(msgout);
                
                
                
                
                
                
                
                
                
//                String rep = jTMessage.getText();
//                byte[] tr = rep.getBytes();
//                InetAddress a = PQ.getAddress();
//                int p = PQ.getPort();
//               PQ = new DatagramPacket(tr, tr.length, a, p);
//                SC.send(PQ);
//                msgArea.setText(msgArea.getText()+"Vous : "+rep);
//                SC.close();
//                while (this.isActive()) {
//                    tab = new byte[256];
//                    PQ = new DatagramPacket(tab, tab.length);
//                    SC = new DatagramSocket(9090);
//                    SC.receive(PQ);
//                    String msg = new String(tab, 0, PQ.getLength());
//                    msgArea.setText(msgArea.getText() + "Client : " + msg);
//                }
            } catch (Exception e) {
                   System.out.println("Erreur" +e.getMessage());
            }
            jTMessage.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez remplir  le champs", "Impossible d'envoyer un message vide", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_BtEnvoiActionPerformed

    private void BtAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAnnulerActionPerformed
        // TODO add your handling code here:
        jTMessage.setText(null);
        msgArea.setText(null);
    }//GEN-LAST:event_BtAnnulerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cette fonctionalité sera disponible a la version suivante");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");;
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Serveur().setVisible(true);
            }
        });
        String magin = "";
        try {
                 
           sock = new ServerSocket(9090); // serveur static sur le port numéro 1203
            sc =  sock.accept(); // maintenant le serveur acceptera la connxion
            dtin = new DataInputStream(sc.getInputStream());
            dtout = new DataOutputStream(sc.getOutputStream());
            
            while(!magin.equals("exit")){
                
                magin =  dtin.readUTF();
              msgArea.setText(msgArea.getText()+"Client :"+magin+"\n");// afficher les message chez le client
                
            }
            
            
            
            
            
            
            
            
            
            
            
//            tab = new byte[256];
//                    PQ = new DatagramPacket(tab, tab.length);
//                    SC = new DatagramSocket(9090);
//                    SC.receive(PQ);
//                    String msg = new String(tab, 0, PQ.getLength());
//                    msgArea.setText(msgArea.getText() + "Client : " + msg);
        } catch (Exception e) {
        }
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAnnuler;
    private javax.swing.JButton BtEnvoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTMessage;
    private static javax.swing.JTextArea msgArea;
    // End of variables declaration//GEN-END:variables
}
