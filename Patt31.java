/*
    1
   22
  333
 4444
55555

 */
public class Patt31{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(k=4;k>=i;k--){
                System.out.printf(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
        System.out.println();
        }
    }
}