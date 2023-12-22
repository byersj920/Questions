import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Question testQuestion = new Question("Is this working?", "Yes");

        System.out.println(testQuestion.getInquiry());
        testQuestion.setInquiry("Ch'ya it's working...right???");
        System.out.println(testQuestion.getInquiry());

        TrueFalse test2 = new TrueFalse("Today is thursday. True/false", "True");
        System.out.println(test2.getInquiry());

        MultiChoice testOptions = new MultiChoice("What color shirt am I wearing?", "pink",
                "blue", "orange", "pink");

        System.out.println(testOptions.getInquiry());
        System.out.println(testOptions.getOptionA());
        System.out.println(testOptions.getOptionB());
        System.out.println(testOptions.getOptionC());
        Scanner input = new Scanner(System.in);
        String shirtAnswer = input.nextLine();
        testOptions.setUserInput(shirtAnswer);

        System.out.println(testOptions.getUserInput());


    }
}
