package listAllFiles;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import command.Command;
import main.TestFileOperations;

public class ListFilesAndDirectories implements Command {
	public static void listAllFiles() {

		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		File dir = new File(s);
		File[] list = dir.listFiles();

		for (File file : list) {
			if (file.isDirectory())
				System.out.println("Directory: " + file.getName());
			else
				System.out.println("File: " + file.getName());
		}
	}

	@Override
	public void execute() {
		listAllFiles();
	}

}
