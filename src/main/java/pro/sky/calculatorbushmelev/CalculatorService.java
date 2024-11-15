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

    public void calculateSum(int num1, int num2) {
        noNull(num1, num2);
        int sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + sum);
    }

    public void calculateSubstraction(int num1, int num2) {
        noNull(num1, num2);
        int substraction = num1 - num2;
        System.out.println(num1 + "+" + num2 + substraction);

    }

    public void calculateMultiplication(int num1, int num2) {
        noNull(num1, num2);
        int multiplication = num1 * num2;
        System.out.println(num1 + "+" + num2 + multiplication);
    }

    public void calculateDivision(int num1, int num2) {
        noNull(num1, num2);
        if (num2 == 0) {
            System.out.println("Нельзя делить на 0");
        } else {
            int division = num1 / num2;
            System.out.println(num1 + "+" + num2 + division);
        }
    }
}