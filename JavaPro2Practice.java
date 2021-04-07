package day3;
import java.util.Scanner;
public class JavaPro2Practice {
/*
 * 4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의

정수 3개 입력 >> 20 100 33
중간 값은 33
 

 */
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력해주세요.");
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.println("중간값은 "+num2+" 입니다.");
		}
		
		if(num1>num2 && num1<num3)
		{
			System.out.println("중간값은 "+num1+"입니다.");
		
		}else
		{
			
		}
		
		
 }
	
}
