import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<String> kasb = new HashSet<>();
        kasb.add("O'qtuvchi");
        kasb.add("Shifokor");
        kasb.add("Sartarosh");
        kasb.add("Usta");
        kasb.add("Sotuvchi");
        System.out.println("\n"+"Kasblar: "+ kasb);

        System.out.println("\n"+"To'plam o'lchami: " + kasb.size()+"\n");
        checkempty(kasb);
        kasb.clear();
        System.out.println("\n"+"To'plam tozalandi! "+ kasb);

    }
    public static void checkempty(HashSet<String> kasb){
        if(kasb.isEmpty()){
            System.out.println("Bo'sh to'plam !!!");
        }else{
            System.out.println("To'plam bo'sh EMAS !!!");
        }
    }
}
