/*******************************************************************
 *  Kleine Commandline appl. in C zum Testen d. Loesung zu UB01-03 *
 *  Autor: SDW                                                     *
 *  Referring to: OOP Uebungsblatt 1, Aufgabe 3                    * 
 *******************************************************************/

#include <stdio.h>

int main(void)
{
    printf("This program calculates the average of two integers.\n");
    printf("Enter an integer: ");
  
    double num1 = 0;
    scanf("%lf", &num1);

    double num2 = 0;
    double sum = num1;
    double count = 1;
    double average = 0;

    while (1)
    {
        printf("Enter another integer (0 to terminate): ");
        scanf(" %lf", &num2);
        sum += num2;
        count++;

        if (num2 != 0)
        {
            average = (num1 + num2) / 2;
            printf("The average of the last two numbers is: %.1lf\n", average);
            num1 = num2;
        }  
        else
        {
            average = (sum / (count-1));
            printf("The total average of all numbers is: %.1lf\n", average);
            break;
        }    
    }

    return 0;
}




/*********************************************************************
 *  Aufgabenstellung:                                                *
 *  Erstellen Sie einen Algorithmus als Pseudocode, bestehend aus    *
 *  elementaren Anweisungen, der folgendes leistet:                  *
 *  • Der Nutzer gibt nur ganze Zahlen ein und signalisiert das      *
 *  Ende seiner Eingabe, indem er 0 eingibt. Die Zahl 0 ist von      *
 *  allen Berechnungen ausgeschlossen!                               *
 *  • Für je zwei nacheinander eingegebene Zahlen, soll der          *
 *  Durchschnitt berechnet und ausgegeben werden (0 wird ignoriert). *
 *  • Für alle eingegebenen Zahlen soll der Durchschnitt berechnet   *
 *  und ausgegeben werden (0 wird ignoriert).                        *
 *  • Es ist garantiert, dass der Nutzer mindestens eine Zahl        *
 *  verschieden von 0 eingibt.Beispielhaft seine die folgenden       *
 *  Eingaben mit den erwarteten Ausgaben angeführt:                  *
 *                                                                   *
 *  1. Eingabe  1           Der Benutzer gibt nacheinander die       *
 *  2. Eingabe  2   1.5     Zahlen ein, sobald die 1 und die 2       *
 *  3. Eingabe  3   2.5     eingegeben wurde, wird der Durchschnitt  *
 *  4. Eingabe  4   3.5     von 1 und 2 berechnet und ausgegeben.    *
 *  5. Eingabe  5   4.5     Als naechstes gibt der Nutzer eine 3 ein,*
 *  6. Eingabe  0   3       somit wird der Durchschnitt von 2 und 3  *
 *  berechnet. Dies geht so weiter, bis der Nutzer 0 eingibt und nun *
 *  der Durchschnitt ueber alle 5 zuvor eingegebenen Zahlen          *
 *  berechnet und ausgegeben wird.                                   *
 *********************************************************************/
