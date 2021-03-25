package JAVA_HTA;

public class ForDemo3 {
	public static void main(String[] args) {
		  //내포된 for문
		//내포된 for문이 너무 많다면 코딩을 잘못하고 있을 가능성이 높다
		//method를 쓰면 더욱 간단하게 코딩가능 method란 이름이 있는 코드블럭
		
	for(int i=1; i<=3; i++) {
		System.out.println("바깥쪽 for문의 수행문"); //바깥쪽 for문은 크게 세번, 그리고 그 밑으로 안쪽 for문이 5번 시행됨
		for(int j=1; j<=5; j++) {
			System.out.println("안쪽 for문의 시행문");
		 }
	 }
  }
}