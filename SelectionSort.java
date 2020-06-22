public class SelectionSort{
    public static void main(String[]args){
        int ar[]={3,5,2,6,8,6,1,8,9,0,-1,-99,55};
        for(int i=0;i<ar.length-1;i++){//this loop is to check for passes and handle the array
            int min=i;
            for(int j=i+1;j<ar.length;j++){// this loop is to check the smallest element in the array
                if(ar[min]>ar[j]){
                    min=j;
                }
            }
            if(min!=i){//this block is to swap the numbers
            /*int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;*/
            int temp=ar[i];
            ar[i]=ar[min];
            ar[min]=temp;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}