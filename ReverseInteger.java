import java.util.Deque;

import java.util.*;

// public class ReverseInteger {

//     public static void main(String[] args) {
//         Deque<Integer> dq = new ArrayDeque<Integer>();

//         int num = 123;

//         if (num < 0) {
//             while (num < 0) {
//                 dq.offerLast(num % 10);
//                 // System.out.println(num % 10);
//                 num = num / 10;
//             }
//         }
//         while (num > 0) {
//             dq.offerLast(num % 10);
//             // System.out.println(num % 10);
//             num = num / 10;

//         }
//         int reverseNumber = 0;
//         int pow = dq.size() - 1;
//         while (!dq.isEmpty()) {
//             reverseNumber += dq.pop() * Math.pow(10, pow);

//             if (reverseNumber > Math.pow(2, 30) || reverseNumber > Math.pow(-2, 30)) {
//                 reverseNumber = 0;
//             }
//             pow--;
//         }

//         System.out.println(reverseNumber);
//     }

// }

class ReverseInteger {
    public static int reverse(int x) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        int num = x;

        if (num < 0) {
            while (num < 0) {
                dq.offerLast(num % 10);
                // System.out.println(num % 10);
                num = num / 10;
            }
        }

        while (num > 0) {
            dq.offerLast(num % 10);
            // System.out.println(num % 10);
            num = num / 10;

        }

        int reverseNumber = 0;
        int pow = dq.size() - 1;
        while (!dq.isEmpty()) {
            reverseNumber += dq.pop() * Math.pow(10, pow);
            if (reverseNumber > 0 && reverseNumber > Math.pow(2, 30)) {
                return 0;
            }

            if (reverseNumber < 0 && reverseNumber <= -2147483648) {

                return 0;
            }

            pow--;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        // reverse(123);
        System.out.println(reverse(-123));
    }
}