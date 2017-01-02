package test;

public class myclass {
	//静态数据快
	static {
		System.out.println("A");
	}
	
	//势力数据块
	{
		
		System.out.println("1");
	}
	
	{
		
		System.out.println("12");
	}
	
	{
		
		System.out.println("3");
	}
	//构造方法
	myclass()
	{
		System.out.println("myclass");
	}
	public static void main(String[] args){
		//System.out.println("我的第一个java程序");
		//c1.print();
		new myclass();
	}

}


