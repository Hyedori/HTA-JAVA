package JAVA_HTA;

import java.util.Scanner;

public class ForDemo4_break {
      
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//�ݺ��� Ż���ϱ�
		//break������ ����ϸ� �ݺ����� Ż���� �� �ִ�.
		//break�� �ݺ���(for��, while��, do~ while��)�� switch�� �������� ����� �� �ִ�.
		//�ݺ����� Ż���� ���� ���� ���õ� ���ǿ� �ش�� �� break���� �����ؼ� Ż���Ѵ�.
		
		System.out.println("###���α׷� ����###");
		
		for(int i=1; i<=5; i++) {                    //�̷��� �Ǹ� �Է��� 5������ �����ϴ� ���๮ 
			System.out.println("���ڸ� �Է��ϼ���.");
			
			
			int number = sc.nextInt();
			
			if (number <=0) { //Ż������. ����ڰ� 0�̳� ������ �Է��ϸ� �ݺ����� Ż���Ѵ�.
				break;
			}
			System.out.println("�Է��� ����:" + number);
			
		}
		
		sc.close();
		System.out.println("###���α׷� ����###");
	}
}
