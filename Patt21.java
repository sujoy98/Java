/*
AAAAA
BBBB
CCC
DD
E
 */
public class Patt21{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print((char)(i+64)); // as we took i from 1 to 5 is we add 65 it will start printing from B so I add 64
            }
        System.out.println();
        }
    }
}