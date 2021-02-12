import java.io.*;

public class IoDemo {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        // PrintWriter(System.out :- output Stream, true/flase :- boolean value for autoflush)
        PrintWriter pw=new PrintWriter(System.out, true);

        System.out.println("Enter line: ");
        // try {
        //     String sentence = br.readLine();
        //     System.out.println(sentence);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        String sentence = br.readLine();
        
        // System.out.println(sentence);
        
        // using printWriter class
        pw.println(sentence);
    }
}
