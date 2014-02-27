/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.entities;

/**
 *
 * @author Cyrine
 */
public class Prestataire 
{
    private int id;
    private String adresse_mail;
    private String pseudo;
    private String logo;
    private String adresse;
    private String service;
    private String motDePasse;
    private String tel;
    private String description;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the adresse_mail
     */
    public String getAdresse_mail() {
        return adresse_mail;
    }

    /**
     * @param adresse_mail the adresse_mail to set
     */
    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toString()
    {
        return id+"\t"+pseudo+"\t"+adresse_mail+"\t"+motDePasse+"\t"+adresse_mail+"\t"+tel+"\t"+logo;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
