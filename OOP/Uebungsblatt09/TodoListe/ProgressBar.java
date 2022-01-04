public class ProgressBar {
    
    int all;
    int erl;

    // constructor
    public ProgressBar (int alle, int erledigt) {
        this.all = alle;
        this.erl = erledigt;
    }
    

    // CALCULATES PROGRESS IN PERCENTAGE
    public static int gibProzente (ProgressBar progressbar) {
        
        int prozente = 0;
        
        // if all is 0, no calculation necessary since prozente is zero-initialized anyway
        if (progressbar.all != 0) {
            prozente = (int)(((double)progressbar.erl / progressbar.all) * 100);
        }
        return prozente;
    }
    
    // CREATES PROGRESS BAR
    public static String gibProgressBar (ProgressBar progressbar, int breiteInZeichen) {
        
        int numEquals = 0;
        int numSpaces = 0;
        StringBuilder bar = new StringBuilder();
        
        // no erledigte Aufgaben or none at all: progressbar empty
        if (progressbar.all == 0 || progressbar.erl == 0) {
            numSpaces = breiteInZeichen;
        }
        // ...otherwise calculate num of equals and spaces needed
        else {
            numEquals = (int)((gibProzente(progressbar) * breiteInZeichen) / 100);
            numSpaces = breiteInZeichen - numEquals;
        }
        
        // generate progressbar string
        bar.append("[");
        for (int i = 0; i < numEquals; i++) {
            bar.append("=");
        }
        for (int i = 0; i < numSpaces; i++) {
            bar.append(" ");
        }
        bar.append("]");
        
        return bar.toString();
    }
}