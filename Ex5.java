import java.util.Scanner;
public class Ex5{
    public static void main(String[]agrs){
         int tp[] ={100,150,500,20};
         int tpN[]= new int[tp.length];
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter discount percentage : ");
         int dis=sc.nextInt();
         int j=0;
         for(int i=0;i<tp.length;i++){
             int disP = tp[i] - (tp[i] * dis)/100;
             tpN[j]=disP;
             j++;
            }
         for(int k=0;k<tpN.length;k++){
             System.out.println(tpN[k]+" ");
         }
    }
}
