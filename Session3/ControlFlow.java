public class ControlFlow {

    public static void main(String[] args) {


        // if-else Statement
        String state = "Day";
        if (state == "Day") {
            System.out.println("Good Day !!!");
        } else {
            System.out.println("Good Night !!!");
        }


        // if-elseif-else statement
        String developerStack = "Frontend";
        if (developerStack == "Frontend") {
            System.out.println("You probably need to learn react.js");
        } else if(developerStack == "Backend") {
            System.out.println("You may need to learn java");
        } else {
            System.out.println("You should learn them both !");
        }


        String season = "Winter";
        if (season == "Winter") {
            System.out.println("Winter is not a season, it's a celebration");
        } else if (season == "Summer") {
            System.out.println("Rise above the storm and you will find the sunshine !");
        } else if (season == "Spring") {
            System.out.println("Despite the forecast, live like it's spring");
        } else {
            System.out.println("Autumn Carries more gold in his pocket than all other seasons");
        }


        // Switch statements
        int dayInWeek = 2;
        switch (dayInWeek) {
            case 0:
                System.out.println("Its suturday");
                break;
            case 1:
                System.out.println("Its sunday");
                break;
            case 2:
                System.out.println("Its monday");
                break;
            case 3:
                System.out.println("Its tuesday");
                break;
            case 4:
                System.out.println("Its wednesday");
                break;
            case 5:
                System.out.println("Its thursday");
                break;
            case 6:
                System.out.println("Its Friday");
                break;
        }


    }
}
