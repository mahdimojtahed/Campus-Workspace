public class TypeConversion {

    public static void main(String[] args) {


        /* Type Casting :
        Widening Casting (automatically) converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble; // Manual casting: double to int


        // Type Conversion
        String age = "12";
        int ageInInt = Integer.parseInt(age);
        Long ageInLong = Long.parseLong(age);
        float ageInFloat = Float.parseFloat(age);
        double ageInDouble = Double.parseDouble(age);
        boolean myBoolean = true;
        String booleanToStr = String.valueOf(myBoolean);




    }
}
