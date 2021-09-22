package la;
import java.util.*;

/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */

    public Enseignant(String nom, String prenom, String adressePostale, String adresseMail, String numem, String harpege) {
        super(nom, prenom, adressePostale, adresseMail);
        Numem = numem;
        Harpege = harpege;
    }

    /**
     * 
     */
    public String Numem;

    /**
     * 
     */
    public String Harpege;




    /**
     * 
     */
    public void creerDevoir(String nom, String desc, String deadline, float nbPoints) {
        Devoir lui = new Devoir(nom, desc, deadline, nbPoints);
    }

    /**
     * 
     */
    public void corrigerDevoir(Devoir n, float t) {
        n.setNbPoints(t);
    }

    /**
     * 
     */
    public void attribuerPoint() {
        // TODO implement here
    }

    /**
     * 
     */
    public void attribuerAvis() {
        // TODO implement here
    }

}