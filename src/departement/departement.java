package departement;

import java.util.Objects;

public class department {
    private int id,nbr_employes;
    private String nom_departement;

    public department() {
    }

    public department(int id, int nbr_employes, String nom_departement) {
        this.id = id;
        this.nbr_employes = nbr_employes;
        this.nom_departement = nom_departement;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        department that = (department) o;
        return id == that.id && Objects.equals(nom_departement, that.nom_departement);
    }

}
