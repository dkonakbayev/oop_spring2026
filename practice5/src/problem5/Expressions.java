package problem5;

import java.io.*;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Expressions {
    public static void main(String[] args) {
        String inputFile = "expressions.txt";
        String resultsFile = "results.txt";
        String logFile = "log.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            PrintWriter resultsWriter = new PrintWriter(new FileWriter(resultsFile));
            PrintWriter logWriter = new PrintWriter(new FileWriter(logFile));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    StringTokenizer st = new StringTokenizer(line, "+-*/", true);

                    if (!st.hasMoreTokens())
                        throw new NoSuchElementException();
                    double op1 = Double.parseDouble(st.nextToken());

                    if (!st.hasMoreTokens())
                        throw new NoSuchElementException();
                    String operator = st.nextToken();

                    if (!st.hasMoreTokens())
                        throw new NoSuchElementException();
                    double op2 = Double.parseDouble(st.nextToken());

                    double result;
                    switch (operator) {
                        case "+": result = op1 + op2; break;
                        case "-": result = op1 - op2; break;
                        case "*": result = op1 * op2; break;
                        case "/": result = op1 / op2; break;
                        default:
                            throw new UnsupportedOperationException();
                    }

                    resultsWriter.println(line + " = " + result);

                } catch (NoSuchElementException e) {
                    logWriter.println("Missing operand: " + line);
                } catch (NumberFormatException e) {
                    logWriter.println("Invalid number: " + line);
                } catch (UnsupportedOperationException e) {
                    logWriter.println("Unsupported operator: " + line);
                }
            }
            System.out.println("Processing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}