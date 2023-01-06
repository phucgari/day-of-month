import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which month that you want to count days?");
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("The month '2' have 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '"+month+"' have 31 days");
                break;
            case 6:
            case 4:
            case 9:
            case 11:
                System.out.println("The month '"+month+"' have 30 days");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}