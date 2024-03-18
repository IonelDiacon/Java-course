package homework;
import java.util.Scanner;


public class Main {

//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Enter an integer:");
////        int number = scanner.nextInt();
////
////        if (number % 2 == 0) {
////            System.out.println("Even");
////        } else {
////            System.out.println("Odd");
////        }
////
////        scanner.close();
//    }


//    public static void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter a number betwen 1-12 :");
//        int number = scanner.nextInt();
//                 System.out.println("your number is"+ number);
//        if(number <= 12 && number > 0){
//            switch (number){
//                case 1:
//                    System.out.println("mounth 1");
//                    break;
//                case 2:
//                    System.out.println("mounth 2");
//                    break;
//                case 3:
//                    System.out.println("mounth 3");
//                    break;
//                case 4:
//                    System.out.println("mounth 4");
//                    break;
//                case 5:
//                    System.out.println("mounth 5");
//                    break;
//                case 6:
//                    System.out.println("mounth 6");
//                    break;
//                case 7:
//                    System.out.println("mounth 7");
//                    break;
//                case 8:
//                    System.out.println("mounth 8");
//                    break;
//                case 9:
//                    System.out.println("mounth 9");
//                    break;
//                case 10:
//                    System.out.println("mounth 10");
//                    break;
//                case 11:
//                    System.out.println("mounth 11");
//                    break;
//                case 12:
//                    System.out.println("mounth 12");
//                    break;
//            }
//
//           }
//        else{
//            System.out.println("Invalid Number please try again:");
//
//        }
//
//    }
//}
//


//    public static void main(String[] args) {
//
//        int[] myNum = {1, 2, 3, 4, -2, 4, -4, -56, 23};
//        int count = countNegativeIntegers(myNum);
//    }
//
//    public static int countNegativeIntegers(int[] myNum) {
//
//        int count = 0;
//
//        for (int i = 0; i < myNum.length; i++) {
//            if (myNum[i] < 0) {
//                count++;
////
//                System.out.println(myNum[i]);
//
//
//             }
//
//
//          }
//        System.out.println("Number of negative INTEGERS IS : "+count);
//
//        return count;
//        }
//    }

//
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//
//            System.out.print("Enter a string: ");
//            String inputString = scanner.nextLine();
//
//
//            String reversedString = reverseString(inputString);
//            System.out.println("Reversed string: " + reversedString);
//
//            scanner.close();
//        }
//
//        public static String reverseString(String str) {
//
//            StringBuilder reversed = new StringBuilder();
//           StringBuilder reversed1 =new StringBuilder("Ionel Diacon");
//
//            reversed1.reverse();
//            System.out.println("metoda prin clasa StringBuilder: " + reversed1.toString());
//            for (int i = str.length() - 1; i >= 0; i--) {
//                reversed.append(str.charAt(i));
//            }
//            return reversed.toString();
//        }
//    }


//
//    public static void main (String[] args){
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Enter a number");
//    int number = scanner.nextInt();
//
//    System.out.println("Fibonaci series of" +number+"numbers");
//    for (int i = 0;i < number; i++){
//        System.out.println(fibonaci(i)+" ");
//
//    }
//        scanner.close();
//    }
//    public static int fibonaci(int i){
//        if(i <= 1) {
//            return i;
//        }else{
//                return fibonaci(i-1)+fibonaci(i-2);
//            }
//
//        }
//    }

//public static void main(String[] args){
// Scanner scanner = new Scanner(System.in);
// int sum = 0;
// int number;
//
// System.out.println("number -1 will stop ");
// while(true){
//     System.out.println("Enter a number:");
//     number=scanner.nextInt();
//     if(number==-1){
//         break ;
//     }else{
//         sum+=number;
//
//
//     }
// }
//    System.out.println("Sum of all numers is: "+sum);
//    scanner.close();
//}
//}
//public static void main (String[] args) {
//    int times = 10;
//    System.out.println("0");
//    for (int i = 0; i <= times; i++) {
//
//        System.out.println(fibonaci(i));
//
//    }
//}
//        public static int fibonaci(int i){
//    if(i<=1){
//        return 1;
//    }else{
//        return fibonaci(i-1) + fibonaci(i-2);
//    }
//    }
//}


//public static void main (String[]args){
//  int[] arr ={1,2,3,4,5,6,7,8,9,0,11,12,32,24,15,16,26};
//  for(int i:arr){
//      if(i % 2 == 0){
//          System.out.println("Even:"+i);
//
//      }else{
//          System.out.println("Odd:"+i);
//      }
//  }
//}
////}
//    public static void main(String[] args) {
//        StringBuilder options = new StringBuilder("Option 1\nOption 1\nOption 3\nEXIT 4");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(options);
//        System.out.println("Enter number of option:");
//
//        int option = Integer.parseInt(scanner.nextLine());
//
//
//        boolean condition= true;
//        while (condition) {
//            switch (option) {
//                case 1:
//                    System.out.println("You selected Optionq 1 from");
//                    System.out.println(options);
//                    break;
//                case 2:
//                    System.out.println("You selected Optionq 2 from");
//                    System.out.println(options);
//                    break;
//                case 3:
//                    System.out.println("You selected Optionq 3 from");
//                    System.out.println(options);
//                    break;
//                case 4:
//                    System.out.println("You stoped.");
//                    break;
//            }
//            scanner.close();
//            condition = false;
//        }
//    }
//}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        System.out.println("Enter 10 numbers:");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            int number = scanner.nextInt();
//
//            if (number <= 5) {
//
//                continue;
//            }
//            sum += number;
//        }
//        System.out.println("Sum of numbers greater than 5: " + sum);
//        scanner.close();
//    }
//}
//



