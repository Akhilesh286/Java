// importing the FileWriter class
import java.io.FileWriter;
import java.util.*;  
class Main {
  public static void main(String args[]) {

    // creates a multiline string using + operator
    // the string is a Java Program
    String program = "package com.Akhilesh;\n"+
    "import java.util.*;  \n"+
"public class Main {\n"+
"	public static void main(String[] args) {\n"+
"		Scanner sc= new Scanner(System.in);\n"+
"// Write Your code here\n"+
"	}\n"+
"}\n"+
"\n";

     try {
       // Creates a Writer using FileWriter
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter file Name :- ");
       String file = sc.nextLine();
       FileWriter output = new FileWriter(file);

       // Writes the program to file
       output.write(program);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}