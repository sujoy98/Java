import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. first Choise");
        System.out.println("2. second Choise");
        System.out.printf("Enter your choise: ");
        int choise = sc.nextInt();
        switch(choise) {
            case 1: 
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Wrong Choise");
                break;
        }
        sc.close();
    }
}
