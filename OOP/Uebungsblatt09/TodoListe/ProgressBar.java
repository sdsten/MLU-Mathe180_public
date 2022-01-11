public class ProgressBar {
    
    int all;
    int erl;

    
    // CONSTRUCTOR
    public ProgressBar (int alle, int erledigt) {
        all = alle;
        erl = erledigt;
    }
   

    // CALCULATES PROGRESS IN PERCENTAGE
    public static int gibProzente (ProgressBar bar) {
        
        int prozente = 0;
            
        // check for division by 0
        if (bar.all != 0) {
            prozente = (bar.erl * 100) / bar.all;
        }
        // if bar.all IS 0, no calculation necessary since prozente is zero-initialized anyway
        return prozente;
    }
    

    // CREATES PROGRESS BAR
    public static String gibProgressBar (ProgressBar bar, int breiteInZeichen) {
        
        int numEquals = 0;
        int numSpaces = 0;
        StringBuilder barString = new StringBuilder();
        
        // no erledigte Aufgaben or none at all: progressbar empty
        if (bar.all == 0 || bar.erl == 0) {
            numSpaces = breiteInZeichen;
        }
        // ...otherwise calculate num of equals and spaces needed
        else {
            numEquals = ((gibProzente(bar) * breiteInZeichen) / 100);
            numSpaces = breiteInZeichen - numEquals;
        }
        
        // generate progressbar string
        barString.append("[");
        for (int i = 0; i < numEquals; i++) {
            barString.append("=");
        }
        for (int i = 0; i < numSpaces; i++) {
            barString.append(" ");
        }
        barString.append("]");
        
        return barString.toString();
    }
}