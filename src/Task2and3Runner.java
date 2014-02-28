import task2and3.Trial;
import task2and3.exam.Exam;
import task2and3.exam.ExamQuestion;
import task2and3.exam.FinalExam;
import task2and3.test.Test;
import task2and3.test.TestQuestion;

public class Task2and3Runner {

	public static void main(String[] args) {

		Test test = new Test(new TestQuestion[] {
				new TestQuestion("������� ����� 2 * 2?", new String[] { "4",
						"20", "25" }, 0),
				new TestQuestion("��� ������ ������ ��������� 2014 ����?",
						new String[] { "������", "C���" }, 1) });

		Exam exam = new Exam("����������������", new ExamQuestion(
				"����������� ������", "������ ������ ������ ������� ������"),
				new ExamQuestion("��� ������", "��� �����"));

		FinalExam finalExam = new FinalExam("����������������",
				new ExamQuestion("����������� ������",
						"������ ������ ������ ������� ������"),
				new ExamQuestion("��� ������", "��� �����"));

		Trial[] trials = new Trial[] { test, exam, finalExam };
		for (Trial trial : trials) {
			System.out.println("=====");
			trial.showAnswers();
		}

	}

}
