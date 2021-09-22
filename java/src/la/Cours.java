package la;
import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */

    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public int semestre;


    @Override
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", semestre=" + semestre +
                '}';
    }

}