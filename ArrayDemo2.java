package JAVA_HTA;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		String[] names = {"������", "����", "���"};
		int[] scores = {100,90,50,70,60};
		double[] rates = {0.03, 0.1, 0.05};
		
		//for��
		for (int i=0; i<names.length; i++) {
			String x = names[i];
			System.out.println(x);
		}
		for (int i=0; i<scores.length; i++) {
			int y = scores[i];
			System.out.println(y);
		}
		for (int i=0; i<rates.length; i++) {
			double z = rates[i];
			System.out.println(z);
		}
		//���� for �� (enhanced for) <-- �迭�� �ݷ��ǿ� ���ؼ��� ����� �� �ִ� Ư���� for��
		/*
		 *   �迭�� ũ�⸸ŭ for���� �ڵ����� �ڵ����� �ݺ�����ȴ�.
		 *   �迭�� ����� ���� ������� �տ��� ������ ������ �ڵ����� ����ȴ�.
		 *   �迭�� ���� ������� ����Ǵ� ������ Ÿ���� �迭�� ����� ���� Ÿ�԰� ������ Ÿ���̾�� �Ѵ�.
		 *   ��, �迭���� ������� ���� �ϳ� ��ȸ�ؼ� �տ� ������ ������ �����ϰ�,�ڵ����� �����Ų��. <-�̰� n�� ����ȴ�
		 *   for ( Ÿ�� ����: �迭 ) {
		 *       ���๮���� ������ ����� ���� ����Ѵ�.
		 *       ���๮;
		 *       ���๮;
		 * }
		 */
		
		//String[] names = {"������", "����", "���"};
		//int[] scores = {100,90,50,70,60};
		//double[] rates = {0.03, 0.1, 0.05};
		
		System.out.println("---enhanced for ����ϱ�---");
		
		//���� for������ �迭�� �� �ٷ��
		//names �迭���� ó������ ������ ����� ���� �ϳ��� ��ȸ�ؼ� ���� a�� ������� ����ȴ�.
		//���� a�� ���� ����Ǹ� ����� ���๮�� ����ȴ�.
		//names �迭�� String ���� ���� �� ����Ǵ� �迭�̱� ������, ���� ������� ����� ���� a�� Ÿ�Ե� String�̴�.
		
		for (String a : names) {
			System.out.println(a);
		 }
		for (int b : scores) {
			System.out.println(b);
		}
		for (double c : rates) {
           System.out.println(c);			
		}
		//���� �� ó�� ���°� enhanced for 
		//���ʿ� �ʿ���°� �迭�� ��������. �ڵ尡 ������������ �򰥸��� ����
	}
}


