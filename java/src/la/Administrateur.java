package la;
import java.util.*;

/**
 * 
 */
public class Administrateur extends Utilisateur {

    /**
     * Default constructor
     */

    public Administrateur(String nom, String prenom, String adressePostale, String adresseMail) {
        super(nom, prenom, adressePostale, adresseMail);
    }

    /**
     * 
     */
    public void creerCours(String nom, int sem) {
        Cours re = new Cours(nom, sem);
    }

    /**
     * 
     */
    public void supprimerCours(Cours mo) {
        mo = new Cours(null,0);
    }

    /**
     * 
     */
    public void affecterChargeDeCours() {
        // TODO implement here
    }

    /**
     * 
     */
    public void desaffecterChargeDeCours() {
        // TODO implement here
    }

    /**
     * 
     */
    public void affecterEnseignant() {
        // TODO implement here
    }

}