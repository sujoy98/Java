// 59 >> ((5+9)+(5*9))=59
import java.util.Scanner;
class Num{
    int num,n1=0,n2=0,finalsum=0;
    void accept(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    num=sc.nextInt();
    }
    void compute(){
        if(num>=10){
            n1=num%10;
            n2=num/10;
            finalsum=((n1*n2)+(n1+n2));
            if(finalsum==num){
                System.out.println("2-Digit Special number : "+num);
            }
            else{
                System.out.println("Not a 2-Digit Special number : "+num);
                }
            }
        else{
        System.out.println("Wrong Input");
        }
    }
}
public class SpecialNumber{
    public static void main(String[]args){
        Num obj=new Num();
        obj.accept();
        obj.compute();
    }
}
