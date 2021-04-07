package day3;
/*
 * Static import��
 * -Ŭ������ static����, static �޼ҵ带  import�Ѵ�.
 * -static import���� ����ϸ�, �ҽ��ڵ忡�� static ������ static �޼ҵ带 ����Ҷ�
 * Ŭ���� �̸��� �����ϰ� ����� �� �ִ�.
 * -�ۼ���
 * 	import static java.long.Math.*;
 * 		Math Ŭ������ ��� static������ static�޼ҵ带 import�Ѵ�.
 * 
 * 	import static.java.lang.Math.PI;
 * 		MathŬ������ static ����(���) PI�� import�Ѵ�.
 * 
 * 	import static java.lang.Math.random;
 * 		Math Ŭ������ static �޼ҵ� random()�� import�Ѵ�.
 * 
 */
import static java.lang.Math.*;     //static package�� �����ϸ� random() �ٷ� ���°� �԰���
public class StaticImportApp {

		public static void main(String[] args) {
			//double value1 = Math.random();
			//double value2 = Math.cos(3.14);
			//double value3 = Math.round(3.14);
			//long value4 = Math.round(12.54);
			
			//static import���� ����ؼ� Ŭ�����̸����� static �޼ҵ带 ����ϴ� ��
			System.out.println("������ ��: " + random());
			
			System.out.println("�ݿø� �� ��(3.2): " + round(3.2));
			System.out.println("�ݿø� �� ��(3.7): " + round(3.7));
			
			System.out.println("�ٴڰ�(3.2)" + floor(3.2));
			System.out.println("�ٴڰ�(3.7)" + floor(3.7));
			
			System.out.println("õ�尪(-3.7)" + ceil(-3.7));
			System.out.println("õ�尪(-3.2)" + ceil(-3.2));
			System.out.println("õ�尪(3)" + ceil(3));
			System.out.println("õ�尪(3.2)" + ceil(3.2));
			System.out.println("�ٴڰ�(3.7)" + ceil(3.7));
		}
}
