package tutorials;


/**
 * File handling is an important part of any application.
 * Java has several methods for creating, reading, updating, and deleting files.
 * The File class from the java.io package, allows us to work with files.
 * To use the File class, create an object of the class, and specify the filename or directory name:
 * canRead()	Boolean	Tests whether the file is readable or not
 * canWrite()	Boolean	Tests whether the file is writable or not
 * createNewFile()	Boolean	Creates an empty file
 * delete()	Boolean	Deletes a file
 * exists()	Boolean	Tests whether the file exists
 * getName()	String	Returns the name of the file
 * getAbsolutePath()	String	Returns the absolute pathname of the file
 * length()	Long	Returns the size of the file in bytes
 * list()	String[]	Returns an array of the files in the directory
 * mkdir()	Boolean	Creates a directory
 */


import java.io.*;
import java.util.Scanner;

/**
 * To create a file in Java, you can use the createNewFile() method. This method returns a boolean value:
 * true if the file was successfully created, and false if the file already exists.
 * Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException
 * if an error occurs (if the file cannot be created for some reason):
 */

/**
 * To create a file in a specific directory (requires permission), specify the path of the file and use double
 * backslashes to escape the "\" character (for Windows). On Mac and Linux you can just write the path,
 * like: /Users/name/filename.txt
 */


/**
 * Write To a File
 * In the following example, we use the FileWriter class together with its write() method to write some text to the file
 * we created in the example above. Note that when you are done writing to the file, you should close it with the close()
 * method:
 */

public class FIleHandling {

    public static void main(String[] args) {
        try {
            File fileObj = new File("filetext.txt");

            if(fileObj.createNewFile()) {
                System.out.println("File is created: "+ fileObj.getName());

            } else {
                WriteToFile writeFile = new WriteToFile();
                writeFile.writeToFile();

                ReadFromFile readFile = new ReadFromFile();

                readFile.readFromFile();

                GetFileInfo fileInfo = new GetFileInfo();
                fileInfo.getFileInfo();

                DeleteFile deleteFile = new DeleteFile();
                deleteFile.deleteFile();
            }
        }catch (IOException ex) {
            System.out.println("An error has occurred.");
            System.out.println(ex);
            ex.printStackTrace();

        }

    }
}

class WriteToFile {
    public void writeToFile () throws IOException {
       File fileObj = new File("filetext.txt");
       FileWriter fileWrite = new FileWriter(fileObj.getAbsoluteFile());
       if(fileWrite != null) {
           fileWrite.write("Files in Java might be tricky, but it is fun enough!");
           fileWrite.close();
           System.out.println("Successfully wrote to the file.");
       }
    }

}


class ReadFromFile  {
    public void readFromFile() throws FileNotFoundException {
        File fileObj = new File("filetext.txt");
        FileReader fileReader = new FileReader(fileObj.getAbsoluteFile());
        Scanner sc = new Scanner(fileReader);
        while(sc.hasNext()) {
            System.out.print(sc.next() + " ");
        }

    }
}

class GetFileInfo {
    public void getFileInfo() {
        File filObj = new File("filetext.txt");
        if(filObj.exists()) {
            System.out.println();
            System.out.println("File name: " + filObj.getName());
            System.out.println("Absolute path: "+ filObj.getAbsolutePath());
            System.out.println("Writeable: "+ filObj.canWrite());
            System.out.println("Readable: "+ filObj.canRead());
            System.out.println("File size in bytes: "+ filObj.length());
        }else {
            System.out.println("File doesn't exist!");
        }


    }
}

class DeleteFile {

   public void deleteFile() {
       File filObj = new File("filetext.txt");
       if(filObj.delete()) {
           System.out.println("Deleted the file: " + filObj.getName());
       } else {
           System.out.println("Failed to delete the file.");
       }
    }
}

/**
 * Note: There are many available classes in the Java API that can be used to read and write files in Java:
 * FileReader,
 * BufferedReader,
 * Files,
 * Scanner,
 * FileInputStream,
 * FileWriter,
 * BufferedWriter,
 * FileOutputStream,
 * etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters,
 * and the size of the file/lines etc.
 * Tip: To delete a file, read our Java Delete Files chapter.
 */
