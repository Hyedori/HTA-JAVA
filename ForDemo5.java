package JAVA_HTA;

public class ForDemo5 {

    public static void main(String[] args) {
		
    	//���� �ݺ����ʷ� �Ѿ��
    	// continue���� ����ϸ� ���� �ݺ����ʷ� �Ѿ �� �մ�.
    	// continue�� �ݺ��� �������� ����� �� �ִ�.
    	
    	for(int i=1; i<=10; i++) {
    		if(i == 5) { 
    			continue; //continue�� ����Ǹ�, �ݺ������� ������ ���๮�� �������� �ʰ�, (���)������ �ݺ��� �̾�� ���ؼ� ���������� �̵��Ѵ�.
    		}
    		System.out.println("i�� ��:" + i);
    	}
	}
}
