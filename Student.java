package day3;

public class Student extends Person{

	private int grade;
	private String dept;
	
	public Student () {
		super();
	}
	public Student (String name,int grade, String dept) 
	{	
		super(name);			//�θ�ü�� ������ ����   //private�̶� ������ �̷��� �ϴ°��� //setter�� �ϸ� ��..?
		//setName(name);
		this.grade = grade;
		this.dept = dept;
	}
	
	public Student(String name, String email, String tel, int grade, String dept )
	{
		super(name, email, tel);	//�θ�ü�� ������ ����, private�̰� setter�� ���� �� �����ڸ� �̿��ؼ� ���� ���
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
		//System.out.println("�̸� : " + getName()); //�θ� �����Ǿ� �ִ°� ����ó�� ��
		//System.out.println("�̸��� : " + getEmail());
		//System.out.println("����ó : " + getTel());
		super.displayInfo();
		System.out.println("�г� : " + getGrade());
		System.out.println("�а� : " + getDept());
	}
	
}
