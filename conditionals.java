import java.util.Scanner;

// public class conditionals {
//     public static void main(String[] args) {


//         //if else age
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age > 18) {
//             System.out.println("Adult");

//         } else {
//             System.out.println("notA");

       // }
//buttons with if else and switch
 Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
//        if (button == 1){
//            System.out.println("namaste");
//
//        } else if (button == 2){
//            System.out.println("bnjour");
//
//        } else if (button == 3) {
//            System.out.println("hello");
//
//
//        } else {
//            System.out.println("invalid");
//        }
        switch (button){
            case 1 :
                System.out.println("hello");
                break;
            case 2:
                System.out.println(" namaste");
                break;
            case 3:
                System.out.println(" bonjour");
                break;
            default:
                System.out.println("invalid ");
        }
   }
}

    


