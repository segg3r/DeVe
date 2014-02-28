package task2and3.test;

import task2and3.Trial;

public class Test extends Trial {

	private TestQuestion[] testQuestions;

	public Test(TestQuestion[] testQuestions) {
		super();
		this.testQuestions = testQuestions;
	}

	public TestQuestion[] getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(TestQuestion[] testQuestions) {
		this.testQuestions = testQuestions;
	}

	@Override
	public void showAnswers() {
		int i = 0;
		for (TestQuestion testQuestion : testQuestions) {
			System.out.println("Вопрос " + ++i);
			System.out.println(testQuestion.getQuestion());
			System.out.println("Ответ: " + testQuestion.getRightAnswer());
		}
	}

}
