package task2and3.test;


public class TestQuestion {

	private String question;
	private String[] answers;
	private int rightAnswerNumber;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public int getRightAnswerNumber() {
		return rightAnswerNumber;
	}

	public void setRightAnswerNumber(int rightAnswerNumber) {
		this.rightAnswerNumber = rightAnswerNumber;
	}

	public TestQuestion(String question, String[] answers, int rightAnswerNumber) {
		super();
		this.question = question;
		this.answers = answers;
		this.rightAnswerNumber = rightAnswerNumber;
	}

	public String getRightAnswer() {
		return answers[rightAnswerNumber];
	}

}
