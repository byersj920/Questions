public class MultiChoice extends Question{
    private String optionA;
    private String optionB;

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    private String optionC;

    public MultiChoice (String inquiry, String correctAnswer, String optionA, String optionB, String optionC){
        super(inquiry,correctAnswer);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }
}
