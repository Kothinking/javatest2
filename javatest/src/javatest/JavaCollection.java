package javatest;

import java.util.ArrayList;
import java.util.List;

public class JavaCollection {
	
	private List<String> list;
	
	public JavaCollection(){
		JavaCollectionMethod1();
	}

	public void JavaCollectionMethod1(){
		String a="a",b="b",c="c";
		List<String> list2=new ArrayList<String>();
		list2.add("x");
		list2.add("y");
		list2.add("z");
		
		list =new ArrayList<String>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.addAll(1,list2);
		
	}
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void JavaCollectionMethod2(){
		try{
			System.out.println("try");
			return;
		}catch(Exception e){
			e.printStackTrace();
			e.getLocalizedMessage();
		}finally{
			System.out.println("finally");
		}
	}
}
