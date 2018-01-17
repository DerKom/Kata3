package kata3;

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram(); 
        histo.increment("google.es");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("yahoo.es");
        histo.increment("yahoo.es");
        histo.increment("yahoo.es");
        
        new HistogramDisplay(histo).execute(); 
    }   
}