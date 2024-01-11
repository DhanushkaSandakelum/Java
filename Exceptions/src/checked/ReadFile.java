package checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

