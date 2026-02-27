import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        String fileName = "data.txt";   // Correct file name

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // Try-with-resources ensures file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                lineCount++;  // Count lines

                charCount += line.length();  // Count visible characters (including spaces)

                // Count words (avoid empty lines)
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Output results (format as required)
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
