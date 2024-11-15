package pro.sky.calculatorbushmelev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping(path = "/plus")
    public void calculateSum(@RequestParam Integer num1,
                               @RequestParam Integer num2) {
        calculatorService.calculateSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public void calculateSubstraction(@RequestParam Integer num1,
                                        @RequestParam Integer num2) {
        calculatorService.calculateSubstraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public void calculateMultiplication(@RequestParam Integer num1,
                                          @RequestParam Integer num2) {
        calculatorService.calculateMultiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public void calculateDivision(@RequestParam Integer num1,
                                    @RequestParam Integer num2) {
        calculatorService.calculateDivision(num1, num2);
        }
    }
