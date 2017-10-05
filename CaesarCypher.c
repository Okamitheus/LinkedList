#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cypher (int inLetter, int K)
{
  if (inLetter >= 97 && inLetter <= 122)
  {
    if (inLetter + K <= 122)
    {
      return inLetter + K;
    }
    else
    {
      return inLetter + (K - 26);
    }
  }
  else
  {
    return inLetter;
  }
}

void cypherP(int inLetter, int outLetter, int K)
{
  printf ("Enter a (lower case) phrase to be encrypted: ");
  scanf (%d, phrase[]);
  int i = 0;
  for (i=0; i=sizeof(phrase); i++)
  {
    inLetter = phrase[i];
    outLetter = cypher (inLetter, K);
    printf ("%c", outLetter);
  }
  printf ("\n");
}

void main(int argc, const char *argv [])
{
  int K = atoi (argv[1]);
  int inLetter, outLetter;
  int[] phrase = new int[];
  if (K >= 1 && K <= 26)
  {
    cypherP();
  }
  else
  {
    printf ("Invalid degree, please try again.\n");
    scanf (%d, K);
    cypherP();
  }
}
