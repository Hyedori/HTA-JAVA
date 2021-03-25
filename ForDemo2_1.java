package JAVA_HTA;

public class ForDemo2_1 {
 public static void main(String[] args) {
	//1~10 사이의 정수 중에서 홀수의 총합과 짝수의 총합을 계산하고, 그 결과를 출력하기
	 
	 int oddsum = 0;
	 int evensum = 0;
	 
	 for(int i=1; i<=10; i++) {
		 if(i%2 == 1) {
			 oddsum += i;
		 }else {
			 evensum += i;
		 }
	 }
	 System.out.println("홀수합" + oddsum);
	 System.out.println("짝수합" + evensum);
}
}
