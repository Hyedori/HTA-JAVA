package day2_onlycodes;

public class Tv_onlycodes {
	 //private 접근제한자는 멤버변수를 은닉화시킨다.
	   private int channel;  
	   private boolean power;
	   
	   //tv를 켠다 -> power의 값을 true로 설정한다. 변경작업 -> 반환타입 : void // 매개변수 - 필요없음
	   /**
	    *Tv 객체의 power 상태를 true로 설정한다.
	    */
	   void on() {
		   power = true;
	   }
	   
	   //tv를 끈다 -> power의 값을 false로 설정한다. 변경작업 -> 반환타입 : void //매개변수 - 필요없음
	   void off ( ) {
		   //Tv객체의 전원상태를 false로 설정한다.
		   power = false;
	   }
	  
	   //채널숫자 1 감소시킨다.  변경작업 -> 반환타입 : void //매개변수 - 필요없음
	   /**
	    * Tv객체의 채널번호를 1 감소시킨다.
	    */
	   void channelDown() {
		   channel --;
		   if (channel <1) {
			   channel = 100;
		   }
		   
	   }
	   
	   //채널숫자를 1 증가시킨다. 변경작업 -> 반환타입 : void //매개변수 - 필요없음
	   /**
	    * Tv객체의 채널번호를 1 증가시킨다.
	    */
	   void channelUp() {
		   channel ++;
		   if (channel >100) {
			   channel = 1;
		   }
	   }
	   
	   //**채널로 변경한다. 변경작업 -> 반환타입 : void //매개변수 - channel번호 / 바꾸는거니까 void, **를 받겠다는거임
	   /**
	    * 채널번호를 전달받아서 Tv 객체의 채널번호를 변경한다.
	    * @param channelNumber 변경할 채널번호
	    */
	   void changeChannel(int channelNumber) {
		   if(channelNumber >=1 && channelNumber <=100) {
		   channel = channelNumber;
		   }else {
			   System.out.println("잘못된 채널 정보입니다.");
		   }
	   }
	   
	   //현재 시청 중인 채널번호를 조회한다. 조회작업(검색기능) -> 반환타입 : 채널번호(int) //매개변수 - 필요없음
	  /**
	   * Tv 객체의 현재 채널번호를 반환한다.
	   * @return 현재 채널번호 (1~100사이의 정수값)
	   */
	   int getCurrentChannel( ) {   //이것만 쓰면 return값을 반환하라고 뜨면서 작동안됨
		   return channel;
	   }
}
