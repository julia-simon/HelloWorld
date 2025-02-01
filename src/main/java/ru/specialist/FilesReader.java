package ru.specialist;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FilesReader {
    public static void main(String[] args) throws IOException {
        try {
            Path labs = Paths.get("src/main/resources/labs.txt");
            List<String> lines = Files.readAllLines(labs, StandardCharsets.UTF_8);
            int lineCount = 0, wordCount = 0, charCount = 0;
            for(String line : lines) {
                System.out.println(line);
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s").length;
            }
            System.out.println("\nСтатистика файла:");
            System.out.println("Количество строк: " + lineCount);
            System.out.println("Количество символов: " + charCount);
            System.out.println("Количество слов: " + wordCount);
    } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
