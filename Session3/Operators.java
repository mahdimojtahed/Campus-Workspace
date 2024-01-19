public class Operators {

    public static void main(String[] args) {


        /* Assignment Operators
        =
        += plus equal
        -+ minus equal
        *= multiple equal
        /= division equal
        %= reminder equal
         */

        // Assignment Operators
        int x = 15;
        System.out.println(x);
        x += 3;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x -= 3;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= 1;
        System.out.println(x);


        // Assignment Operators Hands-On
        int y = 2;
        y += 5;
        y -= 3;
        y *= 10;
        y /= 2;
        y %= 5;
        System.out.println(y);


        /* Comparison Operators
        == equal
        > greater than
        < less than
        >= greater than or equal
        <= less than or equal
         */
        int num1 = 4;
        int num2 = 6;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // Comparison Operators Hands-On
        System.out.println(x + " - " + y);
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);


        /* Arithmetic Operators
        + add
        - minus
        * multiple
        / divide
        % reminder
         */

        int num3 = 3;
        int num4 = 7;
        System.out.println(num3 + num4);
        System.out.println(num4 - num3);
        System.out.println(num4 & num3);
        System.out.println(num4 / num3);
        System.out.println(num4 % num3);


        /* logical operators
        ! logical not
        || logical or
        && logical and
         */
        System.out.println(num3 != num4);
        System.out.println(num3 == num4 || num3 < num4);
        System.out.println(num3 != num4 && num3 < num4);



    }
}
