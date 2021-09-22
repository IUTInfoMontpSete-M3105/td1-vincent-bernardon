package la;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Enseignant dio = new Enseignant("Michel", "Jean", "3400","ff@ff.ff","48HJ41","75HE47");
        Administrateur mod = new Administrateur("am","bur","geur","re");
        Enseignant youpi = new Enseignant("lambda", "yogourt", "6400","aa@aa.aa","4445g1","gr5E47");

        dio.creerDevoir("yes","qu'est-ce que la vie ?", "06/12/42", 20);
        youpi.creerDevoir("no","pourquoi le travail ?", "31/02/72", 20);

        mod.creerCours("ARCHI1",1);

        Etudiant prem = new Etudiant("Crock","odil","4500","fjfj@fjf.fjf","s45r2rg4r5gr");
        Etudiant sec = new Etudiant("Alex","Terieur","4986","eireirer@fefefseq.fefes","95f6ef45e5f4e45f");

        Devoir d1 = new Devoir("oui","oui","01/01/01", 20);
        Devoir d2 = new Devoir("non","non","02/02/02",20);
        Cours c1 = new Cours("COO",2);

        prem.afficherCours(c1);
        sec.afficherCours(c1);
        prem.telechargerDevoir(d1);
        sec.telechargerDevoir(d2);

        dio.afficherDevoirs(d1);
        youpi.afficherDevoirs(d2);
        dio.afficherCours(c1);
    }
}
