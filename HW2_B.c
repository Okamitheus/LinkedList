#include <stdio.h>
#include <stdlib.h>

int add (int *x, int *y)
{
  return *x + *y;
}
void main(int argc, char *argv [])
{
  int a = atoi (argv[1]);
  int b = atoi (argv[2]);
  int sum = add (&a, &b);
  printf ("The sum of %d and %d is %d\n", a, b, sum);
}
