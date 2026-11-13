import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day = input.nextInt();
        String newSwitch = newSwitch(day);
        System.out.println(newSwitch);
        // oldSwitch(day);
        input.close();
        
        

    }
    public static String newSwitch(int day){
        String dayStr = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";       //AFTER JAVA 13, IN JAVA 14 THIS NEWSWITCH UPDATE COME 
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            // case 7 -> "Sunday";
            default -> "Invalid";
        };
        return dayStr;


    }
    public static void oldSwitch(int day){
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:  //fall through kiya hai yaha pe
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

}
