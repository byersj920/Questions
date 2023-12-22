public class Question {
    private String inquiry;
    private String correctAnswer;

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    private String userInput;

    public String getUserInput(){
        return userInput;
    }

    public void setUserInput(String userInput){
        this.userInput = userInput;
    }
    public Question (String inquiry, String correctAnswer){
        this.inquiry = inquiry;
        this.correctAnswer = correctAnswer;
    }

}
