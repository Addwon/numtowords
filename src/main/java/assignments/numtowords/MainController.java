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
        boolean stop=true;
        do {
            System.out.println("Enter a number [1-10] ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < 1 || num > 10)
                stop = false;
            System.out.println(numNames[num]);
            word+=numNames[num]+" "+"<br/>";
        }while(!stop);
        return word;
    }

}
