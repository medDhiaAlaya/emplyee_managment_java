package departement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements Idepartement<department>{
    Set<department> departments=new HashSet<>();
    @Override
    public void ajouterDepartement(department department) {
        departments.add(department);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (department d: departments) {
            if(d.getNom_departement().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public void displayDepartement() {
        Iterator<department> it = departments.iterator();
        while (((Iterator<?>) it).hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet<department> trierDepartementById() {
        return new TreeSet<>(departments);
    }

    @Override
    public void supprimerDepartement(department department) {
        departments.remove(department);

    }

    @Override
    public boolean rechercherDepartement(department department) {
        return departments.contains(department);
    }
}
