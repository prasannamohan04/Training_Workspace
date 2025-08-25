package sample;

public record Student1(int rollno , String name ) {

	public int rollno() {
		return rollno;
	}

	public String name() {
		return name;
	}
	

}
