import java.util.*;
 public class Credentials {
    public static void main(String[] args) {
        String usr,pass;
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
            System.out.println("Enter Username (must have 6 character)");
            usr=sc.nextLine();
            System.out.println("Password (must have 8 character)");
            pass=sc.nextLine();

            if((usr.length()<6)&&(pass.length()<8)){
                System.out.println("Wrong, Try again");
            }else{
                System.out.println("Welcome "+ usr);
                flag=1;
            }
        }while(flag!=1);
        sc.close();
    }
}