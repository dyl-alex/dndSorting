import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dnd {
    public static void main(String args[]) throws FileNotFoundException {
        ArrayList<characters> characterList = new ArrayList<characters>();

        setCharacters(characterList);

    }

    public static void setCharacters(ArrayList<characters> characterList) throws FileNotFoundException {
        File cList = new File("C:\\Users\\dyale\\OneDrive\\Desktop\\School\\dndSorting\\characters.txt");
        Scanner cReader = new Scanner(cList);

        while(cReader.hasNextLine()) {
            String line = cReader.nextLine();
            if (line.contains("-")) {
                line.replace(" ", "");
                characters t = new characters(line.substring(0, line.indexOf("-") - 1), line.substring(line.indexOf("-" + 1), line.length()));
                for(int i = 0; i < 6; i++) {
                    line = cReader.nextLine();
                    line.replace(" ", "");
                    int x = line.indexOf(":");
                    String path = line.substring(0, x - 1);

                }
            }
        }

        cReader.close();
    }
}
