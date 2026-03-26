import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println( "Sum of Squares");
        System.out.print("n: ");
        int n1 = scanner.nextInt();
        System.out.println("Sum of squares = " + SumOfSquares.sumOfSquares(n1));
        System.out.println();

        //2
        System.out.println("Sum of Array Elements");
        System.out.print("array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Sum = " + SumOfArray.sumOfArray(arr, size));
        System.out.println();

        //3
        System.out.println("Sum of First n Integers");
        System.out.print("n: ");
        int n3 = scanner.nextInt();
        System.out.println("Sum = " + SumOfIntegers.sumOfIntegers(n3));
        System.out.println();

        //4
        System.out.println("Sum of Powers");
        System.out.print("Enter base b: ");
        int b = scanner.nextInt();
        System.out.print(" n: ");
        int n4 = scanner.nextInt();
        System.out.println("Sum = " + SumOfPowers.sumOfPowers(b, n4));
        System.out.println();

        //5
        System.out.println("Reverse Sequence");
        System.out.print("Enter n: ");
        int n5 = scanner.nextInt();
        System.out.println("Enter " + n5 + " numbers:");
        ReverseSequence.readAndPrintReverse(n5, scanner);
        System.out.println("\n");

        //6
        System.out.println("Reverse Strings");
        System.out.print("Enter n: ");
        int n6 = scanner.nextInt();
        System.out.println("Enter " + n6 + " strings:");
        ReverseStrings.readAndPrintStringsReverse(n6, scanner);
        System.out.println();

        //7
        System.out.println("Spiral Matrix");
        System.out.print("n: ");
        int n7 = scanner.nextInt();
        SpiralMatrix.printSpiralMatrix(n7);
        System.out.println();

        //8
        System.out.println("All Sequences");
        System.out.print("n and k: ");
        int n8 = scanner.nextInt();
        int k = scanner.nextInt();
        GenerateSequences.generateSequences(n8, k);
        System.out.println();

        //9
        System.out.println("String Permutations");
        System.out.print("string: ");
        String str = scanner.next();
        StringPermutations.printPermutations(str);
        System.out.println();

        //10
        System.out.println("Power of Two Test");
        System.out.println("Testing numbers from 0 to 32:");
        for (int i = 0; i <= 32; i++) {
            System.out.println(i + (PowerOfTwo.isPowerOfTwo(i) ? " is a power of two" : " is not a power of two"));
        }

        scanner.close();
    }
}