import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) { encryptNum();}

    static void encryptNum() {

        System.out.println("Enter phone number: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        char[] numArray = num.toCharArray();
        System.out.print("Your entered number is: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(numArray[i]);
        }
        System.out.println(" ");
        System.out.print("Your encrypted number is: ");
        for (int i = 0; i < 11; i++) {
            byte[] i1 = BigInteger.valueOf(Long.parseLong(String.valueOf(numArray[i]))).toByteArray();
            System.out.print(i1);
        }

    }
}

