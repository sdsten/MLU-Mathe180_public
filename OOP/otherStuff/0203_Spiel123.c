/*******************************************************************
 *  Kleine Commandline appl. in C zum Testen d. Loesung zu UB02-03 *
 *  Version 2, kompakt.                                            *
 *  Autor: SDW                                                     *
 *  Referring to: OOP Uebungsblatt 2, Aufgabe 3: "Spiel (1,2,3)"   *
 *******************************************************************/

#include <stdio.h>
#include <stdbool.h>

int main(void)
{
    printf("Game (1, 2, 3)\n");

    // Eingabe der Grenze
    int limit = 0;
    do
    {
        printf("Set limit (min 8): ");
        scanf("%d", &limit);
    }
    while (limit < 8);


    int num = 0;
    int sum = 0;
    bool isPlayer1 = true;

    // Zahleneingaben der Spieler
    while (1)
    {
        do
        {
            printf("Player %s: ", isPlayer1 ? "1" : "2");
            scanf(" %d", &num);
        }
        while (num <=0 || num > 3);
        sum += num;
        isPlayer1 = !isPlayer1;
        if (sum > limit)
            break;
    }

    // Ausgabe des Gewinners und der Differenz
    int diff = sum - limit;
    printf("Player %s lost. Difference: %d \n", isPlayer1 ? "2" : "1", diff);

    return 0;
}


/*******************************************************************
 *  Aufgabenstellung:                                              *
 *  Erstellen Sie einen Pseudocode, welcher das folgende           *
 *  kleine Spiel umsetzt:                                          *
 *  • es gibt zwei Spieler, welche abwechselnd eine ganze          *
 *  Zahl zwischen 1 und 3 wählen                                   *
 *  • die gewählten Zahlen werden immer zusammenaddiert            *
 *  • wird dabei eine zuvor festgelegte obere Grenze               *
 *  überschritten, so hat der Spieler verloren, welcher zuletzt    *
 *  eine Zahl gewählt hat                                          *
 *  Es wird zuerst eine obere Grenze eingelesen (zuvor             *
 *  Ausgabe ‘Grenze:‘), welche mindestens 8 sein muss. Solange     *
 *  eine kleinere Zahl eingegeben wird, muss erneut eine Zahl      *
 *  eingegeben werden (wobei jedesmal Ausgabe ‘Grenze:‘ erfolgt).  *
 *  Anschließend beginnt das Spiel. Die Spieler, bei Spieler 1     *
 *  beginnend, wechseln sich nacheinander ab (wobei jedesmal       *
 *  ausgegeben wird, welcher Spieler dran ist) und wählen jeweils  *
 *  eine Zahl zwischen 1 und 3. Immer wenn eine andere Zahl        *
 *  eingegeben wird, muss der entsprechende Spieler erneut eine    *
 *  Zahl eingeben. Akzeptierte Eingaben werden zu den vorherigen   *
 *  aufaddiert. Sobald ein Spieler dadurch die obere Grenze        *
 *  überschreitet, wird ausgegeben welcher Spieler verloren hat    *
 *  und um wie viel die obere Grenze überschritten wurde           * 
 *  (nur die Zahl).                                                *
 *******************************************************************/
