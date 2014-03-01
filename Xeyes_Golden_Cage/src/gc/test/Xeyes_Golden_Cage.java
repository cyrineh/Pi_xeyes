/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.test;

import gc.dao.PrestataireDAO;
import gc.entities.Prestataire;
import gc.util.MyConnection;
import java.util.ArrayList;
import java.util.List;

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
       
             
            PrestataireDAO pdao=new PrestataireDAO();
           Prestataire p =null;
         p =pdao.findPrestataireByAdresseMail("relais@gailcom");
        if(p.getId()==0) {
            System.out.println(p);
        }
                
        
        
    }
}
