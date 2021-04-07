package day3;
import java.util.Scanner;
public class JavaPro2Practice2 {
	/*5. Scanner 를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는 지 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.

	정수 3개 입력 >> 4 3 5
	삼각형이 됩니다.
	 */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("삼각형의 변의 길이를 입력해주세요.");
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if((a+b)<c || (b+c)<a || (a+c)<b)   //삼각형이 만들어질 수 없는 조건으로 문제풀이
			{
				System.out.println("삼각형을 만들 수 없습니다.");
			}else
			{
				System.out.println("삼각형을 만들 수 있습니다.");
			}
					
					
		}
	
}
