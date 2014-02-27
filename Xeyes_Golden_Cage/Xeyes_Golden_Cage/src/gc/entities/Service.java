/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.entities;




    
    
/**
 *
 * @author leila
 */
public class Service {
    private int id_service;
    private String nom_service;
    private String description_service;

    /**
     * @return the nom_service
     */
    public String getNom_service() {
        return nom_service;
    }

    /**
     * @param nom_service the nom_service to set
     */
    public void setNom_service(String nom_service) {
        this.nom_service = nom_service;
    }

    /**
     * @return the nom_prestataire
     */
    
    

    /**
     * @return the description_service
     */
    public String getDescription_service() {
        return description_service;
    }

    /**
     * @param description_service the description_service to set
     */
    public void setDescription_service(String description_service) {
        this.description_service = description_service;
    }

    /**
     * @return the id_service
     */
    public int getId_service() {    
        return id_service;
    }

    /**
     * @param id_service the id_service to set
     */
    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    /**
     * @return the id
     */
    
   public  String toString()
          {
              return this.nom_service+"\t"+this.description_service;
              
          }
    }    

