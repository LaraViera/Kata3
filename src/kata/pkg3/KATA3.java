package kata.pkg3;

public class KATA3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
