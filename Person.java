package day3;

public class Person {

	private String name;
	private String email;
	private String tel;
	
	public Person () {}   //�⺻������ - �ʱ�ȭ
	
	public Person(String name) 
	{
		this.name = name;
	}
	
	public Person(String name, String email, String tel)
	{
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTel() {
		return tel;
	}
	//public void setName(String name) {
		//this.name = name;
	//}
	
	public void displayInfo()
	{
		System.out.println("�̸� : " +name);
		System.out.println("�̸��� : " +email);
		System.out.println("����ó : " +tel);
	}
}
