package JAVA_HTA;

public class ForDemo2 {
 
	 public static void main(String[] args) {
		
		 //for���� ������ if��
		 //1~10������ ���� �߿��� Ȧ���� ����ϱ�
		 for(int i=1; i<=10; i++){
			 if (i%2 == 1) {
			//i���� 2�� ���� �������� 1�� ��쿡�� ����Ǵ� ���๮
				 System.out.println(i);
			 }
			
		 }
		 
		 //1~10������ ���� �߿��� ¦���� ������ ����ϰ�, �� ����� ����ϱ�
		 
		 int sum = 0;
		 
		//for (int i=1; i<=10; i++) {
			
			//if (i%2 == 0) {
				//System.out.println(sum);
			//}
		//}
		 for (int i=1; i<=10; i++) {
			 if(i%2 == 0)
			 //i���� 2�� ���� �������� 0�� ��쿡�� sum�� i���� ���Ѵ�.
			 sum += i;
		 }
		 System.out.println("�հ�" + sum);
		 
		 //1~10 ������ ���� �߿��� Ȧ���� ���հ� ¦���� ������ ����ϰ�, �� ����� ����ϱ�
		 
		 int oddsum =0;
		 int evensum =0;
		 
		 for (int i=1; i<=10; i++) {
			 if(i%2 == 1) {
				 oddsum += i;
			 
		 } else {
				 evensum += i;
		 }
		 }
	     System.out.println("Ȧ���հ�"+oddsum);
		 System.out.println("¦���հ�"+evensum);
		 
		 }
	 }
	

		 	 
	

