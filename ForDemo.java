package JAVA_HTA;

public class ForDemo {
    public static void main(String[] args) {
		
    	//���๮ 10
    	System.out.println("-----------------------------------------");
    	
    	//�հ� ���ϱ�
    	//1~100 ���� �հ踦 ���ϰ� ����Ѵ�.
    	
    	int sum = 0;
    	for (int i=1; i <=100; i ++) {
    		 sum += i;
    	}
      System.out.println(sum);
    
      System.out.println("--------------------------------------");
      
      //�հ� ���ϱ�
      //1001~2000���� �հ踦 ���ϰ� ����Ѵ�.
      
      int bigsum = 0;
      for(int i=1001; i<= 2000; i++) {
    	   bigsum += i;
      }
   System.out.println(bigsum);
	}
    
    
    
}

