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
    public String calculateSum(@RequestParam Integer num1,
                               @RequestParam Integer num2) {
        return calculatorService.calculateSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateSubstraction(@RequestParam Integer num1,
                                        @RequestParam Integer num2) {
        return calculatorService.calculateSubstraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication(@RequestParam Integer num1,
                                          @RequestParam Integer num2) {
        return calculatorService.calculateMultiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivision(@RequestParam Integer num1,
                                    @RequestParam Integer num2) {
        return calculatorService.calculateDivision(num1, num2);
    }
}
