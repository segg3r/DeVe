package task2and3.exam;

import task2and3.Trial;

public class Exam extends Trial {

	private String subjectName;
	private ExamQuestion firstQuestion;
	private ExamQuestion secondQuestion;

	public Exam(String subjectName, ExamQuestion firstQuestion,
			ExamQuestion secondQuestion) {
		super();
		this.subjectName = subjectName;
		this.firstQuestion = firstQuestion;
		this.secondQuestion = secondQuestion;
	}

	@Override
	public void showAnswers() {
		System.out.println("Экзамен по предмету " + subjectName);
		System.out.println(firstQuestion.getQuestion() + " : "
				+ firstQuestion.getAnswer());
		System.out.println(secondQuestion.getQuestion() + " : "
				+ secondQuestion.getAnswer());
	}

	public ExamQuestion getFirstQuestion() {
		return firstQuestion;
	}

	public void setFirstQuestion(ExamQuestion firstQuestion) {
		this.firstQuestion = firstQuestion;
	}

	public ExamQuestion getSecondQuestion() {
		return secondQuestion;
	}

	public void setSecondQuestion(ExamQuestion secondQuestion) {
		this.secondQuestion = secondQuestion;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
