public class PermutationTester {
    public static void main(String[] args) {
      PermutationIterator drip = new PermutationIterator("drip");
      PermutationIterator pog = new PermutationIterator("pog");
      PermutationIterator amongus = new PermutationIterator("amongus");

      for(String i : drip.iterations) {
          System.out.println(i);
      }
      System.out.println();
      for(String i : pog.iterations) {
          System.out.println(i);
      }
      System.out.println();
      for(String i : amongus.iterations) {
          System.out.println(i);
      }
      System.out.println();
    }
}
