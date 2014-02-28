package task2and3.exam;


public class FinalExam extends Exam {

	public FinalExam(String subjectName, ExamQuestion firstQuestion,
			ExamQuestion secondQuestion) {
		super(subjectName, firstQuestion, secondQuestion);
	}

	public void showAnswers() {
		System.out.println("Выпускной экзамен!!!");
		super.showAnswers();
	}

}
