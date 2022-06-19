import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите числа для операции (* / + -), пример: (1 * 1)");

        while (true) {
            String target = scanner.nextLine();
            String[] input = target.split(" ");
            String simv = input[1];
            long numOne = Integer.parseInt(input[0]);
            long numTwo = Integer.parseInt(input[2]);

            if (simv.equals("*")) {
                long resultUm = numOne * numTwo;
                System.out.println(resultUm);
            } else if (simv.equals("/")) {
                long resultDel = numOne / numTwo;
                System.out.println(resultDel);
            } else if (simv.equals("+")) {
                long resultPlus = numOne + numTwo;
                System.out.println(resultPlus);
            } else if (simv.equals("-")) {
                long resultMinus = numOne + numTwo;
                System.out.println(resultMinus);
            } else {
                System.out.println("Конец");
            }
        }
    }
}