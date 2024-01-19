public class Methods {
    public static void main(String[] args) {
        addition(12, 52);
        int result = additionWithReturnType(53, 12);
        System.out.println(result);
        System.out.println(avg(8, 3));
    }

    public static void addition(int numb1, int numb2) {
        System.out.println(numb1 + numb2);
    }

    public static int additionWithReturnType(int numb1, int numb2) {
        return numb1 + numb2;
    }

    public static float avg(int numb1, int numb2) {
        return (float) (numb1 + numb2) / 2;
    }
}
