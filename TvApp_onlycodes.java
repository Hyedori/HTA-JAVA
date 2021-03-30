package day2_onlycodes;

import day2.Tv;

public class TvApp_onlycodes {
	//Tv 객체 생성하기
			Tv tv1 = new Tv();
			Tv tv2 = new Tv();
			
			//Tv객체의 전원 켜기
			tv1.on();
			
			//Tv객체의 현재 채널번호 조회하기(조회는 get, search, find 중에 하나로 설정해 두면 쓰기 쉬움)/ (변경은 set, change, update 명령어 활용)/
			                          //(삭제는 delete, remove)(추가는 add, insert)
			int channelNumber=tv1.getCurrentChannel();{
				System.out.println("현재 채널번호 :" + channelNumber);
		
			}
			
			//Tv객체의 채널 증가시키기
			tv1.channelUp();
			tv1.channelUp();

			
			channelNumber = tv1.getCurrentChannel();
			System.out.println("현재 채널번호 :" + channelNumber);
					
			//Tv객체의 채널을 12번으로 변경하기
			tv1.changeChannel(12);
			
			channelNumber = tv1.getCurrentChannel(); //바꾼 값을 대입을 해줘야 값을 출력할 수 있음. 대신 값이 바뀐거에 대해 일일이 바꾸지 않아도 됨.
			System.out.println("현재 채널번호 :" + channelNumber );
			
			//Tv객체의 채널을 -100으로 변경하기 -> 앞에 if조건을 달아놔서 바뀌지않고 그대로임
					tv1.changeChannel(-100);
					//channel은 은닉화 되었다.
					//외부에서 Tv 객체의 channel, power 멤버변수의 값을 직접 변경할 수 없게 되었다.
					channelNumber = tv1.getCurrentChannel(); 
					System.out.println("현재 채널번호 :" + channelNumber );
			
		}
}
