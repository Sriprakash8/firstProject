import java.security.Principal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        int i = 0;
//        System.out.print(a+ " ");
//        System.out.print(b+" ");
//        while(i<=15) {
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print(b+" ");
//            i++;
//        }
//        String month = "jvjrr";
//        String x = month.toLowerCase();
//        switch(x){
//            case "jan" :
//            case "mar" :
//            case "May" :
//                System.out.println("31");
//                break;
//            case "Feb" :
//                System.out.println("28");
//                break;
//            case "Apr" :
//                System.out.println("30");
//                break;
//            default:
//                System.out.println("Invalid entry");
//        }
        // String arr[] = {"aa","bb","cc","dd","ee"};
        // for (int i = 0; i<5; i++) {
        //   System.out.println(arr[i]);
    //}

//        Scanner sc= new Scanner(System.in);
//        int [] arr = new int[5];
//
//        for (int i = 0; i<5; i++) {
//            System.out.println("Enter your num: " +(i+1));
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        Scanner sc= new Scanner(System.in);
//        int [][] arr = new int[5][3];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Enter the number [" + (i + 1) + " "+ (j + 1) + "] :");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//        System.out.println();
//
//
//
//        for (int i=0; i<5 ; i++){
//                int sum = 0;
//                float average = 0;
//            for (int j=0; j<3 ; j++){
//                sum += arr[i][j];
//            }
//            average = sum/5f;
//            System.out.println("The average of array " + ( i + 1) + " is " + average);
//        }


//        int[] numbers = { 1, 4, 4, 5, 7, 10, 15, 23, 5, 10};
//        int sum = 0;
//        for(int num : numbers) {
//            sum = sum + num;
//        }
//            System.out.println("sum of 10 decimal numbers are: " + Arrays.toString(numbers) + " = " + sum);
//
//        String[] name = { "Sriprakash" + "Sriram" };
//        System.out.println("My Full name is " + Arrays.toString(name));


        System.out.println("**MORTGAGE CALCULATOR**");

        int principle = (int) readNumber("Principle: ",1000,1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Years (Period): ", 1, 30);

        double mortgage = calculateMortgage(principle, annualInterestRate, years);
        String mortgageCalculator = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage is : " + mortgageCalculator);

    }
    public static double readNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = sc.nextByte();
            if (value >= min && value <= max)
                break;
            System.out.print("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principle, float annualInterestRate, byte years) {


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        float monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (MONTHS_IN_YEAR * years);
        double mortgage = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;

    }
}

//
//        int number = sc.nextInt();
//        if (number % 5 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else
//            System.out.println();