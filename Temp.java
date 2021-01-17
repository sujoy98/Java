import java.util.*;
public class Temp{
    public static void main(String[] args){
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter degree in celcius : ");
        c=sc.nextFloat();
        f=(float)(c*1.8)+32;//(float) (int) (double) like this we can type cast
        System.out.println("Temperature in Farenhite is " + f);
        sc.close();
    }
}
