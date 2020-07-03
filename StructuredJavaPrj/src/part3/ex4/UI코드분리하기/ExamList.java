package part3.ex4.UI코드분리하기;

public class ExamList {
	private Exam[] exams;
	private int current;


	public Exam get(int i) {
		
		return this.exams[i];
	}

	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size+5];
			for(int i =0;i<size;i++)
        		temp[i] = exams[i];
			this.exams = temp;
		}

		this.exams[current] = exam;
		current++;
		
	}

	public ExamList() {
		exams = new Exam[3];
		current = 0;
	}

	
	public int size() {
		return current; //getters로 current 써도 되지만 의미적으로는 이렇게 하는게 맞음
	} 
	
}
