import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(3);
        num2.add(4);
        num2.add(5);

       List<Integer> birdagi = birinchi(num1,num2);
        List<Integer> ikkidagi = ikkinchi(num1,num2);
        List<Integer> juft = juftlar(num1,num2);
        System.out.println("Birinchisida mavjud: "+birdagi);
        System.out.println("Ikkinchisida mavjud: "+ikkidagi);
        System.out.println("Juft sonlar: "+juft);
    }
    public static <T> List<T> birinchi(HashSet<T> num1, HashSet<T> num2){
        HashSet<T> bir = new HashSet<>(num1);
        bir.removeAll(num2);
        return new ArrayList<>(bir);
    }
    public static <T> List<T> ikkinchi(HashSet<T> num1, HashSet<T> num2){
        HashSet<T> ikki = new HashSet<>(num2);
        ikki.removeAll(num1);
        return new ArrayList<>(ikki);
    }
    public static <T> List<T> juftlar(HashSet<T> num1, HashSet<T> num2){
        HashSet<T> juftl = new HashSet<>();
       for(T element:num1){
           if(element instanceof Integer && (Integer)element % 2 ==0){
               juftl.add(element);
           }
       }
        for(T element:num2){
            if(element instanceof Integer && (Integer)element % 2 ==0){
                juftl.add(element);
            }
        }
        return new ArrayList<>(juftl);
    }
}
