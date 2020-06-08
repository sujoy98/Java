/*
    1
   12
  123
 1234
12345

 */
public class Patt32{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.printf(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
}