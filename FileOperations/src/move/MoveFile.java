package move;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import command.Command;
import main.TestFileOperations;

public class MoveFile implements Command {
	public static void move() {
	String oldFile, newFile;
	Scanner scan = new Scanner(System.in);

	System.out.print("Old File: ");
	oldFile=scan.nextLine();
	System.out.print("New File: ");
	newFile=scan.nextLine(); 

	InputStream inStream = null;
	OutputStream outStream = null;
	File file = new File(oldFile);try
	{
		File file1 = new File(oldFile);
		File file2 = new File(newFile);

		inStream = new FileInputStream(file1);
		outStream = new FileOutputStream(file2);

		byte[] buffer = new byte[1024];

		int length;
		while ((length = inStream.read(buffer)) > 0) {
			outStream.write(buffer, 0, length);
		}
		inStream.close();
		outStream.close();

		System.out.println("File moved");
	}catch(
	IOException e)
	{
		e.printStackTrace();
	}

	finally
	{
		if (inStream != null) {
			try {
				inStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		if (outStream != null) {
			try {
				outStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}file.delete();

}
	
@Override
public
void execute(){
	move();
	}
}
