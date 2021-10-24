
// this part was provided with the exercise
import java.io.*;
public class Beet {
    public static void main(String[] args) throws IOException {
        final double PI = 3.1415926;
        int steineProMeter = Integer.parseInt(args[0]);
        int rosenProQuadratmeter = Integer.parseInt(args[1]);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int durchmesser = Integer.parseInt(in.readLine());

// from here on it's my additions
        double r = (double)durchmesser / 2;
        double flaeche = PI * r * r;
        double umfang = 2 * PI * r;
        double rosen = flaeche * rosenProQuadratmeter;
        double steine = umfang * steineProMeter;
        System.out.println(rosen);
        System.out.println(steine);
    }   
}