import java.util.Scanner;
public class Condi{
        public void Test(int x,int y, int z){
        int max=x;
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        System.out.println("Max is "+max);
    }
    public static void main(String[]args){
        int x,y,z;
        System.out.println("Enter three nums : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        Condi obj=new Condi();
        obj.Test(x,y,z);
        //obj.Test(4,5,6);
        sc.close();
    }
}
