package command;

import listAllFiles.ListFilesAndDirectories;
 
public class CommandFactory {
      
       public static Command createCommand(int userSelection, String... args) {
             Command myCommand=null;
             switch (userSelection) {
             case 1: myCommand= new ListFilesAndDirectories();
             break;
            
             case 2: myCommand= new ListFilesAndDirectories();
             break;
            
             case 3: myCommand= new ListFilesAndDirectories();
             break;
            
             case 4: myCommand= new ListFilesAndDirectories();
             break;
            
 
 
 
             }
       }
 
}
 