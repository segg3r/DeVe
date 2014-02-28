import task2and3.Trial;
import task2and3.exam.Exam;
import task2and3.exam.ExamQuestion;
import task2and3.exam.FinalExam;
import task2and3.test.Test;
import task2and3.test.TestQuestion;

public class Task2and3Runner {

	public static void main(String[] args) {

		Test test = new Test(new TestQuestion[] {
				new TestQuestion("Сколько будет 2 * 2?", new String[] { "4",
						"20", "25" }, 0),
				new TestQuestion("Где прошла зимняя олимпиада 2014 года?",
						new String[] { "Гомель", "Cочи" }, 1) });

		Exam exam = new Exam("Программирование", new ExamQuestion(
				"Абстрактные классы", "Объект такого класса создать нельзя"),
				new ExamQuestion("Еще вопрос", "Еще ответ"));

		FinalExam finalExam = new FinalExam("Программирование",
				new ExamQuestion("Абстрактные классы",
						"Объект такого класса создать нельзя"),
				new ExamQuestion("Еще вопрос", "Еще ответ"));

		Trial[] trials = new Trial[] { test, exam, finalExam };
		for (Trial trial : trials) {
			System.out.println("=====");
			trial.showAnswers();
		}

	}

}
