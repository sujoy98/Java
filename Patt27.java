/*
    A
   BB
  CCC
 DDDD
EEEEE
 */
public class Patt27{
    public static void main(String[]args){
        int i,j,k;
        for(i=0;i<=4;i++){
            for(k=3;k>=i;k--){
            System.out.print(" ");
            }
            for(j=0;j<=i;j++){
            System.out.print((char)(i+65));
            }
        System.out.println();
        }
    }
}