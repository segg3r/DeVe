import task2and3.Exam;
import task2and3.FinalExam;
import task2and3.Test;
import task2and3.Trial;

public class Task2and3Runner {

	public static void main(String[] args) {

		Trial[] trials = { new Test(), new Exam(), new FinalExam() };
		for (Trial trial : trials) {
			trial.pass();
		}

	}

}
