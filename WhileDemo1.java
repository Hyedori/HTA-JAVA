package JAVA_HTA;

import java.util.Scanner;

public class WhileDemo1 {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  //�����ݾ�
		  int balance = 10000;
		  
		 //while���� �̿��ؼ� ���ѹݺ� �����ϱ�
		 
		 while(true) {
			 System.out.print("���ݾ��� �Է��ϼ���:");//println���� ln�� ����� �ٹٲ��� �Ͼ�� �ʾƼ� ������ ���� �� ����
			 int amount = sc.nextInt();
			 System.out.println("------------------------------------------------");
			 if(amount > balance) {
				 System.out.println("�ܾ��� �����մϴ�.");
				 System.out.println("���� �����ִ� �����ݾ�:" + balance + "��");
			 } else {
				 System.out.println("������ �����մϴ�.");
				 balance -= amount;
				 System.out.println("���ݾ� :" + amount + "��");
				 System.out.println("���� �����ִ� �����ݾ�:" + balance +"��");
				 System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			 }
			 System.out.println("------------------------------------------------");
			// ���ݾ��� �����ִ� �����ݾ׺��� ũ��, �ܾ׺����� ǥ���Ѵ�.
			// ���ݾ��� �����ִ� �����ݾ׺��� �۰ų� ������, �����ݾ׿��� ���ݾ׸�ŭ �����ϰ� ���ݾװ� ���� �����ִ� �����ݾ��� ����Ѵ�.
			// (���ѷ���)
		 }
		 
		 
	}
}
