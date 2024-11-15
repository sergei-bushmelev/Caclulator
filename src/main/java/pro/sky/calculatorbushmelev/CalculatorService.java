package pro.sky.calculatorbushmelev;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String answerHello() {
        return "Добро пожаловать в калькулятор";
    }

    public void noNull(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Нет параметра");
        }
    }

    public String calculateSum(int num1, int num2) {
        noNull(num1, num2);
        int sum = num1 + num2;
        return String.format(num1 + "+" + num2 + "=" + sum);
    }

    public String calculateSubstraction(int num1, int num2) {
        noNull(num1, num2);
        int substraction = num1 - num2;
        return String.format(num1 + "-" + num2 + "=" + substraction);
    }

    public String calculateMultiplication(int num1, int num2) {
        noNull(num1, num2);
        int multiplication = num1 * num2;
        return String.format(num1 + "*" + num2 + "=" + multiplication);
    }

    public String calculateDivision(int num1, int num2) {
        noNull(num1, num2);
        if (num2 == 0) {
            System.out.println("Нельзя делить на 0");
        }
        double division = (double) num1 / num2;
        return String.format(num1 + "/" + num2 + "=" + division);
    }
}