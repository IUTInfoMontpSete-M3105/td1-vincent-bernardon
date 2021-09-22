package la;

import java.util.*;

/**
 * 
 */
public class Participation {

    /**
     * Default constructor
     */

    public Participation(int nbTotalPoints, String certificat) {
        this.nbTotalPoints = nbTotalPoints;
        this.certificat = certificat;
    }

    /**
     * 
     */
    public int nbTotalPoints;

    /**
     * 
     */
    public String certificat;

    public int getNbTotalPoints() {
        return nbTotalPoints;
    }

    public void setNbTotalPoints(int nbTotalPoints) {
        this.nbTotalPoints = nbTotalPoints;
    }
}