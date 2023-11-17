import java.util.Objects;

public class Employe {
    private int identifiant,grade;
    private String nom,prenom,nom_de_departement;

    public Employe(){};
    public Employe(int identifiant,int grade,String nom,String prenom,String nom_de_departement){
        this.identifiant=identifiant;
        this.grade=grade;
        this.nom=nom;
        this.nom_de_departement=nom_de_departement;
    };

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_de_departement() {
        return nom_de_departement;
    }

    public void setNom_de_departement(String nom_de_departement) {
        this.nom_de_departement = nom_de_departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return identifiant == employe.identifiant && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_de_departement='" + nom_de_departement + '\'' +
                '}';
    }
}
