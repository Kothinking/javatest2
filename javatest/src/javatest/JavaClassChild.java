package javatest;

public class JavaClassChild extends JavaClassParent implements JavaInterface{

	public JavaClassChild(){
		System.out.println(" this is child");
	}
//	a a =new a();
//	public class a{
//		JavaClassParent p=new JavaClassParent();
//		a(){
//			System.out.println("this is a");
//		}
//		
//	}
	@Override
	public void method1(){
		System.out.print("override method1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("override method2");
	}
}
