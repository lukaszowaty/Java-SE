package app;

public class LibraryApp {

	public static void main(String[] args) {
		final String appName = "Bibloteka v0.9";
		System.out.println(appName);
		LibraryControl libControl = new LibraryControl();
		libControl.controlLoop();
	}

}