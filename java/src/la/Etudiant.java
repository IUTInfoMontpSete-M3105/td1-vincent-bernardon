package la;

import java.util.*;

/**
 * 
 */
public class Etudiant extends Utilisateur {

    /**
     * Default constructor
     */

    public Etudiant(String nom, String prenom, String adressePostale, String adresseMail, String numeroEtudiant) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numeroEtudiant = numeroEtudiant;
    }

    /**
     * 
     */
    public String numeroEtudiant;


    /**
     * 
     */
    public void telechargerDevoir(Devoir eru) {
        System.out.println(eru.toString());
    }

}