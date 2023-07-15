package main;

import com.google.common.base.Joiner;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BTVN Day1
        int n;
        Scanner sc = new Scanner(System.in);
        // create new array
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        System.out.println("bbb");
        System.out.println("hungpc1");
        System.out.println("tao la quyltt");

        int[] arrInt = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }

        int[] arrOutput = addArrayWith1(arrInt);
        System.out.println("Result: ");
        for (int i = 0; i < arrOutput.length; i++) {
            System.out.print(arrOutput[i]);
        }
    }

    public static int[] addArrayWith1(int[] arrInput) {

        // convert array to string
        String stringNumber = Joiner.on("").join(Collections.singleton(arrInput));

        // Convert string to int
        int intNumber = Integer.parseInt(stringNumber);

        // Plus 1
        intNumber++;

        // Convert int to sting
        String stringResult = Integer.toString(intNumber);

        // Get first zero in array
        int numberZeroFirst = arrInput.length - stringResult.length();
        StringBuilder zeroFirst = new StringBuilder();
        if (numberZeroFirst > 0) {
            zeroFirst.append("0".repeat(numberZeroFirst));
            stringResult = zeroFirst + stringResult;
        }

        // Convert to int array and Output result
        int[] intArrResult = new int[stringResult.length()];

        System.out.println("Result: ");
        for (int i = 0; i < intArrResult.length; i++) {
            intArrResult[i] = Character.getNumericValue(stringResult.charAt(i));
        }
        return intArrResult;
    }
}
