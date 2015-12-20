package javatest;

public class JavaOuterClass {
	
	private int param1;
	InnerClass innnerclass=new InnerClass();
	public JavaOuterClass(){
		System.out.println("this is OuterClass");
	}
	public void TestScopeInnerClass(){
		class scope{
			public scope(){
				System.out.println("this is scopeclass");
			}
			public void scopemethod(){
				System.out.println("scope method");
			}
		}
		scope s=new scope();
		s.scopemethod();
	}
	class InnerClass{	
		InnerClass(){
			System.out.println("this is innerClass");
		}
		public void innerMethod1(){
			param1=5;
			System.out.println(param1);
		}
	}
	public void TestInnerClass(){
		InnerClass in=new InnerClass();
		in.innerMethod1();
	}
	public InnerClass getInnerClass(){
		return new InnerClass();
	}
}
