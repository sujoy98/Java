import java.util.Scanner;
public class test3{
    public static void main(String[]args){
        int a1[]={2,3,4,5,6,7};
        int a2[]=new int[a1.length];
        for(int i=0;i<a1.length;i++){
           
                a2[i]=a1[i];
            
        }
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
    }
}