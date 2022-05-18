import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {

    static public String TEST_PATH_DOC = ".\\docs\\";
    static public String TEST_FILE1 = "testFile.txt";

    /*
    * Method: fetchFileFromPath
    * Description: Fetches any file from a given path.
    */
    public static File fetchFileFromPath(String filePath, String fileName) {
        File file = new File(filePath+fileName);
        return file;
    }

    /*
     * Method: readFileLineByLine
     * Description: Accesses file contents line-by-line.
     */
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
        readFileLineByLine(TEST_PATH_DOC, TEST_FILE1);
    }

}
