package test;

public class myclass {
	//��̬���ݿ�
	static {
		System.out.println("A");
	}
	
	//�������ݿ�
	{
		
		System.out.println("1");
	}
	
	{
		
		System.out.println("12");
	}
	
	{
		
		System.out.println("3");
	}
	//���췽��
	myclass()
	{
		System.out.println("myclass");
	}
	public static void main(String[] args){
		//System.out.println("�ҵĵ�һ��java����");
		//c1.print();
		new myclass();
	}

}


