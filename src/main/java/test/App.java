package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        double number1;
        double number2;

        Calc calculation = new Calc();

        System.out.println("Number1 ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number1 = Double.valueOf(br.readLine()).doubleValue();

        System.out.println("Number2 ?");
        number2 = Double.valueOf(br.readLine()).doubleValue();

        System.out.println("Addition result: " + calculation.sum(number1, number2));
        System.out.println("Substraction result:" + calculation.sub(number1, number2));
        System.out.println("Multiplication result: " + calculation.mult(number1, number2));
        System.out.println("Division result: " + calculation.div(number1, number2));


    }
}
