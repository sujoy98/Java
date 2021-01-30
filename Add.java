import java.util.*;
import java.io.*;
public class Add{
        public static void main(String[] args){
        int a,b,sum;
        PrintWriter pw=new PrintWriter(System.out,true);
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter two numbers : ");
        
        pw.println("Enter two numbers : ");
        
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        // System.out.println("Sum of "+ a + " and " + b + " is " + sum);
        
        pw.println("Sum of "+ a + " and " + b + " is " + sum);
        
        sc.close();
    }
}
