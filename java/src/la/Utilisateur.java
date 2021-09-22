package la;

import java.util.*;

/**
 * 
 */
public abstract class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur(String nom, String prenom, String adressePostale, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String prenom;

    /**
     * 
     */
    public String adressePostale;

    /**
     * 
     */
    public String adresseMail;

    /**
     * 
     */
    public void gererDonnees() {
        // TODO implement here
    }

    /**
     * 
     */
    public void afficherCours(Cours io) {
        System.out.println(io.toString());
    }

    /**
     * 
     */
    public void afficherDevoirs(Devoir yu) {
        System.out.println(yu.toString());
    }

    /**
     * 
     */
    public void afficherRendu(Rendu po) {
        System.out.println(po.toString());
    }

    /**
     * 
     */
    public void afficherPoints(Participation moi) {
        System.out.println(moi.getNbTotalPoints());
    }

}