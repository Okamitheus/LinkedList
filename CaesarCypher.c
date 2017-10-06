#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int cypher (int inLetter, int K)
{
  if (inLetter < 97 || inLetter > 122 || K == 26)
  {
    return inLetter;
  }
    else
      if (inLetter + K > 122)
      {
        return inLetter + (K - 26);
      }
      else
        return inLetter + K;
}

int badDegree()
{
  printf ("Invalid degree, please try again.\n");
  return scanf("%d");
}

void cypherPrint (int inLetter, int outLetter, int K, int *esc, char *phrase)
{
  printf ("Enter a (lower case) phrase to be encrypted:\n");
  scanf ("%s", phrase);
  for (int i=0; i<=strlen(phrase); i++)
  {
    inLetter = phrase[i];
    outLetter = cypher (inLetter, K);
    printf ("%c", outLetter);
  }
  printf("\n");
}

void main (int argc, const char *argv [])
{
  int K = atoi (argv[1]);
  int inLetter, outLetter;
  char *phrase = (char*) malloc( 35 );
  while (K > 26)
  {
    K = badDegree();
  }
  cypherPrint(inLetter, outLetter, K, &esc, phrase);
  printf("Thank you for using the CaesarCypher!\n");
  free(phrase);
}
