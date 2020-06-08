/*
     *
    * *
   * * *
  * * * *
 * * * * *

 */
public class Patt26{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                // see Patt25 for referrence we r just adding a space with * to get the triangle
                System.out.print(" "+"*");
            }
        System.out.println();
        }
    }
} 