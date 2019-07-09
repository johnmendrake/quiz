package meeeeep;

/**
 * A simple class to store the questions, their answers and the points the correct answer will give.
 * @author TheRaynex
 *
 */
public class Question {
    
    private String frage = "";
    private String antA = "";
    private String antB = "";
    private String antD = "";
    private String antC = "";
    private int punkte;
    private char richtig ;
    
    public String getFrage() {
        return frage;
    }
    public void setFrage(String frage) {
        this.frage = frage;
    }
    public String getAntA() {
        return antA;
    }
    public void setAntA(String antA) {
        this.antA = antA;
    }
    public String getAntB() {
        return antB;
    }
    public void setAntB(String antB) {
        this.antB = antB;
    }
    public String getAntD() {
        return antD;
    }
    public void setAntD(String antD) {
        this.antD = antD;
    }
    public String getAntC() {
        return antC;
    }
    public void setAntC(String antC) {
        this.antC = antC;
    }
    public int getPunkte() {
        return punkte;
    }
    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }   
    public int getRichtig() {
        return richtig;
    }
    public void steRichtig(char chara) {
        this.richtig = chara;
    }
    
    
    
}
