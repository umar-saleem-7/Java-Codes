import java.io.*;

public class FileReadingEx{
    public static void main(String[] args){

        try{

            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }
            fr.close();
            br.close();
        } catch(IOException e){
            System.out.println("Exception:" + e.getMessage());
        }
            
    }
}