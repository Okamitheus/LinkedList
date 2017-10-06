#include <stdio.h>
#include <stdlib.h>

int addbyVal (int a, int b)
{
  return a + b;
}

int addbyRef (int *x, int *y)
{
  return *x + *y;
}

void main(int argc, char *argv [])
{
  int a = atoi (argv[1]);
  int b = atoi (argv[2]);
  int sumV = addbyVal (a, b);
  int sumR = addbyRef (&a, &b);
  printf ("The sum of %d and %d is %d\n", a, b, sumV);
  printf ("The sum of %d and %d is %d\n", a, b, sumR);
}
