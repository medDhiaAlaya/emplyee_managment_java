package employe;

import employe.Employe;
import employe.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SocieteArrayList implements IGestion<Employe> {
     List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        if(employes.contains(t)){
            System.out.println("emplyee existe ");
            return true;
        }

        return false;
    }


    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getIdentifiant));
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNom_de_departement)
                .thenComparingInt(Employe::getGrade));
    }
}