package day3;
import java.util.Scanner;
public class JavaProPractice3 {
	/*369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고
	 *  두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
	 *   예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다. 

	1~99 사이의 정수를 입력하시오 >> 36
	박수짝짝
	 */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1~99 사이의 정수를 입력해주세요.");
			int x = sc.nextInt();
			if(x!=0 && x>=1 && x<=99)
			{
				int a, b;
				a = x/10;
				b = x%10;
				if((a==3 || a==6|| a==9)&&(b==3 || b==6|| b==9))
				{
					System.out.println("박수짝짝");
					
				}else if(())
			}else
			{
				System.out.println("값의 범위를 벗어났습니다.");
			}
		}
}
