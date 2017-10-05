#include <stdio.h>
#include <stdlib.h>

int add (int x, int y)
{
  return x + y;
}
void main(int argc, char *argv[])
{
  int x, y, sum;
  x = atoi (argv[1]);
  y = atoi (argv[2]);
  sum = add (x, y);
  printf ("The sum of %d and %d is %d\n", x, y, sum);
}
