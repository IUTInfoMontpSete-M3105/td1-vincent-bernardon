package la;

import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */

    public Rendu(String nom, String date, String document) {
        this.nom = nom;
        this.date = date;
        this.document = document;
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String date;

    /**
     * 
     */
    public String document;

    @Override
    public String toString() {
        return "Rendu{" +
                "nom='" + nom + '\'' +
                ", date=" + date +
                ", document='" + document + '\'' +
                '}';
    }
}