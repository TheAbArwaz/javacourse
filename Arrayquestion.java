import java.util.Scanner;

public class Arrayquestion {
    //Take an array as input from the user. search for a given number x
    // and print the index at which it occurs
    //linear search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //array size
        int numbers[] = new int[size]; //define array
        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt(); //array ke numbers ko input lo
        }
        int x = sc.nextInt(); //input x jisko dhundna h
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == x) {
                System.out.println(" x found at index : " + i);
            }
    }
}

