import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.util.Scanner;

public class MainSystem {
	public static void main(String[] args) {
		while (true) {
			System.out.println("\nEnter 1 to list all files in the current directory" + "\nEnter 2 to copy a file."
					+ "\nEnter 3 to move a file from one folder to another."
					+ "\nEnter 4 to display the properties of a file.");

			Scanner in = new Scanner(System.in);
			int answer;
			answer = in.nextInt();
			switch (answer) {
			case 1:
				ListAllFiles();
				break;

			case 2:
				CopyOperation();
				break;
			case 3:
				MoveFile();
				break;
			case 4:
				FileProperties();
				break;
			}

		}
	}

	private static void CopyOperation() {

		String sourceFileName, targetFileName;
		Scanner scan = new Scanner(System.in);

		System.out.print("Source File: ");
		sourceFileName = scan.nextLine();
		System.out.print("Target File: ");
		targetFileName = scan.nextLine();

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
			inStream.close();
			outStream.close();

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

	private static void FileProperties() {

		File file = new File("C:\\Temp\\modify.txt");

		String extension = null;
		String s = file.getName();
		int i = s.lastIndexOf('.');

		if (i > 0 && i < s.length() - 1) {
			extension = s.substring(i + 1).toLowerCase();
		}

		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.length());
		System.out.println("Last modified: " + new Date(file.lastModified()));
		System.out.println("Type: " + extension);

	}

	private static void MoveFile() {

		InputStream in = null;
		OutputStream out = null;
		String oldFile, newFile;
		try {

			Scanner scan = new Scanner(System.in);
			System.out.print("Old File: ");
			oldFile = scan.nextLine();
			System.out.print("New File: ");
			newFile = scan.nextLine();

			// File oldFile = new File("C:\\Temp\\demo.txt");
			// File newFile = new File("C:\\Directory1\\c15.txt");

			in = new FileInputStream(oldFile);
			out = new FileOutputStream(newFile);

			byte[] moveBuff = new byte[1024];

			int bytesRead;

			while ((bytesRead = in.read(moveBuff)) > 0) {
				out.write(moveBuff, 0, bytesRead);
			}

			in.close();
			out.close();

			// oldFile.delete();

			System.out.println("File moved.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void ListAllFiles() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the path to the folder: ");
		String folder = scan.nextLine();
		File dir = new File(folder);
		File[] list = dir.listFiles();
		for (File file : list) {
			if (file.isDirectory())
				System.out.println("Directory " + file.getName());
			else
				System.out.println("File " + file.getName());
		}
	}
}