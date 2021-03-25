package JAVA_HTA;

public class ForDemo {
    public static void main(String[] args) {
		
    	//시행문 10
    	System.out.println("-----------------------------------------");
    	
    	//합계 구하기
    	//1~100 까지 합계를 구하고 출력한다.
    	
    	int sum = 0;
    	for (int i=1; i <=100; i ++) {
    		 sum += i;
    	}
      System.out.println(sum);
    
      System.out.println("--------------------------------------");
      
      //합계 구하기
      //1001~2000까지 합계를 구하고 출력한다.
      
      int bigsum = 0;
      for(int i=1001; i<= 2000; i++) {
    	   bigsum += i;
      }
   System.out.println(bigsum);
	}
    
    
    
}

