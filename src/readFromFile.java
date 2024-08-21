import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;


public class readFromFile {

    public  String[][] readFile(String path){

        try {

           int length = Files.readAllLines(Paths.get(path)).size() ;
            String[][] results = new String[length][99];
            String[] lines=new String[length];

            for(int i=0;i<length;i++){
                lines[i]= Files.readAllLines(Paths.get(path)).get(i);
            }
            for (int i=0;i<length;i++) {
                    String[] line =lines[i].split("\t");
                    for (int j=0;j< line.length;j++){
                        if(line[j]!=null)
                            results[i][j]=line[j];


                    }

            }
            return results;

        }
        catch(IOException e) {

            e.printStackTrace();
            return null;
        }

    }

}