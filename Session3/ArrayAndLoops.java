import java.util.Arrays;

public class ArrayAndLoops {
    public static void main(String[] args) {

        // Arrays
        String[] fruits = {"Kiwi", "Apple", "Banana"};

        System.out.println(fruits.length);

        System.out.println(fruits[0]);
        Arrays.sort(fruits);
        System.out.println(fruits[0]);

        System.out.println(fruits[2]);
        fruits[2] = "Grapes";
        System.out.println(fruits[2]);

        // Arrays Hands-On
        String[] languages = {"Java", "JavaScript", "Scala", "Dart", "Go"};

        int length = languages.length;
        System.out.println(length);

        System.out.println(languages[2]);
        languages[2] = "Perl";
        System.out.println(languages[2]);

        System.out.println(languages[languages.length - 1]);

        System.out.println(languages[languages.length / 2]);

        // System.out.println(languages[5]);


        // For-Loop
        for (int i = 0; i < 4; i++) {
            System.out.println("it's " + "th iteration");
        }

        for (int i = 0; i <= fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        int i = 0;
        while (i <= fruits.length) {
            System.out.println(fruits[i]);
            i++;
        }


    }
}
