package la;
import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nomDevoir, String description, String deadline, float nbPoints) {
        this.nomDevoir = nomDevoir;
        this.description = description;
        this.deadline = deadline;
        this.nbPoints = nbPoints;
    }

    /**
     * 
     */
    public String nomDevoir;

    /**
     * 
     */
    public String description;

    /**
     * 
     */
    public String deadline;

    /**
     * 
     */
    public float nbPoints;

    public void setNbPoints(float nbPoints) {
        this.nbPoints = nbPoints;
    }

    @Override
    public String toString() {
        return "Devoir{" +
                "nomDevoir='" + nomDevoir + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", nbPoints=" + nbPoints +
                '}';
    }


}