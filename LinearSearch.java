import java.util.Scanner;
public class LinearSearch{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array elements : ");
        boolean found=false;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a value to search : ");   
        int num=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
                found=true;// avoiding multiple output statement for each itarations
            }           
        }
        if(found==true){
            System.out.println("Search Complete "+num+" found.");
        }else{
            System.out.println("Search Complete "+num+" not found.");
        }
    }
}
