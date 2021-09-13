package IO;

import java.io.File;

public class TheFileClass {
    /*
    The File class in Java from the document states 'An abstract representation of file and directory pathnames'

    The File class contains several methods for working with the path name, deleting and renaming files, creating new
    directories, listing the contents of a directory, and determining common attributes of files and directories.
     */

    // Class variable of File instantiated with the relative path ot this folder
    // note the below is to the directory and does not give a new file name.
    File newFileObject = new File("src/main/java/basics/IO/");

    public void getAbsolutePath(){
        System.out.println(newFileObject.getAbsolutePath());
    }

    public void getNameOfFileOrFolder(){
        System.out.println(newFileObject.getName());
    }

    public void test(){
        // test more methods if you wish
    }

    public static void main(String[] args) {
        TheFileClass theFileClass = new TheFileClass();

        theFileClass.test();
    }
}
