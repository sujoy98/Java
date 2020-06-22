import java.util.Scanner;
public class Bubblesort{
    public static void main(String[]args){
        System.out.print("Enter the number of elements in the array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int j=0;j<arr.length-1;j++){
            boolean flag=false;
            for(int k=0;k<arr.length-1-j;k++){
                if(arr[k]>arr[k+1]){ //assending order, if(arr[k]<arr[k+1]) for decending order 
                temp=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=temp;
                flag=true;
              }
            }
            if(flag==false)
                break;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}