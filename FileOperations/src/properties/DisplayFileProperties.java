
package properties;

import java.io.File;
import java.sql.Date;
import java.util.Scanner;

import command.Command;
import main.TestFileOperations;

public class DisplayFileProperties implements Command{
	public static void fileProperties() {
		String file;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter file name: ");
		file = scan.nextLine();
		File file1 = new File(file);

		String extension = null;
		String s = file1.getName();
		int i = s.lastIndexOf('.');

		if (i > 0 && i < s.length() - 1) {

			extension = s.substring(i + 1).toLowerCase();
		}

		System.out.println("Name: " + file1.getName());
		System.out.println("Absolute path: " + file1.getAbsolutePath());
		System.out.println("Size: " + file1.length());
		System.out.println("Last modified: " + new Date(file1.lastModified()));
		System.out.println("Type: " + extension);

	}

	
		@Override
		public
		void execute(){
			fileProperties();
			}
		
	}


