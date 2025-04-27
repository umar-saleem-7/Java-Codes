import java.io.*;

public class FileWritingEx {
    public static void main(String[] args) {
        
        try{

            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("output.txt");
            PrintWriter pw = new PrintWriter(fw);

            String line = br.readLine();
            while (line!=null){
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
            fw.close();
            fr.close();
            br.close();
        } catch(IOException e){
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
