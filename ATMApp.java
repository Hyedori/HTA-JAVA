package day3.template;
import java.util.Scanner;
public class ATMApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM();
		Deposit deposit = new Deposit();
		Transfer transfer = new Transfer();
		
		while(true)
		{
			System.out.println("------------------------------------------");
			System.out.println("1.�Ա� 2.��ü 0.����");
			System.out.println("------------------------------------------");
			
			System.out.println("�޴���ȣ�� �Է��ϼ���.");
			int menuNo = sc.nextInt();
				
			if(menuNo == 1)
			{
				System.out.println("[�Ա��۾�]");
				
				atm.setBanking(deposit);
				atm.runBanking();
			}else if(menuNo ==2)
			{
				System.out.println("[��ü�۾�]");
				
				atm.setBanking(transfer);
				atm.runBanking();
			}else if(menuNo == 0)
			{
				System.out.println("[����]");
				break;
			}else
			{
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
