package JAVA_HTA;
import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//balance�� �ܾ��� �����ϴ� ����(�����)�̴�.
		
		int balance = 10000;
		
		//�� �ݺ����� ���ѹݺ� �ǵ��� ó���Ǿ� �ִ�.
		while(true) {
			System.out.println("==================================");
			System.out.println("1.���� 2.���� 0.����");
			System.out.println("==================================");
			
			//����ڰ� �Է��� �޴���ȣ�� menuNo ������ ����(����)�ȴ�.
			System.out.print("�޴��� �����ϼ���.");
			int menuNo = sc.nextInt();
			
			
			if(menuNo == 1) {//menuNo������ ����� ���� 1�� �� ����Ǵ� �ڵ����̴�.
				  System.out.println("[������ �����մϴ�.]");
				  
				  //����ڰ� �Է��� ���ݾ��� amount ������ ����ȴ�.
				  System.out.println("���ݾ��� �Է��ϼ���:");
				  
			    int amount = sc.nextInt();
			    
			    if (balance>=amount) {  //�ܾ��� ���ݾ׺��� ũ�ų� ���� �� ����Ǵ� �ڵ����̴�.
			    	//���ݾ׸�ŭ �ܾ׿��� �����ϰ�, ���� �� �ܾ��� ����Ѵ�.
			    	 balance -= amount;
			    	 System.out.println("���ݾ�:" + amount + "��");
			    	 System.out.println("���� �� �ܾ�:" +balance + "��");
			    	 System.out.println("[������ �Ϸ�Ǿ����ϴ�.]");
			    	
			    } else {                    //�ܾ��� ���ݾ׺��� ���� �� ����Ǵ� �ڵ����̴�.
			    	System.out.println("[����] �ܾ��� �����մϴ�.");
			    	System.out.println("���� �ܾ�:"+ balance +"��");
			    	System.out.println("[������ �ߴ��մϴ�.]");
			    }
				
						System.out.println("�����ִ� �ܾ�" + balance +"��");
					
				
			}else if (menuNo == 2) {//menuNo������ ����� ���� 2�� �� ����Ǵ� �ڵ����̴�.
				  System.out.println("[������ �����մϴ�.]");
				  
				  //����ڰ� �Է��� �����ݾ��� amount ������ ����ȴ�.
				  System.out.print("������ �ݾ��� �Է��ϼ���:");
				  int amount = sc.nextInt();
				  //amount�� ����� �����ݾ��� balance ������ ����� ���� ���Ѱ�, �����ܾ��� ����Ѵ�.
				  balance += amount; 
				  System.out.println("���� �� �ܾ�:" + balance);
				  System.out.println("[������ �Ϸ�Ǿ����ϴ�.]");
				  
			}else if (menuNo == 0) {//menuNo������ ����� ���� 0�� �� ����Ǵ� �ڵ����̴�.
				  System.out.println("[���񽺸� �����մϴ�.]");
				  break; //break�� ������ while���� ������ ������ �ʱ� ������ while �� ���� sc.close();�� �۵����� �ʴ´�.
				  
			}else { //�Էµ� ���� ����� ��(0,1,2)�� ��� ��ġ���� ���� �� �ߴ� �˸�â
			      System.out.println("[����] �޴��� �ٽ� �����ϼ���.");	
			}
			System.out.println(); //�� ���� �߰��Ѵ�.
			System.out.println(); //�� ���� �߰��Ѵ�.
			System.out.println(); //�� ���� �߰��Ѵ�.
		}
		sc.close();
	}
}
