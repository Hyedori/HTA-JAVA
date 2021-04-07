package day3;

public class Student extends Person{

	private int grade;
	private String dept;
	
	public Student () {
		super();
	}
	public Student (String name,int grade, String dept) 
	{	
		super(name);			//부모객체의 생성자 실행   //private이라 못봐서 이렇게 하는거임 //setter로 하면 됨..?
		//setName(name);
		this.grade = grade;
		this.dept = dept;
	}
	
	public Student(String name, String email, String tel, int grade, String dept )
	{
		super(name, email, tel);	//부모객체의 생성자 실행, private이고 setter도 없을 때 생성자를 이용해서 쓰는 방법
		this.grade = grade;
		this.dept = dept;
	}
	
	public Student(int grade, String dept) {
		super();
		this.grade = grade;
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void displayInfo()
	{
		//System.out.println("이름 : " + getName()); //부모에 공개되어 있는건 내꺼처럼 씀
		//System.out.println("이메일 : " + getEmail());
		//System.out.println("연락처 : " + getTel());
		super.displayInfo();
		System.out.println("학년 : " + getGrade());
		System.out.println("학과 : " + getDept());
	}
	
}
