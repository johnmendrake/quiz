package quiz;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * The class which controls the first quiz.
 * @author TheRaynex
 *
 */
public class Quiz1 {
	
	private Question frage1 = new Question();

	public ArrayList<Question> fragen = new ArrayList<Question>();
	
	/**
	 * A method to read in text files so it is easier to create or change the questions
	 * @author TheRaynex
	 */
	public void fragenEinlesen() {
	try {
	File datei  = new File ("E://Workspace//quiz//src//quiz//Fragen//testFrage.txt");
	
	Scanner sc = new Scanner(datei);
	sc.useDelimiter("\n");

	
	while (sc.hasNext()) {
		
		String hilf = sc.next();
		//System.out.println(sc.next());
		if (hilf.charAt(0) == 'F') {
		frage1.setFrage(hilf); 
		} else if (hilf.charAt(0) == 'A')
			frage1.setAntA(hilf);
		else if (hilf.charAt(0) == 'B')
			frage1.setAntB(hilf);
		else if (hilf.charAt(0) == 'C')
			frage1.setAntC(hilf);
		else if (hilf.charAt(0) == 'D')
			frage1.setAntD(hilf);
		else if (hilf.charAt(0) == '0')
			frage1.setPunkte(Integer.parseInt(hilf));
		else if (hilf.charAt(0) == 't') {
			char richtig = hilf.charAt(6);
			frage1.steRichtig(richtig);
		}
			
		
	}
	sc.close();
	} catch (FileNotFoundException e) {
		System.out.println("Datei nicht gefunden");	
		}
	}

	public Question getFrage1() {
		return frage1;
	}

}

