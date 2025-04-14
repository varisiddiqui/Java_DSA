import java.util.*;
public class day {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for monday, 2 for tuesday, 3 for wednesday, 4 for thursday, 5 for friday, 6 for saturday, 7 for sunday");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch){
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
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Wrong choice!!");
        }
    }
    
}
