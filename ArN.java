import java.util.Scanner;
public class ArN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the container: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        // int arr[] = new int[size];
        int i = 0;
        while(i<size) {
            System.out.print("enter next element: ");
            arr[i] = sc.nextInt();
            i++;
        }
        // for(int j=0;j<arr.length;j++) {
        //     System.out.print(arr[j] + " ");
        for(int j:arr) {
            System.out.print(j+" ");
        }
        System.out.println();
        sc.close();
    }
}
