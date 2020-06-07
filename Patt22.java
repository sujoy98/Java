/*
E D C B A 
E D C B 
E D C 
E D 
E 
 */
public class Patt22{
    public static void main(String[]args){
        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print((char)(j+65)+ " "); // using ascii, ascii of 'A' is 65, 'B' is 66 and upto 90
            }
        System.out.println();
        }
    }
}