import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {

    //TODO: Add comments for methods.

    public static File fetchFileFromPath(String filePath, String fileName) {
        File file = new File(filePath+fileName);
        return file;
    }

    public static void readFileLineByLine(String filePath, String fileName) {
        File fetchedfile = fetchFileFromPath(filePath, fileName);
        try {
            Scanner fileReader = new Scanner(fetchedfile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFileLineByLine("", "testFile.txt");
    }

}
