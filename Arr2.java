// Arr1 using enhanced for loop
public class Arr2{
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int even[]=new int[a.length];
        int odd[]=new int[a.length];
        int j=0,k=0;
        for(int i:a){
            if(i%2==0){
                even[j]=i;
                j++;
            }else{
                odd[k]=i;
                k++;
            }
        }
        
        for(int l:even){
            System.out.print(l+" ");          
        }
      
      System.out.println();
      for(int z:odd){
          System.out.print(odd[z]+" ");
      }
    }  
  }
