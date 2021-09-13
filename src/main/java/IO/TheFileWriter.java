package IO;

import java.io.*;

public class TheFileWriter {
    /*
    Under the same concept as the FileReader, the FileWriter works with char's and utilises a BufferedWriter object
    to manage the streams of characters.

    The following implementation will be a FileReader object writing directly into a new file
     */
    // below we are creating a buffered file reader for our text file to be used in the writer method.
    BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/IO/frankenstein.txt"));
    // As you can see the buffered writer follows a
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/IO/franklines.txt"));

    public TheFileWriter() throws IOException {
    }

    public void writeToFileExample() throws IOException {
        // Although a while loop was used in a previous loop a more elegant and descriptive way can be to use a for loop
        for (String line = bufferedReader.readLine(); line != null ; line = bufferedReader.readLine()) {
            if (line.contains("Frankenstein")){
                bufferedWriter.write(line + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        new TheFileWriter().writeToFileExample();
    }

}
