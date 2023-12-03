package etudiant;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management{

    @Override
    public void displayStudents(List list, Consumer con) {
        for(int i=0;i<list.size();i++)
        {
            //System.out.println(list.get(i));
            con.accept(list.get(i));
        }

    }

    @Override
    public void displayStudentsByFilter(List list, Predicate pre, Consumer con) {
        // Définition d'un “Predicate” qui prend un String et vérifie une condition
        //pre = s -> s.startsWith("n");
        // Application du “Predicate” avec "Hamdi" pour vérifier si elle commence par "n"
        //boolean check = pre.test("Hamdi");
        //check = false
    }

    @Override
    public Object createStudent(Supplier sup) {
        return null;
    }

    @Override
    public List sortStudentsById(List list, Comparator com) {
        return null;
    }

    @Override
    public Stream convertToStream(List list) {
        return null;
    }

    @Override
    public String returnStudentsNames(List list, Function fun) {
        return null;
    }
}
