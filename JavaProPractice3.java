package day3;
import java.util.Scanner;
public class JavaProPractice3 {
	/*369������ ������ �ۼ��غ���. 1~99������ ������ �Է¹ް� ������ 3,6,9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ�
	 *  �� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ� ���α׷��� �ۼ��϶�.
	 *   ���� ���, Ű����� �Էµ� ���� 13�� ��� "�ڼ�¦"��, 36�� ��� "�ڼ�¦¦"�� ����ϸ� �ȴ�. 

	1~99 ������ ������ �Է��Ͻÿ� >> 36
	�ڼ�¦¦
	 */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1~99 ������ ������ �Է����ּ���.");
			int x = sc.nextInt();
			if(x!=0 && x>=1 && x<=99)
			{
				int a, b;
				a = x/10;
				b = x%10;
				if((a==3 || a==6|| a==9)&&(b==3 || b==6|| b==9))
				{
					System.out.println("�ڼ�¦¦");
					
				}else if(())
			}else
			{
				System.out.println("���� ������ ������ϴ�.");
			}
		}
}
