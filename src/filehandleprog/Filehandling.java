package filehandleprog;

public class Filehandling {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Aishwarya Nagur");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
