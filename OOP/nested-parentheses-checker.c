/*********************************************************
 *  Random practice project inspired by OOP Aufgabe 0301 *
 *  Tiny commandline tool to check whether parentheses   *
 *  or braces are nested properly.                       *
 *  Allowed Input: ( ) { }       no content in between!  *
 *  Released under MIT Licence, copyright by SDW         *
 *********************************************************/


#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define STACK_SIZE 100

// the 'stack'
char contents[STACK_SIZE] = {0};
// position (array index) of the top of the stack
int top = 0;

bool is_empty(void);
bool is_full(void);
void stack_overflow(void);
void stack_underflow(void);
void push(char c);
char pop();



int main(void)
{
    bool match = true;

    printf("Enter a series of (nested) parentheses and/or braces: ");
    char c = 0;
    while ((c = getchar()) != '\n')
    {
        if ((c == '(') || (c == '{'))
            push(c);
        else if ((c == ')') || (c == '}'))
        {
            char popped = pop();
            if (((popped == '(') && (c != ')')) || ((popped == '{') && (c != '}')))
            {
                match = false;
                break;
            }
        }
    }

    if (is_empty() && match)
        printf("Parentheses/braces are nested properly.\n");
    else
        printf("Parentheses/braces are -not- nested properly.\n");

    return 0;
}

bool is_full(void)
{
    return (top >= STACK_SIZE);
}


bool is_empty(void)
{
    return (top <= 0);
}


void stack_overflow(void)
{
    printf("Stack overflow.\n");
    exit(1);
}


__attribute__((noreturn)) void stack_underflow(void)
{
    printf("Parentheses/braces are -not- nested properly (Stack underflow).\n");
    exit(1);
}


void push(char c)
{
    if (is_full())
        stack_overflow();
    else
        contents[top++] = c;
    return;
}


char pop()
{
    if (is_empty())
        stack_underflow();
    else 
    {
        char popped = contents[--top];
        contents[top] = 0;
        return popped;
    }
}