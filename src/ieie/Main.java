package ieie;

import java.io.File;
import java.io.InputStream;
import java.rmi.server.LoaderHandler;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {
	public Scanner console = new Scanner(System.in);
	public static void question() {
		String filequestion = "question.txt";
		ClassLoader loader = Main.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(filequestion);
		if (in == null) {
		    System.out.println("Could not access file "+filequestion);
		    return;
		}
		Scanner reader = new Scanner(in);
		while( reader.hasNextLine() ) {
		    String line = reader.nextLine().trim();
		    String[] k = line.split("?");
		}
		reader.close();
	}
	public static void main(String[] args) {
	question();
	}

}
