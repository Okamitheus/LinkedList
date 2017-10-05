# include <stdio.h>
/*typedef unsigned char *ptr_bytes;

void show_int(int x)
{
  ptr_bytes s = (ptr_bytes) &x;
  for(int i=0; i < sizeof(int); i++)

}
*/
int main()
{
  unsigned int a;
  int b;
  printf ("Enter the value of int a: \n");
  scanf ("%d", &a);
  b = a;
  printf ("%X\n", b);
  //show_int(a);
return 0;
}
