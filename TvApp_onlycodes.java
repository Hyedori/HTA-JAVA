package day2_onlycodes;

import day2.Tv;

public class TvApp_onlycodes {
	//Tv ��ü �����ϱ�
			Tv tv1 = new Tv();
			Tv tv2 = new Tv();
			
			//Tv��ü�� ���� �ѱ�
			tv1.on();
			
			//Tv��ü�� ���� ä�ι�ȣ ��ȸ�ϱ�(��ȸ�� get, search, find �߿� �ϳ��� ������ �θ� ���� ����)/ (������ set, change, update ��ɾ� Ȱ��)/
			                          //(������ delete, remove)(�߰��� add, insert)
			int channelNumber=tv1.getCurrentChannel();{
				System.out.println("���� ä�ι�ȣ :" + channelNumber);
		
			}
			
			//Tv��ü�� ä�� ������Ű��
			tv1.channelUp();
			tv1.channelUp();

			
			channelNumber = tv1.getCurrentChannel();
			System.out.println("���� ä�ι�ȣ :" + channelNumber);
					
			//Tv��ü�� ä���� 12������ �����ϱ�
			tv1.changeChannel(12);
			
			channelNumber = tv1.getCurrentChannel(); //�ٲ� ���� ������ ����� ���� ����� �� ����. ��� ���� �ٲ�ſ� ���� ������ �ٲ��� �ʾƵ� ��.
			System.out.println("���� ä�ι�ȣ :" + channelNumber );
			
			//Tv��ü�� ä���� -100���� �����ϱ� -> �տ� if������ �޾Ƴ��� �ٲ����ʰ� �״����
					tv1.changeChannel(-100);
					//channel�� ����ȭ �Ǿ���.
					//�ܺο��� Tv ��ü�� channel, power ��������� ���� ���� ������ �� ���� �Ǿ���.
					channelNumber = tv1.getCurrentChannel(); 
					System.out.println("���� ä�ι�ȣ :" + channelNumber );
			
		}
}
