import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(10);
        number.add(7);
        number.add(8);
        number.add(12);
        number.add(5);
        number.add(20);
        number.add(4);

        HashSet<Integer> copy = copyhash(number);
        System.out.println("Klonlashgani: " + copy);

        ArrayList<Integer> arr = ConvertArray(copy);
        System.out.println("Arraylashtirilgan: " + arr);

        printeven(arr);
    }

    public static <Type> HashSet<Type> copyhash(HashSet<Type> set) {
        return new HashSet<>(set);
    }

    public static <Type> ArrayList<Type> ConvertArray(HashSet<Type> set) {
        return new ArrayList<>(set);
    }
    public static <Type> void printeven(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i += 2) {
            System.out.println("Index " + i + ": " + array.get(i));
        }
    }
}