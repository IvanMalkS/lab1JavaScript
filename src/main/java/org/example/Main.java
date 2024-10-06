package org.example;
import java.util.Scanner;

public class Main {
    public double fraction (double x) {
        return x - ((int) x);
    }

    public int charToNum (char x) {
        return switch (x) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> 0;
        };
    }

    public Boolean is2Digits (int x) {
        return abs(x) > 9 && abs(x) < 180;
    }

    public Boolean isInRange (int a, int b, int num) {
        int maxRange = max(a, b);
        int minRange = min(a, b);
        return num >= minRange && num <= maxRange;
    }

    public Boolean isEqual (int a, int b, int c) {
        return a == b && a == c;
    }

    public Boolean is35 (int x) {
        return (x % 5 == 0 || x % 3 == 0) && !(x % 5 == 0 && x % 3 == 0);
    }

    public int max3 (int x, int y, int z) {
        return max(x, max(y, z));
    }

    public int sum2 (int x, int y) {
        int sum = x + y;
        return sum > 10 && sum < 19 ? 20 : sum;
    }

    public String day(int x) {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    public String listNums(int x) {
        if (x < 0) return "";
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += (i + "") + " ";
        }
        return result.trim();
    }

    public String chet (int x) {
        if (x < 0) return "";
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += (i + "") + " ";
        }
        return result.trim();
    }

    public int numLen (long x) {
        int counter = 0;
        while (x % 10 != 0) {
            x /= 10;
            counter++;
        }
        return counter;
    }

    public void square (int x) {
        String result = "";
        for (int i = 0; i <= x - 1; i ++) {
            for (int j = 0; j <= x; j ++) {
                result += '*';
            }
            result += "\n";
        }
        System.out.println(result);
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int maxAbs (int[] arr) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) > max) {
                max = abs(arr[i]);
                result = arr[i];
            };
        }
        return result;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            return arr;
        }

        int newLength = arr.length + ins.length;
        int[] result = new int[newLength];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + (i - pos)] = arr[i];
        }

        return result;
    }

    public int[] reverseBack (int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    public int[] findAll (int[] arr, int x) {
        int[] preResult = new int[arr.length];
        int resultLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                preResult[i] = i;
                resultLength++;
            } else {
                preResult[i] = -1;
            }
        }
        int[] result = new int[resultLength];
        int j = 0;
        for (int i = 0; i < preResult.length; i++) {
            if (preResult[i] != -1) {
                result[j] = preResult[i];
                j++;
            }
        }

        return result;
    }

    public int abs (int x) {
        return x < 0 ? -x : x;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public void arrayPrint(int[] items) {
        System.out.print('[');
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
            if (i < items.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Variant 1");


        System.out.println("1 - methods");
        System.out.println("2 - conditions");
        System.out.println("3 - loops");
        System.out.println("4 - arrays");

        System.out.println("Enter task part: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Tasks in tasks 1 3 5 7 9\n");
        switch (choice) {
            case 1:
                System.out.println("\nEnter a number to test task 1: ");
                double x = scanner.nextDouble();
                double fractionPart = main.fraction(x);
                System.out.printf("Fraction part: %.2f%n", fractionPart);

                System.out.println("\nEnter a character to test task 3: ");
                char y = scanner.next().charAt(0);
                System.out.println("Character to number: " + main.charToNum(y));

                System.out.println("\nEnter a number to test task 5: ");
                int z = scanner.nextInt();
                System.out.println("Is 2 digits: " + main.is2Digits(z));

                System.out.println("\nEnter 3 numbers to test task 7: ");
                System.out.print("Enter a: ");
                int a = scanner.nextInt();
                System.out.print("Enter b: ");
                int b = scanner.nextInt();
                System.out.print("Enter num: ");
                int num = scanner.nextInt();
                System.out.println("Is in range: " + main.isInRange(a, b, num));

                System.out.println("\nEnter 3 numbers to test task 9: ");
                System.out.print("Enter a: ");
                int a2 = scanner.nextInt();
                System.out.print("Enter b: ");
                int b2 = scanner.nextInt();
                System.out.print("Enter c: ");
                int c2 = scanner.nextInt();
                System.out.println("Is a, b, c equal: " + main.isEqual(a2, b2, c2));
                break;
            case 2:
                System.out.println("\nEnter 1 numbers to test task 1: ");
                System.out.print("Enter x: ");
                int X = scanner.nextInt();
                System.out.println("Abs is: " + main.abs(X));

                System.out.println("\nEnter 1 numbers to test task 3: ");
                int X1 = scanner.nextInt();
                System.out.println("Is divided by 35: " + main.is35(X1));

                System.out.println("\nEnter 3 numbers to test task 5: ");
                System.out.print("Enter x: ");
                int X2 = scanner.nextInt();
                System.out.print("Enter y: ");
                int Y2 = scanner.nextInt();
                System.out.print("Enter Z: ");
                int Z2 = scanner.nextInt();
                System.out.println("The max number is: " + main.max3(X2, Y2, Z2));

                System.out.println("\nEnter 2 numbers to test task 7: ");
                System.out.print("Enter x: ");
                int X3 = scanner.nextInt();
                System.out.print("Enter y: ");
                int Y3 = scanner.nextInt();
                System.out.println("Sum of numbers: " + main.sum2(X3, Y3));

                System.out.println("\nEnter 1 numbers to test task 9: ");
                System.out.print("Enter x: ");
                int X4 = scanner.nextInt();
                System.out.println("The day of week is: " + main.day(X4));
                break;
            case 3:
                System.out.println("\nEnter 1 numbers to test task 1: ");
                System.out.print("Enter x: ");
                int x13 = scanner.nextInt();
                System.out.println("List of nums: " + main.listNums(x13));

                System.out.println("\nEnter 1 numbers to test task 3: ");
                System.out.print("Enter x: ");
                int x23 = scanner.nextInt();
                System.out.println("List of nums: " + main.chet(x23));

                System.out.println("\nEnter 1 numbers to test task 5: ");
                System.out.println("Enter x");
                int X33 = scanner.nextInt();
                System.out.println("Number length is: " + main.numLen(X33));

                System.out.println("\nEnter 1 numbers to test task 7: ");
                System.out.print("Enter x: ");
                main.square(scanner.nextInt());

                System.out.println("\nEnter 1 numbers to test task 9: ");
                System.out.print("Enter x: ");
                main.rightTriangle(scanner.nextInt());
                break;
            case 4:
                System.out.println("\nEnter an array to test task 1: ");
                System.out.print("Enter array length: ");
                int length3 = scanner.nextInt();
                while (length3 <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    length3 = scanner.nextInt();
                }
                int[] arr3 = new int[length3];
                for (int p = 0; p < arr3.length; p++) {
                    System.out.print("Enter array value: ");
                    arr3[p] = scanner.nextInt();
                }
                System.out.println("\nEnter x");
                int X14 = scanner.nextInt();
                System.out.println("Index of X: " + main.findFirst(arr3, X14));

                System.out.println("\nEnter an array to test task 3: ");
                System.out.print("Enter array length: ");
                int length4 = scanner.nextInt();
                while (length4 <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    length4 = scanner.nextInt();
                }
                int[] arr4 = new int[length4];
                for (int p = 0; p < arr4.length; p++) {
                    System.out.print("Enter array value: ");
                    arr4[p] = scanner.nextInt();
                }
                System.out.println("Max abs: " + main.maxAbs(arr4));

                System.out.println("\nEnter an array to test task 5: ");
                System.out.print("Enter array length: ");
                int length5 = scanner.nextInt();
                while (length5 <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    length5 = scanner.nextInt();
                }
                int[] arr5 = new int[length5];
                for (int p = 0; p < arr5.length; p++) {
                    System.out.print("Enter array value: ");
                    arr5[p] = scanner.nextInt();
                }
                System.out.println("Enter an array to insert");
                System.out.print("Enter array length: ");
                int lengthIns = scanner.nextInt();
                while (lengthIns <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    lengthIns = scanner.nextInt();
                }
                int[] ins = new int[lengthIns];
                for (int p = 0; p < ins.length; p++) {
                    System.out.print("Enter array value: ");
                    ins[p] = scanner.nextInt();
                }
                System.out.println("Enter pos: ");
                int pos = scanner.nextInt();
                System.out.println("Inserted array: ");
                main.arrayPrint(main.add(arr5, ins, pos));

                System.out.println("\nEnter an array to test task 7: ");
                System.out.print("Enter array length: ");
                int length6 = scanner.nextInt();
                while (length6 <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    length6 = scanner.nextInt();
                }
                int[] arr6 = new int[length6];
                for (int p = 0; p < arr6.length; p++) {
                    System.out.print("Enter array value: ");
                    arr6[p] = scanner.nextInt();
                }
                main.arrayPrint(main.reverseBack(arr6));

                System.out.println("\nEnter an array to test task 9: ");
                System.out.print("Enter array length: ");
                int length7 = scanner.nextInt();
                while (length7 <= 0) {
                    System.out.println("Array length must be positive. Please enter a positive value: ");
                    length7 = scanner.nextInt();
                }
                int[] arr7 = new int[length7];
                for (int p = 0; p < arr7.length; p++) {
                    System.out.print("Enter array value: ");
                    arr7[p] = scanner.nextInt();
                }
                System.out.println("Enter x");
                int X94 = scanner.nextInt();
                main.arrayPrint(main.findAll(arr7, X94));
                break;
            default:
                System.out.println("Invalid task number");
                break;
        }
    }
}