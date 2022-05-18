package project3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*; 
// write files
public class Project3
{
	 public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); //creates an empty list
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	 public static void appendStrToFile(String fileName,
             String str)
{
// Try block to check for exceptions
try {

// Open given file in append mode by creating an
// object of BufferedWriter class
BufferedWriter out = new BufferedWriter(
new FileWriter(fileName, true));

// Writing on output stream
out.write(str);
// Closing the connection
out.close();
}

// Catch block to handle the exceptions
catch (IOException e) {

// Display message when exception occurs
System.out.println("exception occurred" + e);
}
}
    public static void main(String[] args) throws IOException
    {
      createFileUsingFileClass();
       createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
        List l = readFileInList("E://Files//testFile2.txt"); 
        
        Iterator<String> itr = l.iterator(); 
        while (itr.hasNext()) 
          System.out.println(itr.next()); 
       
    }
        
        
    
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("E://Files//testFile1.txt");
  
          //Create the file
          if (file.createNewFile()==true){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data 14-05-22");
          writer.close();
    }

private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("E://Files//testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }

private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("E://Files//testFile3.txt"), data.getBytes());
        
        
        // file6 is to append data
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("E://Files//file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
}
