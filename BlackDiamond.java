import java.util.Scanner;
class BlackDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer for pattern size: ");
    // TODO accept an integer input from the console using Scanner.
    int n = scanner.nextInt();
    // TODO code to generate star pattern below here.
    // top half
    for (int i = 0; i < n; i++) {
      for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int x = 0; x <= (i*2); x++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // bottom half
    for (int i = n-1; i >= 1; i--) {
      for (int y = 0; y <= (n-i); y++) {
        System.out.print(" ");
      }
      for (int z = 1; z <= (2*i)-1; z++) {
        System.out.print("*");
    }
      System.out.println();
    }
  }
}

