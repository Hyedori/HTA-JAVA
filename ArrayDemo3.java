package JAVA_HTA;

public class ArrayDemo3 {

	         public static void main(String[] args) {
				//�迭�� Ȱ��
	        String[] names = {"������","������","����"};
	        int[] korScores= {100,25,80};
	        int[] engScores= {100,15,90};
	        int[] mathScores = {96,35,87};
	        
	        //�̹��� ������ ������ ��� �л��� �̸��� ����Ͻÿ�.
	            System.out.println("###������û �л� ���###");
	        	for(String x : names) {
	        		System.out.println(x);
	        	}
	        
	        
	        //������ �л��� ������ ���� ����Ͻÿ�.
	         System.out.println("###������ �л� ����###");
	         System.out.println(names[0] +", " + korScores[0] + ", " + engScores[0]+ ", " + mathScores[0]);
	        	
	        
	        //���� ������ ����� ����Ͻÿ�.
	         // --> ���������� ������ ����Ѵ�.
	         // --> ����� ���������� ������ 3���� ����� ����Ѵ�.
	         
	        System.out.println("###���� ���� ������ ���###");
	          int korTotal = 0;
	          int korAverage = 0;
	        for(int x : korScores) {
	    	    korTotal += x ;  //korTotal += 100, ; korTotal += 25 ; korTotal += 80; ����
	        
	       }
	        korAverage = korTotal/korScores.length;  //korAverage = korTotal/3;
	        System.out.println("�������� ���� :" + korTotal);
	        System.out.println("�������� ��� :" + korAverage);
	        /*
	        for(int x : korScores){
	            korTotal += kor;
	            }
	         
	         �������� ������ enhanced for ���� ���� ��
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
	        
	        //���� ������ ����� ����Ͻÿ�.
	        System.out.println("###���� ���� ���###");
	        System.out.println("###���� ���� ������ ���###");
	          int engTotal = 0;     //������ �����ϰ� �;. int engAverage = engTotal/engScores.length;�� ������ �����ص� �����ϴ�.
	          int engAverage = 0;
	        for(int l : engScores) {
	    	    engTotal += l ;  
	        
	       }
	        engAverage = engTotal/engScores.length; 
	        System.out.println("�������� ���� :" + engTotal);
	        System.out.println("�������� ��� :" + engAverage);
	        
	        //���� ������ ����� ����Ͻÿ�.
	        System.out.println("###���� ���� ���###");
	        System.out.println("###���� ���� ������ ���###");
	          int mathTotal = 0;
	          int mathAverage = 0;
	        for(int m : mathScores) {
	    	    mathTotal += m ; 
	        
	       }
	        mathAverage = mathTotal/mathScores.length;  
	        System.out.println("�������� ���� :" + mathTotal);
	        System.out.println("�������� ��� :" + mathAverage); 
	        
	        //�� �л��� �л��̸�, ����, ����, ���� ����, ����, ��� ������ ����Ͻÿ�.
	        //������ 100 100 96 296 98
	        //������ 25 15 35 75 25
	        //���� 80 90 87 257 85
	        /*
	         * �л� �� ���� ����
	         * String[] names = {"������","������","����"};
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
	        	
	 	          // "\t" ���°�
	        
	        System.out.printf("%s%5d%5d%5d%5d%5d\n", studentName, kor, eng, math, total, average);
	        }
	        //System.out.printf("%s%5d%5d%5d%5d%5d%\n", studentName, kor, eng, math, total, average); -->������ ����(����ȭ�� ���ڿ�)
	        //%s = ���ڰ� ǥ�õǾ���� %d = ����(����)�� ǥ�õǾ����(�� �ڸ��� �� ���� ��)
	        //%d ���̿� 5�� �ִ� ���� = ���ڸ� ǥ���� �� 5ĭ�� ����϶�� ��
	        //\n�� �ٹٲ� ����  (�����ٰ� ������ �� ���ٿ� ǥ�õ��� �ʰ� ���� �ٲ����� ��µ�)
	        
	        
	}
}
