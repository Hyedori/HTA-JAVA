package day3;

public class PersonApp {

		public static void main(String[] args) {
			Student student = new Student ("ȫ�浿", "hong@gmail.com", "010-1111-1111", 3, "��ǻ�Ͱ��а�");
			student.displayInfo();
			
			Professor professor = new Professor("������", "kim@naver.com", "010-2222-2222", "��ǻ�Ͱ��а�", "������");
			professor.displayInfo();
		}
}
