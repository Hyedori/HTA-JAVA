package day3;
import java.util.Scanner;
public class JavaPro2Practice {
/*
 * 4. Scanner Ŭ������ ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�. ��հ��� ���ϴ� ���� �ƴԿ� ����

���� 3�� �Է� >> 20 100 33
�߰� ���� 33
 

 */
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է����ּ���.");
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.println("�߰����� "+num2+" �Դϴ�.");
		}
		
		if(num1>num2 && num1<num3)
		{
			System.out.println("�߰����� "+num1+"�Դϴ�.");
		
		}else
		{
			
		}
		
		
 }
	
}
