/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.presentation;

import gc.dao.PrestataireDAO;
import gc.entities.Prestataire;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Cyrine
 */
public class Inscription_prestataire extends javax.swing.JFrame {

    /**
     * Creates new form Ajout_prestataire
     */
    public Inscription_prestataire() {
        initComponents();
        //this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

   
    public boolean monNumeroEstValide(String monNumero)
            {
                    return monNumero.matches("[0-9]{8}");
                }
 
public static boolean isValiEmail(String mail)
{
    
    return ((mail.indexOf('.')>mail.indexOf('@')) && (mail.indexOf('@') > -1));
    
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
        tfPseudo = new javax.swing.JTextField();
        tfAdresseMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfAdresse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfLogo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbService = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        btnValider = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        tfMotDePasse = new javax.swing.JPasswordField();
        tfMotDePasseConf = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription");
        setPreferredSize(new java.awt.Dimension(600, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inscription");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 10, 140, 22);

        jLabel3.setText("Pseudo: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 70, 30);
        getContentPane().add(tfPseudo);
        tfPseudo.setBounds(110, 50, 170, 30);
        getContentPane().add(tfAdresseMail);
        tfAdresseMail.setBounds(420, 50, 170, 30);

        jLabel4.setText("adresse e-mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 50, 110, 30);

        jLabel5.setText("mot de passe: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 100, 90, 30);

        jLabel6.setText("Confirmation:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 100, 80, 20);

        jLabel7.setText("adresse:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 150, 60, 30);
        getContentPane().add(tfAdresse);
        tfAdresse.setBounds(110, 150, 170, 30);

        jLabel8.setText("Logo: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 150, 90, 20);
        getContentPane().add(tfLogo);
        tfLogo.setBounds(420, 150, 140, 30);

        jLabel9.setText("Service");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 200, 60, 30);
        getContentPane().add(tfTel);
        tfTel.setBounds(420, 200, 170, 30);

        jLabel10.setText("tel:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 200, 40, 20);

        cbService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Robe", "Lune de miel", "Gastronomie", "Salle de fete" }));
        cbService.setToolTipText("Robe\nLune de miel\nGastronomie\nSalle de fete");
        getContentPane().add(cbService);
        cbService.setBounds(110, 200, 170, 30);

        jLabel11.setText("Description: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 250, 80, 14);

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 250, 310, 50);

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });
        getContentPane().add(btnValider);
        btnValider.setBounds(480, 320, 110, 23);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(360, 320, 110, 23);
        getContentPane().add(tfMotDePasse);
        tfMotDePasse.setBounds(110, 100, 170, 30);
        getContentPane().add(tfMotDePasseConf);
        tfMotDePasseConf.setBounds(420, 100, 170, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 150, 30, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gc/presentation/1801091_595630270513775_1127831772_n.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        boolean test=true;
        String msg="";
        Prestataire p=new Prestataire();
        PrestataireDAO pdao=new PrestataireDAO();
        
        if(this.isValiEmail(tfAdresseMail.getText()))
        {  p.setAdresse_mail(tfAdresseMail.getText());
        }
        else
        {
            test=false;
            msg=msg+"adresse mail invalide \n";
        }
        
        
        p.setPseudo(tfPseudo.getText());
        
        p.setLogo(tfLogo.getText());
        p.setAdresse(tfAdresse.getText());
        p.setService((String)cbService.getSelectedItem());
        p.setDescription(taDescription.getText()+" ");
        if(tfMotDePasse.getText().length()<8)
            {
                msg=msg+"Le mot de passe doit contenir au moins 8 caracteres\n ";
                test=false;   
            }
        if((tfMotDePasse.getText()).equals(tfMotDePasseConf.getText()))
            {
                p.setMotDePasse(tfMotDePasse.getText());
            }
        else
            {
                 test=false;
                 msg=msg+"Confirmation de mot passe invalide\n" ;
            }
        
        if (this.monNumeroEstValide(tfTel.getText()))
            {      
                p.setTel(tfTel.getText());
            }
        else
        {
            test=false;
            msg=msg+"numero de tel invalide";
        }
        
        if(test==false)
        {
            JOptionPane.showMessageDialog(null,msg);
        }
        else
        {
            pdao.ajouterPrestataire(p);
        }
        this.viderChamps();
        
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
            this.viderChamps();
        
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void viderChamps()
   {
       tfAdresse.setText("");
       tfAdresseMail.setText("");
       tfLogo.setText("");
       tfMotDePasse.setText("");
       tfMotDePasseConf.setText("");
       tfPseudo.setText("");
       tfTel.setText("");
       taDescription.setText("");
       cbService.setSelectedItem("");
       
       
   }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
         //chooser.showOpenDialog(null); 
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
            tfLogo.setText(chooser.getSelectedFile().getAbsolutePath());
            }       
            ////////////////////::
            
            
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
            java.util.logging.Logger.getLogger(Inscription_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription_prestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription_prestataire().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox cbService;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfAdresse;
    private javax.swing.JTextField tfAdresseMail;
    private javax.swing.JTextField tfLogo;
    private javax.swing.JPasswordField tfMotDePasse;
    private javax.swing.JPasswordField tfMotDePasseConf;
    private javax.swing.JTextField tfPseudo;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
