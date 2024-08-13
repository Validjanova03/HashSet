import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> sons = new HashSet<>();
        sons.add(6);
        sons.add(4);
        sons.add(1);
        sons.add(3);
        sons.add(2);
        sons.add(5);

        System.out.println("Iteratorda: ");
        Iteratorbn(sons);
        System.out.println("Reverseda: ");
        reverseda(sons);

    }

    public static void Iteratorbn(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void reverseda(Set<Integer> set) {
       LinkedList<Integer> rev = new LinkedList<>(set);
        Collections.reverse(rev);
        for (Integer m : rev) {
            System.out.println(m);
        }

    }


}