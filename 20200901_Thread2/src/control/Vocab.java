package control;

public class Vocab {
    private String kor;
    private String eng;

    public Vocab(String kor, String eng) {
        this.kor = kor;
        this.eng = eng;
    }

    public String getKor() {
        return this.kor;
    }
    
    public String getEng() {
        return this.eng;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public void print() {
        System.out.println(this.kor + "   " + this.eng);
    }
}