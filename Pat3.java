public class Pat3{
    public static void main(String[]args){
        int k=1;
        for(int i=0;i<5;i++){
            //k=1;
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}
/*
1
3 5
7 9 11
13 15 17 19
21 23 25 27 29
*/
