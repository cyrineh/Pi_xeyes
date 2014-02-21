/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GC_DAO;

import GC_entities.Prestataire;
import GC_util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cyrine
 */
public class PrestataireDAO 
{
    
    public void ajouterPrestataire(Prestataire p){

        String requete = "insert into prestataire (adresse_mail,pseudo,logo,adresse,service,mot_de_passe,tel) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,p.getAdresse_mail());
            ps.setString(2,p.getPseudo());
            ps.setString(3,p.getLogo());
            ps.setString(4,p.getAdresse());
            ps.setString(5,p.getService());
            ps.setString(6,p.getMotDePasse());
            ps.setString(7,p.getTel());
           
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
                 } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
}
