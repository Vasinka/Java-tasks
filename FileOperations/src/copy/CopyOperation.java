package copy;

import main.TestFileOperations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import command.Command;
import main.TestFileOperations;

public class CopyOperation implements Command {
	public static void copy(String sourceFileName, String targetFileName) {

		//String sourceFileName, targetFileName;
		/*Scanner scan = new Scanner(System.in);

		System.out.print("Source File: ");
		sourceFileName = scan.nextLine();
		System.out.print("Target File: ");
		targetFileName = scan.nextLine();
*/
		InputStream inStream = null;
		OutputStream outStream = null;

		try {
			File file1 = new File(sourceFileName);
			File file2 = new File(targetFileName);

			inStream = new FileInputStream(file1);
			outStream = new FileOutputStream(file2);

			byte[] buffer = new byte[1024];

			int length;
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}

			System.out.println("File Copied");
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
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

		}
	}

	@Override
	public void execute() {
	
		copy(null, null);
	}
}
