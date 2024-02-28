import java.util.ArrayList;

public class ArrayListDS {
    public static void main(String[]args){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(25);
        arrayList.add(34);
        arrayList.add(46);

        arrayList.remove(Integer.valueOf(25));

        System.out.println(arrayList);

    }
}
