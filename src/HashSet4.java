import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        List<Integer> commons = getcommons(set1,set2);
        List<Integer> uniqs = getuniqs(set1,set2);

        System.out.println("Bir xillari: " +  commons);
        System.out.println("Har xillari: " +  uniqs);

    }

    public static <T> List<T> getcommons(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> commonset = new HashSet<>(set1);
        commonset.retainAll(set2);
        return new ArrayList<>(commonset);
    }

    public static <T> List<T> getuniqs(HashSet<T> set1, HashSet<T> set2){
        HashSet<T> uniqset = new HashSet<>(set1);
        uniqset.addAll(set2);

        HashSet<T> commonset = new HashSet<>(set1);
        commonset.retainAll(set2);

        uniqset.removeAll(commonset);
        return new ArrayList<>(uniqset);

    }
}
