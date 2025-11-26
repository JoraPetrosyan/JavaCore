package fileAnalyzer.fileAnalyzerMain;

import fileAnalyzer.FileAnalyzer;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class FileAnalyzerDemo {

    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String path = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\fileAnalyzer\\test.txt";

        Map<String, Integer> stringIntegerMap = fileAnalyzer.wordMap(path);

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
    }
}
