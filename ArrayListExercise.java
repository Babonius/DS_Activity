import java.util.ArrayList;

public class ArrayListExercise {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");
        color.add("Purple");
        color.add("Pink");
        color.add("Teal");
        color.add("Cyan");

        for (String i : color) {
            System.out.println(i);
        }

        System.out.println("Here is the original array" + color);

        color.add(2, "Black");
        color.remove(2);

        System.out.println("Here is the updated array" + color);

        System.out.println(searchColor(color, "Teal"));
        System.out.println("Array with duplicates removed: " + byeDuplicate(color));

        System.out.println("This is the final array"+ color);
    }

    public static String searchColor(ArrayList<String> colorList, String searchTerm) {
        int i = colorList.indexOf(searchTerm);
        if (i != -1) {
            return ("Thus color " + searchTerm + " is found at position " + (i + 1));
        } else {
            return ("This color " + searchTerm + " not found");
        }
    }

    public static ArrayList<String> byeDuplicate(ArrayList<String> colorList) {
        ArrayList<String> remove = new ArrayList<>();
        for (String color : colorList) {
            if (!remove.contains(color)) {
                remove.add(color);
            }
        }
        return remove;
    }
}
