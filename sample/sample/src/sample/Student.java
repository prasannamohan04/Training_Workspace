package sample;

public class Student {

	private String studentName ;
	private int regno;
	private int sub1,sub2,sub3;
	
	public Student(String studentName, int regno, int sub1, int sub2, int sub3) {
		this.studentName = studentName;
		this.regno = regno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getTotal() {
		return sub1 + sub2 + sub3;	
	}
	public double getAverage() {
		return getTotal()/3.0 ; 
	}
	
	
	public boolean isPass(int cutoff) {
		return sub1 >= cutoff
		&& sub2 >= cutoff
		&& sub3 >= cutoff;
	}
	public String toString() {
		return String.format("Regno: %d,StudentName = %s , Marks[%d,%d,%d]",regno,);
	}
	
}
