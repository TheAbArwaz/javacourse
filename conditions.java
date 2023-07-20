import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        //odd even
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
