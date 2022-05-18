package project3;

import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class FileCode2 
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
  public static void main(String[] args) 
  { 
    List l = readFileInList("E://Files//testFile2.txt"); 
  
    Iterator<String> itr = l.iterator(); 
    while (itr.hasNext()) 
      System.out.println(itr.next()); 
  } 
}
