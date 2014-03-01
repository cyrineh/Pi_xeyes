/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.dao;

import gc.entities.Prestataire;
import gc.util.MyConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Cyrine
 */
public class PrestataireDAO {

    public void ajouterPrestataire(Prestataire p)  {

        String requete = "insert into prestataire (password_prestataire,Mail_prestataire,Nom_prestataire,adresse_prestataire,Tel_prestataire,Nom_service,logo,description) values (?,?,?,?,?,?,?,?)";
       
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getMotDePasse());
            ps.setString(2, p.getAdresse_mail());
            ps.setString(3, p.getPseudo());
            ps.setString(4, p.getAdresse());
            ps.setString(5, p.getTel());
            ps.setString(6, p.getService());
            //ps.setString(7, p.getLogo());
               
            
                ps.setString(8,p.getDescription());
            

            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        catch (Exception ex) {
                Logger.getLogger(PrestataireDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public int selectPrestataireByNom(String nom) {
        
        String requete = "select id_prestataire from prestataire where Nom_prestataire=?";
        int x=0;

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                 x=resultat.getInt(1);

            }
            return x;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la conversion" + ex.getMessage());
            return -1;
        }
      
    }

    public void deletePrestataire(int id) {

        String requete = "delete from prestataire where id_prestataire=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
    
     public void updatePrestataire(Prestataire p){
        String requete = "update prestataire set password_prestataire = ?,Mail_prestataire = ?,Nom_prestataire = ?,adresse_prestataire = ?,Tel_prestataire = ?,Nom_service = ?,logo = ?,description = ? where id_prestataire = ?";
                        
        try {
            System.out.println(p);
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getMotDePasse());
            ps.setString(2, p.getAdresse_mail());
             ps.setString(3, p.getPseudo());
              ps.setString(4, p.getAdresse());
              ps.setString(5, p.getTel());
             ps.setString(6, p.getService());
              ps.setString(7, p.getLogo());
              ps.setString(8,p.getDescription());
              
              ps.setInt(9,p.getId());
              
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public Prestataire findPrestataireById(int id)  {

        String requete = "select * from prestataire where id_prestataire=?";
        FileOutputStream ostreamImage = null;

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id);
            ResultSet resultat = ps.executeQuery();
            //PrestataireDAO prestataireDAO = new PrestataireDAO();
            Prestataire p = new Prestataire();

            while (resultat.next()) {

                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
                
                
                
            }


            return p;
        
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        } 
    }
    
    public Prestataire findPrestataireByNom(String nom) {

        String requete = "select * from prestataire where Nom_prestataire=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            PrestataireDAO prestataireDAO = new PrestataireDAO();
            Prestataire p = new Prestataire();

            while (resultat.next()) {

                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
            }


            return p;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    
    
     public Prestataire findPrestataireByAdresseMail(String adresse_mail) {

        String requete = "select * from prestataire where Mail_prestataire=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adresse_mail);
            ResultSet resultat = ps.executeQuery();
            PrestataireDAO prestataireDAO = new PrestataireDAO();
            Prestataire p = new Prestataire();

            while (resultat.next()) {

                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
            }


            return p;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
     
      public String findPrestataireByAdresseMail(int id) {

        String requete = "select * from prestataire where id_prestataire=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id);
            ResultSet resultat = ps.executeQuery();
            PrestataireDAO prestataireDAO = new PrestataireDAO();
            Prestataire p = new Prestataire();

            while (resultat.next()) {

                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
            }


            return p.getService();
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }

    public List<Prestataire> DisplayAllPrestataires() {


        List<Prestataire> listePrestataires = new ArrayList<Prestataire>();

        String requete = "select * from prestataire";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            PrestataireDAO prestataireDAO = new PrestataireDAO();
            while (resultat.next()) {

                Prestataire p = new Prestataire();
                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
                listePrestataires.add(p);
            }
            return listePrestataires;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires " + ex.getMessage());
            return null;
        }
    }
    
    //pour Leila
     public List<Prestataire> getPrestatairesByService(String service) {


        List<Prestataire> listePrestataires = new ArrayList<Prestataire>();

        String requete = "select * from prestataire where Nom_service=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, service);
            ResultSet resultat = ps.executeQuery();
           
            PrestataireDAO prestataireDAO = new PrestataireDAO();
            while (resultat.next()) {

                Prestataire p = new Prestataire();
                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
                listePrestataires.add(p);
            }
            return listePrestataires;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires " + ex.getMessage());
            return null;
        }
    }
    
    public Set<Prestataire> recherchePrestataires_parSousNom(String str) {


        Set<Prestataire> setPrestataires = new TreeSet<Prestataire>();

        String requete = "select * from prestataire";
        try {
            Statement statement = MyConnection.getInstance() .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            PrestataireDAO prestataireDAO = new PrestataireDAO();
           
            while (resultat.next()) {

                Prestataire p = new Prestataire();
                p.setId(resultat.getInt(1));
                p.setMotDePasse(resultat.getString(2));
                p.setAdresse_mail(resultat.getString(3));
                p.setPseudo(resultat.getString(4));
                p.setAdresse(resultat.getString(5));
                p.setTel(resultat.getString(6));
                p.setService(resultat.getString(7));
                //p.setService(ServiceDAO.findServiceById(resultat.getInt(4)));
                p.setLogo(resultat.getString(8));
                p.setDescription(resultat.getString(9));
                setPrestataires.add(p);
            }
           
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires " + ex.getMessage());
            
        }
        
        
         Set<Prestataire> listeRecherchee = new TreeSet<Prestataire>();
        for(Prestataire p:setPrestataires)
        {
            if(p.getPseudo().toUpperCase().indexOf(str.toUpperCase())>=0)
            {
                
                listeRecherchee.add(p);
                
            }
        
        }
        
        return listeRecherchee;
    }
    
}
