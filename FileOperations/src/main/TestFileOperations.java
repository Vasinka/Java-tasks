package main;
 
import java.util.Scanner;
 
import command.Command;
import command.CommandFactory;
import copy.CopyOperation;
import listAllFiles.ListFilesAndDirectories;
import move.MoveFile;
import properties.DisplayFileProperties;
 
public interface TestFileOperations {
       public static void main(String args[]) {
             while (true) {
                    System.out.println("\nEnter 1 to list all files in the current directory" + "\nEnter 2 to copy a file."
                                 + "\nEnter 3 to move a file from one folder to another."
                                 + "\nEnter 4 to display the properties of a file.");
 
                    Scanner in = new Scanner(System.in);
                    int answer;
                    answer = in.nextInt();
                    Command myCommand=CommandFactory.createCommand(answer);
                    myCommand.execute();
      
       }
 
}}