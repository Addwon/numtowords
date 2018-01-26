package assignments.numtowords;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
    };
    @RequestMapping
    public String wordReturn(){
        String word="";
        System.out.println("Enter a number [1-10] ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(numNames[num]);
        return word;
    }

}
