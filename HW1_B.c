# include <stdio.h>

typedef unsigned char *ptr_bytes;

void show_float(float x)
{
  ptr_bytes s = (ptr_bytes) &x;
  for(int i=0; i < sizeof(x); i++)
  printf(" %.4x", s[i]);
  printf("\n");
}
float main()
{
  float a;
  printf ("Enter the value of float a: \n");
  scanf ("%f", &a);
  show_float(a);
  return 0;
}
