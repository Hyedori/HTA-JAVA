package day3;
import java.util.Scanner;
public class JavaPro2Practice2 {
	/*5. Scanner �� �̿��Ͽ� �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ް� �� 3���� ���� �ﰢ���� ���� �� �ִ� �� �Ǻ��϶�. �ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� Ŀ�� �Ѵ�.

	���� 3�� �Է� >> 4 3 5
	�ﰢ���� �˴ϴ�.
	 */
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�ﰢ���� ���� ���̸� �Է����ּ���.");
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if((a+b)<c || (b+c)<a || (a+c)<b)   //�ﰢ���� ������� �� ���� �������� ����Ǯ��
			{
				System.out.println("�ﰢ���� ���� �� �����ϴ�.");
			}else
			{
				System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
			}
					
					
		}
	
}
