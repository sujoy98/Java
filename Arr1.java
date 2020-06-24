//  using enhanced for loop in Arr2
public class Arr1{
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int even[]=new int[10];
        int odd[]=new int[10];
        int j=0,k=0; // we are initializing the two index for our odd and even array
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                    // we dosen't need any loop to be ittaated we can simply use the for-i loop as a counter
                    even[j]=a[i];
                    j++;// to change the index position
                
            }else{
                    // we dosen't need any loop to be ittaated we can simply use the for-i loop as a counter
                    odd[k]=a[i];
                    k++; // to change the index position
            
            }
        }
        
        for(int z:even){
            System.out.print(z+" ");          
        }   
      System.out.println();
      for(int z:odd){
          System.out.print(z+" ");
      }
        
  }
}
