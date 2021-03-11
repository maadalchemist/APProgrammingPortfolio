import java.util.ArrayList;

/**
   This class generates permutations of a word.
*/
public class PermutationIterator
{
   public ArrayList<String> iterations;

   /**
      Permutation iterator for given word.
      @param aWord the word to permute
   */
   public PermutationIterator(String word) {
      iterations = permutations(word);
   }

   /**
      Generate next permutation.
      @return next permutation
   */
   // public String nextPermutation()
   // {
   //    if (word.length() == 0)
   //    {
   //       current++;
   //       return "";
   //    }
   //
   //    char c = word.charAt(current);
   //    String nextPermut = tailIterator.nextPermutation();
   //
   //    if (!tailIterator.hasMorePermutations())
   //    {
   //       current++;
   //       if (current >= word.length())
   //       {
   //          tailIterator = null;
   //       }
   //       else
   //       {
   //          if (current + 1 >= word.length())
   //          {
   //             tail = word.substring(0, current);
   //          }
   //          else
   //          {
   //             tail = word.substring(0, current)
   //                   + word.substring(current + 1, word.length());
   //          }
   //          tailIterator = new PermutationIterator(tail);
   //       }
   //    }
   //    return c + nextPermut;
   // }

   /**
      Determine if there are more permutations.
      @return true if more permutations
   */
   // public boolean hasMorePermutations()
   // {
   //    return current < word.length() || tailIterator != null
   //          && tailIterator.hasMorePermutations();
   // }

   public static ArrayList<String> permutations(String word)
   {
      ArrayList<String> result = new ArrayList<String>();

      // The empty string has a single permutation: itself
      if (word.length() == 0) {
         result.add(word);
         return result;
      }
      else {
         for (int i = 0; i < word.length(); i++) {
            String shorter = word.substring(0, i) + word.substring(i + 1);
            ArrayList<String> shorterPermutations = permutations(shorter);
            for (String s : shorterPermutations) {
               result.add(word.charAt(i) + s);
            }
         }
         return result;
      }
    }
}
