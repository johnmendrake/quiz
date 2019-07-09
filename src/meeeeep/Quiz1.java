package meeeeep;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * The class which controls the first quiz.
 * 
 * @author TheRaynex
 *
 */
public class Quiz1 {

    public ArrayList<Question> fragenA = new ArrayList<Question>();
    public ArrayList<Question> fragenB = new ArrayList<Question>();
    public ArrayList<Question> fragenC = new ArrayList<Question>();
    public ArrayList<Question> fragenD = new ArrayList<Question>();
    public ArrayList<Question> fragenE = new ArrayList<Question>();

    public void fragenEinlesen(){
    	fragenEinlesenA();
    	fragenEinlesenB();
    	fragenEinlesenC();
    	fragenEinlesenD();
    	fragenEinlesenE();
    }
    
    public void fragenEinlesenA() {
        try {
            File directory = new File("src/meeeeep/a");

            // get all the files from a directory

            File[] fList = directory.listFiles();

            for (File file : fList) {

                if (file.isFile()) {

//                	System.out.println("a");
//                    System.out.println(file.getName());

                    for (int i = 0; i < fList.length; i++) {
                        Scanner sc = new Scanner(fList[i]);
                        sc.useDelimiter("\n");
                        Question frage1 = new Question();
                        
                        while (sc.hasNext()) {
                            String hilf = sc.next();
                            // System.out.println(sc.next());
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
                        fragenA.add(frage1);
                        sc.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
    }
    
    public void fragenEinlesenB() {
        try {
            File directory = new File("src/meeeeep/b");

            // get all the files from a directory

            File[] fList = directory.listFiles();

            for (File file : fList) {

                if (file.isFile()) {

//                	System.out.println("b");
//                    System.out.println(file.getName());

                    for (int i = 0; i < fList.length; i++) {
                        Scanner sc = new Scanner(fList[i]);
                        sc.useDelimiter("\n");
                        Question frage1 = new Question();
                        
                        while (sc.hasNext()) {
                            String hilf = sc.next();
                            // System.out.println(sc.next());
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
                        fragenB.add(frage1);
                        sc.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
    }
    
    public void fragenEinlesenC() {
        try {
            File directory = new File("src/meeeeep/c");

            // get all the files from a directory

            File[] fList = directory.listFiles();

            for (File file : fList) {

                if (file.isFile()) {

//                	System.out.println("c");
//                    System.out.println(file.getName());

                    for (int i = 0; i < fList.length; i++) {
                        Scanner sc = new Scanner(fList[i]);
                        sc.useDelimiter("\n");
                        Question frage1 = new Question();
                        
                        while (sc.hasNext()) {
                            String hilf = sc.next();
                            // System.out.println(sc.next());
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
                        fragenC.add(frage1);
                        sc.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
    }
    
    public void fragenEinlesenD() {
        try {
            File directory = new File("src/meeeeep/d");

            // get all the files from a directory

            File[] fList = directory.listFiles();

            for (File file : fList) {

                if (file.isFile()) {

//                	System.out.println("d");
//                    System.out.println(file.getName());

                    for (int i = 0; i < fList.length; i++) {
                        Scanner sc = new Scanner(fList[i]);
                        sc.useDelimiter("\n");
                        Question frage1 = new Question();
                        
                        while (sc.hasNext()) {
                            String hilf = sc.next();
                            // System.out.println(sc.next());
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
                        fragenD.add(frage1);
                        sc.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
    }

    public void fragenEinlesenE() {
        try {
            File directory = new File("src/meeeeep/e");

            // get all the files from a directory

            File[] fList = directory.listFiles();

            for (File file : fList) {

                if (file.isFile()) {

//                	System.out.println("e");
//                    System.out.println(file.getName());

                    for (int i = 0; i < fList.length; i++) {
                        Scanner sc = new Scanner(fList[i]);
                        sc.useDelimiter("\n");
                        Question frage1 = new Question();
                        
                        while (sc.hasNext()) {
                            String hilf = sc.next();
                            // System.out.println(sc.next());
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
                        fragenE.add(frage1);
                        sc.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
    }
    
    public ArrayList<Question> getFragenA() {
        return fragenA;     
    }
    
    public ArrayList<Question> getFragenB() {
        return fragenB;     
    }
    
    public ArrayList<Question> getFragenC() {
        return fragenC;     
    }
    
    public ArrayList<Question> getFragenD() {
        return fragenD;     
    }
    
    public ArrayList<Question> getFragenE() {
        return fragenE;     
    }
    
    /**
     * A method to read in text files so it is easier to create or change the
     * questions
     * 
     * @author TheRaynex
     */
    /*
     * public void fragenEinlesen() { try { File datei = new File ("testFrage.txt");
     * 
     * Scanner sc = new Scanner(datei); sc.useDelimiter("\n");
     * 
     * 
     * while (sc.hasNext()) {
     * 
     * String hilf = sc.next(); //System.out.println(sc.next()); if (hilf.charAt(0)
     * == 'F') { frage1.setFrage(hilf); } else if (hilf.charAt(0) == 'A')
     * frage1.setAntA(hilf); else if (hilf.charAt(0) == 'B') frage1.setAntB(hilf);
     * else if (hilf.charAt(0) == 'C') frage1.setAntC(hilf); else if (hilf.charAt(0)
     * == 'D') frage1.setAntD(hilf); else if (hilf.charAt(0) == '0')
     * frage1.setPunkte(Integer.parseInt(hilf)); else if (hilf.charAt(0) == 't') {
     * char richtig = hilf.charAt(6); frage1.steRichtig(richtig); }
     * 
     * 
     * } sc.close(); } catch (FileNotFoundException e) {
     * System.out.println("Datei nicht gefunden"); } }
     */

}
