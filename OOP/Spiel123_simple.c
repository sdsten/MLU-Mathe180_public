/*******************************************************************
 *  Kleine Commandline appl. in C zum Testen d. Loesung zu UB02-03 *
 *  Version 1, simpel                                              *
 *  Autor: SDW                                                     *
 *  Re: OOP Uebungsblatt 2, Aufgabe 3: "Spiel (1,2,3)"             *
 *******************************************************************/

#include <stdio.h>

int main(void)
{
    printf("Game (1, 2, 3)\n");

    // Eingabe der Grenze
    int limit = 0;
    while (limit < 8);
    {
        printf("Set limit (min 8): ");
        scanf("%d", &limit);
    }


    int num1 = 0;
    int num2 = 0;
    int sum = 0;
    // Ich verwende eine pseudo-bool var hier als "Schalter" der nach
    // jeder Eingabe hin und herwechselt, um festzuhalten welcher User
    // zuletzt dran war, dh. die Grenze ueberschritten=verloren hat
    int flip = 0;

    // Zahleneingaben der Spieler
    while (true)
    {
        do
        {
            printf("Player 1: ");
            scanf(" %d", &num1);
        }
        while (num1 <=0 || num1 > 3);
        sum += num1;
        flip = 1;
        if (sum > limit)
            break;

        do
        {
            printf("Player 2: ");
            scanf(" %d", &num2);
        }
        while (num2 <=0 || num2 >3);
        sum += num2;
        flip = 0;
        if (sum > limit)
            break;
    }

    // Ausgabe des Gewinners und der Differenz
    int diff = sum - limit;
    printf("Player %s lost. Difference: %d \n", flip ? "1" : "2", diff);

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
