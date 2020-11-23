import java.util.Random;

public class ArrayMethods {
  public static void main(String[] args) {
    Random random = new Random();

    int[] randArray = new int[100];
    for (int i = 0; i < randArray.length; i++) {
      randArray[i] = (random.nextInt()%100);
    }

    System.out.print("Here is the entire array:  ");
    for (int member : randArray) {
      System.out.print(member);
      System.out.print(' ');
    }
    System.out.println();

    int maxValue = -99;
    System.out.print("The maximum:  ");
    for (int member : randArray) {
      if (member > maxValue) { maxValue = member; }
    }
    System.out.println(maxValue);

    int countNegative = 0;
    System.out.print("Number of negative values:  ");
    for (int member : randArray) {
      if (member < 0) { countNegative ++; }
    }
    System.out.println(countNegative);
  }

  public ArrayMethods() {}

  public int sum(int[] a) {
    int sum = 0;
    for (int mem : a) {
      sum += mem;
    }
    return sum;
  }

  public double average(int[] a) {
    double avg = 0;
    for (int mem : a) {
      avg += mem;
    }
    return avg / a.length;
  }

  public int min(int[] a) {
    int min = a[0];
    for (int mem : a) {
      if (mem < min) { min = mem; }
    }
    return min;
  }

  public int max(int[] a) {
    int max = a[0];
    for (int mem : a) {
      if (mem > max) { max = mem; }
    }
    return max;
  }

  public void print(int[] a) {
    for (int mem : a) {
      System.out.print(mem);
      System.out.print(" | ");
    }
    System.out.println();
  }

  public boolean contains(int[] a, int check) {
    for (int mem : a) {
      if (mem == check) { return true; }
    }
    return false;
  }

  public int search(int[] a, int check) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == check) {
        return i;
      }
    }
    return -1;
  }

  public int[] remove(int[] a, int point) {
    a[point] = a[a.length - 1];
    int[] out = new int[a.length - 1];
    for (int i = 0; i < out.length; i++) {
      out[i] = a[i];
    }
    return out;
  }

  public int[] add(int[] a, int add) {
    int[] out = new int[a.length + 1];
    for (int i = 0; i < out.length; i++) {
      out[i] = a[i];
    }
    out[a.length - 1] = add;
    return out;
  }

  public void swap(int[] a, int p1, int p2) {
    int temp = a[p1];
    a[p1] = a[p2];
    a[p2] = temp;
  }

  public int[] clone(int[] a) {
    int[] out = new int[a.length];
    for (int i = 0; i < out.length; i++) {
      out[i] = a[i];
    }
    return out;
  }
}

// Swapping two elements
// Copying the entire array
