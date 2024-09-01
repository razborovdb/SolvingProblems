package remotask.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String baseFilename;
        baseFilename = scan.nextLine();
        FileWriter c_file = new FileWriter("c_" + baseFilename);
        FileWriter cs_file = new FileWriter("cs_" + baseFilename);
        FileWriter cpp_file = new FileWriter("cpp_" + baseFilename);

        File inputFile = new File(baseFilename);
        Scanner inputScanner = new Scanner(inputFile);

        while(inputScanner.hasNext()) {
            String nextS = inputScanner.nextLine();
            String s = nextS.substring(nextS.length()-1);

            if(s.equals("c")) {
                c_file.write(nextS);
            }
            if(s.equals("p")) {
                cpp_file.write(nextS);
            }
            if(s.equals("cs")) {
                cs_file.write(nextS);
            }
        }
        c_file.close();
        cpp_file.close();
        cs_file.close();
    }
}
