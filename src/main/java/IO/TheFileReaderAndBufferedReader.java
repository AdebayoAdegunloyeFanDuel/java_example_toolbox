package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheFileReaderAndBufferedReader {
    FileReader fileReader = new FileReader("src/main/java/IO/frankenstein.txt");

    public TheFileReaderAndBufferedReader() throws FileNotFoundException {
    }

    // FileReader reads through aa file and returns integers
    // The integer is an equivalent of ASCII code character
    // The integer can be cast to a char and read visually
    // hence we use -1 as the read() method returns -1 at the end of the file

    public void readingCharsUsingFileReader() throws IOException {
        int data;
        while (fileReader.read() != -1){
            data = fileReader.read();

            System.out.println((char) data);
        }
    }

    // To use the FileReader alone we would have to put each character into a string[] and then terminate at the
    // \n newline char

    // We can use a buffered file reader to do this work ofr us and in turn make the reading of the file
    // more memory efficient

    public void readFileWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            if (line.contains("Frankenstein")){
                System.out.println(line);
            }
        }
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        TheFileReaderAndBufferedReader theFileReader = new TheFileReaderAndBufferedReader();
//        theFileReader.readingCharsUsingFileReader();
        theFileReader.readFileWithBufferedReader();
    }
}
