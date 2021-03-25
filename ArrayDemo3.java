package JAVA_HTA;

public class ArrayDemo3 {

	         public static void main(String[] args) {
				//배열의 활용
	        String[] names = {"혜돌이","영밤이","콩이"};
	        int[] korScores= {100,25,80};
	        int[] engScores= {100,15,90};
	        int[] mathScores = {96,35,87};
	        
	        //이번에 수업에 참여한 모든 학생의 이름을 출력하시오.
	            System.out.println("###수강신청 학생 목록###");
	        	for(String x : names) {
	        		System.out.println(x);
	        	}
	        
	        
	        //혜돌이 학생의 성적을 전부 출력하시오.
	         System.out.println("###혜돌이 학생 성적###");
	         System.out.println(names[0] +", " + korScores[0] + ", " + engScores[0]+ ", " + mathScores[0]);
	        	
	        
	        //국어 점수의 평균을 출력하시오.
	         // --> 국어점수의 총합을 계산한다.
	         // --> 평균은 국어점수의 총합을 3으로 나누어서 계산한다.
	         
	        System.out.println("###국어 점수 총점과 평균###");
	          int korTotal = 0;
	          int korAverage = 0;
	        for(int x : korScores) {
	    	    korTotal += x ;  //korTotal += 100, ; korTotal += 25 ; korTotal += 80; 실행
	        
	       }
	        korAverage = korTotal/korScores.length;  //korAverage = korTotal/3;
	        System.out.println("국어점수 총점 :" + korTotal);
	        System.out.println("국어점수 평균 :" + korAverage);
	        /*
	        for(int x : korScores){
	            korTotal += kor;
	            }
	         
	         ★위에서 정의한 enhanced for 문의 실행 ★
	        int korTotal = 0;   
	        
	        for(int x = 100 : korScores){
	            korTotal += x;    // korTotal =>100
	            }
	        for(int x = 25 : korScores){
	            korTotal += x;    //korTotal =>125
	            }
	        for(int x = 80 : korScores){
	            korTotal += x;   //korTotal =>205
	            }
	         */
	        
	        //영어 점수의 평균을 출력하시오.
	        System.out.println("###영어 점수 평균###");
	        System.out.println("###영어 점수 총점과 평균###");
	          int engTotal = 0;     //변수를 강조하고 싶어서. int engAverage = engTotal/engScores.length;로 변수를 선언해도 무관하다.
	          int engAverage = 0;
	        for(int l : engScores) {
	    	    engTotal += l ;  
	        
	       }
	        engAverage = engTotal/engScores.length; 
	        System.out.println("영어점수 총점 :" + engTotal);
	        System.out.println("영어점수 평균 :" + engAverage);
	        
	        //수학 점수의 평균을 출력하시오.
	        System.out.println("###수학 점수 평균###");
	        System.out.println("###수학 점수 총점과 평균###");
	          int mathTotal = 0;
	          int mathAverage = 0;
	        for(int m : mathScores) {
	    	    mathTotal += m ; 
	        
	       }
	        mathAverage = mathTotal/mathScores.length;  
	        System.out.println("수학점수 총점 :" + mathTotal);
	        System.out.println("수학점수 평균 :" + mathAverage); 
	        
	        //각 학생별 학생이름, 국어, 영어, 수학 점수, 총점, 평균 점수를 출력하시오.
	        //혜돌이 100 100 96 296 98
	        //영밤이 25 15 35 75 25
	        //콩이 80 90 87 257 85
	        /*
	         * 학생 및 성적 정보
	         * String[] names = {"혜돌이","영밤이","콩이"};
	        int[] korScores= {100,25,80};
	        int[] engScores= {100,15,90};
	        int[] mathScores = {96,35,87};
	         */
	        
	        for (int i=0; i<3; i++) {
	        	String studentName = names[i];
	        	int kor = korScores[i];
	        	int eng = engScores[i];
	        	int math = mathScores[i];
	        	
	        	int total = kor + eng + math ;
	        	int average = total/3;
	        	
	 	          // "\t" 띄어쓰는거
	        
	        System.out.printf("%s%5d%5d%5d%5d%5d\n", studentName, kor, eng, math, total, average);
	        }
	        //System.out.printf("%s%5d%5d%5d%5d%5d%\n", studentName, kor, eng, math, total, average); -->위에랑 같음(형식화된 문자열)
	        //%s = 문자가 표시되어야함 %d = 정수(숫자)가 표시되어야함(그 자리에 들어갈 실제 값)
	        //%d 사이에 5가 있는 이유 = 숫자를 표시할 때 5칸을 사용하라는 뜻
	        //\n은 줄바꿈 문자  (끝에다가 넣으면 다 한줄에 표시되지 않고 줄이 바꿔져서 출력됨)
	        
	        
	}
}
