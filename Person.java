package day3;

public class Person {

	private String name;
	private String email;
	private String tel;
	
	public Person () {}   //기본생성자 - 초기화
	
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
		System.out.println("이름 : " +name);
		System.out.println("이메일 : " +email);
		System.out.println("연락처 : " +tel);
	}
}
