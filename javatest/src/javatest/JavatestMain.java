package javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class JavatestMain {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file=new File("E:/java web/eclipsejee/eclipse/workspace/javatest/src","JavaIOFileTest.txt");
//		try{
//			//FileOutputStream out=new FileOutputStream(file);
//			FileWriter out= new FileWriter(file,true);
//			String by="this is first file data\n";
//			//byte by[]="this is first file".getBytes();
//			out.write(by);
//			
//			out.close();
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//		;
//		}
//		try{
//			FileInputStream in=new FileInputStream(file);
//			byte by[]=new byte[1024];
//			int len=in.read(by);
//			System.out.println("data:"+new String(by,0,len));
//			in.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		JavaThreadtest t1=new JavaThreadtest();
		JavaThreadtest t2=new JavaThreadtest();
		Thread s1=new Thread(t1);
		Thread s2=new Thread(t2);
		s1.start();
		s2.start();
	}



}
