/*
    A 
   A B 
  A B C 
 A B C D 
A B C D E 

 */
public class Patt29{
    public static void main(String[]args){
        int i,j,k;
        for(i=0;i<=4;i++){
            for(k=3;k>=i;k--){
                System.out.printf(" ");
            }
            for(j=0;j<=i;j++){
                System.out.printf("%c ",(j+65));
            }
        System.out.println();
        }
    }
}