package java_core_lesson9.task_2_version2;

public class Application {
	public static void main(String[] args) throws MyException{
		Methods rezult=new Methods();	
		System.out.println(rezult.sum(-7,4));
		System.out.println(rezult.minus(4,8));
		System.out.println(rezult.myltiply(0,0));
		System.out.println(rezult.div(4,0));
		
	}

	
}
