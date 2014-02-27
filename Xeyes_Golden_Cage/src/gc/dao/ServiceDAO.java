package gc.dao;



import gc.entities.Service;
import gc.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class ServiceDAO 
{
    
    public void ajouterService(Service s){

        String requete ="insert into service (Nom_service,Description_service) values (?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                        
           
            ps.setString(1,s.getNom_service());
            ps.setString(2,s.getDescription_service());
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ© avec succÃ¨s");
                 } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
                 }
    }
         public void deleteService(int id){
        String requete = "delete from service where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,id );
            ps.executeUpdate();
            System.out.println("Pays supprimÃ©e");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
         }
    
    
        public Service getNomServiceById(int id){
    Service se = new Service();
     String requete = "select nom_service from service where id_service=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                se.setId_service(resultat.getInt(1));
                se.setNom_service(resultat.getString(2));
            }
            return se;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du service "+ex.getMessage());
            return null;
        }
    }
        
          public List<Service> DisplayAllService (){


        List<Service> serv = new ArrayList<Service>();

        String requete = "select * from service";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Service servi =new Service();
                servi.setId_service(resultat.getInt(1));
                servi.setNom_service(resultat.getString(2));

                serv.add(servi);
            }
            return serv;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataire "+ex.getMessage());
            return null;
        }
    
    
}
        
        public List <Service> rechercheServices_parSousNom(String str) {


        List<Service> listeServices = new ArrayList<Service>();

        String requete = "select * from service";
        try {
            Statement statement = MyConnection.getInstance() .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ServiceDAO serviceDAO = new ServiceDAO();
           
            while (resultat.next()) {

                Service s = new Service();
                s.setId_service(resultat.getInt(1));
                s.setNom_service(resultat.getString(2));
                s.setDescription_service(resultat.getString(3));
                
                listeServices.add(s);
            }
           
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des prestataires " + ex.getMessage());
            
        }
        
         List<Service> listeRecherchee = new ArrayList<Service>();
        for(Service s:listeServices)
        {
            if(s.getNom_service().toUpperCase().indexOf(str.toUpperCase())>=0)
            {
                
                listeRecherchee.add(s);
                
            }
        
        }
        
        return listeRecherchee;
    }
        
         public void updateService(Service s){
        String requete = "update service set Nom_service,Description_service=? where id_service=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getNom_service());
            ps.setString(2, s.getDescription_service());
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
    }
          
}
