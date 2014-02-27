/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.test;

import gc.dao.PrestataireDAO;
import gc.entities.Prestataire;
import gc.util.MyConnection;

/**
 *
 * @author Cyrine
 */
public class Xeyes_Golden_Cage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyConnection.getInstance();
        PrestataireDAO p=new PrestataireDAO();
                System.out.println(p.selectPrestataireByNom("Mme Hachicha"));
                
             String s1="salut";
             String s2="Bonjour salut toi ";
             System.out.println("position "+s2.indexOf(s1));
             
            System.out.println( String.valueOf(1));
            
            PrestataireDAO pdao=new PrestataireDAO();
        Prestataire pi=pdao.findPrestataireById(3);
        System.out.println(pi.toString());
                
        
        
    }
}
