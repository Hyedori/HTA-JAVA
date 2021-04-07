package day3.template;

public class ATM {
		
	
		//AbstractBankingŬ������ ������ü�� �����ϴ� ��������
		//��ü�۾�, �Ա��۾�, ����۾�, �����۾� ���� ������ �پ��� AbstractBanking�� ������ü�� ������ �� �ִ�.
		private AbstractBanking banking;
		
		//AbstractBanking�� ������ü�� �ּҰ��� ���޹޴� setter �޼ҵ�
		
		public void setBanking(AbstractBanking banking)
		{
			this.banking = banking;
		}
		
		//��ŷ�۾��� �����ϴ� �޼ҵ�
		//��ŷ�۾��� ���õ� �Ϸ��� �۾����� ������� �������ִ� process() �޼ҵ带 �����Ѵ�.
		public void runBanking()
		{
			banking.process();
		}
}
