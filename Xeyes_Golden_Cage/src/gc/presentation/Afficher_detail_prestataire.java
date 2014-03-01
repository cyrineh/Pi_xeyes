/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.presentation;

import gc.dao.PrestataireDAO;
import gc.entities.Prestataire;
import java.io.File;

/**
 *
 * @author Cyrine
 */
public class Afficher_detail_prestataire extends javax.swing.JFrame {
    int id;
    Afficher_prestataire ap;
    /**
     * Creates new form Afficher_detail_prestataire
     */
    public Afficher_detail_prestataire() {
        initComponents();
        //this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //this.setResizable(false);
    }
    public Afficher_detail_prestataire(int id,Afficher_prestataire ap) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.id=id;
        this.ap=ap;
        
        PrestataireDAO pdao=new PrestataireDAO();
        
        Prestataire p=pdao.findPrestataireById(id);
        
        tfId.setText(String.valueOf(p.getId()));
        tfPseudo.setText(p.getPseudo());
         tfEmail.setText(p.getAdresse_mail());
        tfMotDePasse.setText(p.getMotDePasse()); 
        tfService.setText(p.getService());
        tfTel.setText(p.getTel());
        taDescription.setText(p.getDescription());
       
       // File file=new File(p.getLogo());
        //lphoto.setIcon(p.getl);
        
      
                
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfPseudo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfMotDePasse = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfService = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lphoto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 385));
        getContentPane().setLayout(null);

        jLabel2.setText("id :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 40, 30, 30);

        jLabel3.setText("Pseudo :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 80, 90, 30);

        jLabel4.setText("e-mail :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 120, 100, 30);

        jLabel5.setText("mot de passe :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 160, 90, 30);

        jLabel6.setText("adresse :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 280, 60, 30);

        jLabel7.setText("tel :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 200, 60, 30);

        jLabel8.setText("service :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 240, 60, 30);

        tfId.setEditable(false);
        getContentPane().add(tfId);
        tfId.setBounds(350, 40, 230, 30);

        tfPseudo.setEditable(false);
        getContentPane().add(tfPseudo);
        tfPseudo.setBounds(350, 80, 230, 30);

        tfEmail.setEditable(false);
        getContentPane().add(tfEmail);
        tfEmail.setBounds(350, 120, 230, 30);

        tfMotDePasse.setEditable(false);
        getContentPane().add(tfMotDePasse);
        tfMotDePasse.setBounds(350, 160, 230, 30);

        tfTel.setEditable(false);
        getContentPane().add(tfTel);
        tfTel.setBounds(350, 200, 230, 30);

        tfService.setEditable(false);
        getContentPane().add(tfService);
        tfService.setBounds(350, 240, 230, 30);

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 330, 130, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Details du prestataire");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 0, 230, 22);

        jLabel10.setText("Description");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 134, 150, 20);
        getContentPane().add(lphoto);
        lphoto.setBounds(30, 40, 90, 90);

        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 280, 230, 30);

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 210, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gc/presentation/1801091_595630270513775_1127831772_n.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ap.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Afficher_detail_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Afficher_detail_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Afficher_detail_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Afficher_detail_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Afficher_detail_prestataire().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lphoto;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfMotDePasse;
    private javax.swing.JTextField tfPseudo;
    private javax.swing.JTextField tfService;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
