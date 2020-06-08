/*
    *
   **
  ***
 ****
*****
 */
public class Patt25{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int c=4;c>=i;c--){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }   
        System.out.println();
        }
    }
}
