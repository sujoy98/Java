import java.io.*;
public class Str {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out, true);
        pw.println("Enter a sentence");
        String name=br.readLine();
        // pw.println(name + " : length : " + name.length());

        // int start=3;int end=10;
        // char tar[]=new char[end-start];
        // name.getChars(start, end, tar, 0);
        // pw.println(tar);
        
        char ch[]=name.toCharArray();
        // need to typecast in forEach loop
        // for(int i:ch){
        //     pw.println((char)(i));
        // }
        for(int i=0;i<ch.length;i++) {
            pw.println(ch[i]);
        }
    }
}
