import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class FileStats {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            lineCount++;

            // Count characters including spaces
            charCount += line.length();
            charCount++;  // Count newline

            if (!line.trim().isEmpty()) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
