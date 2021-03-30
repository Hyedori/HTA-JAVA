package day2_onlycodes;

public class Tv_onlycodes {
	 //private ���������ڴ� ��������� ����ȭ��Ų��.
	   private int channel;  
	   private boolean power;
	   
	   //tv�� �Ҵ� -> power�� ���� true�� �����Ѵ�. �����۾� -> ��ȯŸ�� : void // �Ű����� - �ʿ����
	   /**
	    *Tv ��ü�� power ���¸� true�� �����Ѵ�.
	    */
	   void on() {
		   power = true;
	   }
	   
	   //tv�� ���� -> power�� ���� false�� �����Ѵ�. �����۾� -> ��ȯŸ�� : void //�Ű����� - �ʿ����
	   void off ( ) {
		   //Tv��ü�� �������¸� false�� �����Ѵ�.
		   power = false;
	   }
	  
	   //ä�μ��� 1 ���ҽ�Ų��.  �����۾� -> ��ȯŸ�� : void //�Ű����� - �ʿ����
	   /**
	    * Tv��ü�� ä�ι�ȣ�� 1 ���ҽ�Ų��.
	    */
	   void channelDown() {
		   channel --;
		   if (channel <1) {
			   channel = 100;
		   }
		   
	   }
	   
	   //ä�μ��ڸ� 1 ������Ų��. �����۾� -> ��ȯŸ�� : void //�Ű����� - �ʿ����
	   /**
	    * Tv��ü�� ä�ι�ȣ�� 1 ������Ų��.
	    */
	   void channelUp() {
		   channel ++;
		   if (channel >100) {
			   channel = 1;
		   }
	   }
	   
	   //**ä�η� �����Ѵ�. �����۾� -> ��ȯŸ�� : void //�Ű����� - channel��ȣ / �ٲٴ°Ŵϱ� void, **�� �ްڴٴ°���
	   /**
	    * ä�ι�ȣ�� ���޹޾Ƽ� Tv ��ü�� ä�ι�ȣ�� �����Ѵ�.
	    * @param channelNumber ������ ä�ι�ȣ
	    */
	   void changeChannel(int channelNumber) {
		   if(channelNumber >=1 && channelNumber <=100) {
		   channel = channelNumber;
		   }else {
			   System.out.println("�߸��� ä�� �����Դϴ�.");
		   }
	   }
	   
	   //���� ��û ���� ä�ι�ȣ�� ��ȸ�Ѵ�. ��ȸ�۾�(�˻����) -> ��ȯŸ�� : ä�ι�ȣ(int) //�Ű����� - �ʿ����
	  /**
	   * Tv ��ü�� ���� ä�ι�ȣ�� ��ȯ�Ѵ�.
	   * @return ���� ä�ι�ȣ (1~100������ ������)
	   */
	   int getCurrentChannel( ) {   //�̰͸� ���� return���� ��ȯ�϶�� �߸鼭 �۵��ȵ�
		   return channel;
	   }
}
