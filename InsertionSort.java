public class InsertionSort{
    public static void main(String[]args){
        int ar[]={3,2,5,76,4,6,7,8,4};
        for(int i=1;i<ar.length;i++){
            int temp=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>temp){
               ar[j+1]=ar[j];
               j--;
            }
            ar[j+1]=temp;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}