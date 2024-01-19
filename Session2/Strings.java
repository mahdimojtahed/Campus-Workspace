public class Strings {

    public static void main(Strings[] args) {

        // String using String Literal
        String strLiteral = "Hello World";

        // String using String constructor
        String strNew = new String("Hello World");


        String greetings = "        Hello Fanap Students               ";
        String greetingsCopy = "        HELLO FANAP STUDENTS               ";
        System.out.println(greetings.length());
        System.out.println(greetings.charAt(5));
        System.out.println(greetings.substring(5, 10));
        System.out.println(greetings.concat(" !!!!"));
        System.out.println(greetings.equals(greetingsCopy));
        System.out.println(greetings.equalsIgnoreCase(greetingsCopy));
        System.out.println(greetings.indexOf('F', 3, 10));
        System.out.println(greetings.toUpperCase());
        System.out.println(greetingsCopy.toLowerCase());
        System.out.println(greetings.isBlank());
        System.out.println(greetings.replace("Hello", "Hi"));
        System.out.println(greetings.trim());


        String[] strArr = greetings.split(" ");
        int i = 0;
        while (i <= strArr.length) {
            System.out.println(strArr[i]);
            i++;
        }

        // String formatting

        String strFormat = String.format("Hello i am %s ", "Spartan");
        System.out.println(strFormat);

        // StringFormat Hands-On
        String name = "Peter";
        String company = "IBM";
        String fanap = "Fanap";
        String bio = String.format("Hi, my name is %s, i am %d years old \n" +
                "currently working as %s in %s company", name, 25, "Java Developer", company);

        bio = bio.toUpperCase();
        System.out.println(bio);

        bio = bio.replace(company.toUpperCase(), fanap);
        System.out.println(bio);

        bio = bio.substring(bio.indexOf(fanap));
        System.out.println(bio);


        // String Buffer
        StringBuffer sBuffer = new StringBuffer();
        sBuffer
                .append("i want to ")
                .append("learn ")
                .append("java ");

        // String Builder
        StringBuilder sBuilder = new StringBuilder();
        sBuffer
                .append("and ")
                .append("Spring Framework ")
                .append("beside JavaScript");

    }
}
