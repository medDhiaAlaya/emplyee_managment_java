import etudiant.Etudiant;
import etudiant.StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        StudentManagement st =new StudentManagement();
        List<Etudiant> Etudiants = new ArrayList<>();
        Etudiant maher=new Etudiant(0,"maher",15);
        Etudiant sami=new Etudiant(1,"sami",20);
        Etudiants.add(maher);
        Etudiants.add(sami);
        st.displayStudents(Etudiants,System.out ::println);








    }
    }
