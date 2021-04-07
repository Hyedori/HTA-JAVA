package day3.abstraction;

public class LineChart extends Chart{

	@Override
	public void draw(){    //이거 없으면 LineChart 에 빨간줄 끄임. 특정한 기능의 구현을 강제하는 것이 추상화의 목적
		System.out.println("꺾은 선 그래프를 그린다.");
	}
}
