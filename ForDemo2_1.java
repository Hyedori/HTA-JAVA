package JAVA_HTA;

public class ForDemo2_1 {
 public static void main(String[] args) {
	//1~10 ������ ���� �߿��� Ȧ���� ���հ� ¦���� ������ ����ϰ�, �� ����� ����ϱ�
	 
	 int oddsum = 0;
	 int evensum = 0;
	 
	 for(int i=1; i<=10; i++) {
		 if(i%2 == 1) {
			 oddsum += i;
		 }else {
			 evensum += i;
		 }
	 }
	 System.out.println("Ȧ����" + oddsum);
	 System.out.println("¦����" + evensum);
}
}
