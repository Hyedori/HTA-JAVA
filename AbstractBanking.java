package day3.template;

public abstract class AbstractBanking {

	//��� ��ŷ�۾����� �׻� �����ϴ� ��ó�� �۾� - ������ �ʴ� �κ�
	//
	private void before()
	{
		System.out.println("���� ����ý��۰� �����ϱ�");
		System.out.println("����� �����۾� �����ϱ�");
	}
	
	//��� ��ŷ�۾����� �׻� �����ϴ� ��ó�� �۾� - ������ �ʴ� �κ�
	private void after ()
	{
		System.out.println("���� ����ý��۰� ���������ϱ�");
	}
	
	//������ �����ϴ� �۾��� ���� �޼ҵ常 ���� - ���ϴ� �ִ�
	//AbstractBanking�� ���� Ŭ������ �����ؾ��� �κ�
	public abstract void job();
	
	//��ŷ�۾��� �����ϴ� ��� �޼ҵ带 ������ �°� �������ִ� �޼ҵ�
	void process()
	{
		before();
		job();  //����Ŭ�������� �������� job()�� ����ȴ�.
		after();
	}
}
