package javatest;

public class JavaThreadtest implements Runnable{

	private static int num=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(""){
				if(num>0){
					try{
						Thread.sleep(500);
						System.out.println("num:"+--num);
					}catch(Exception e){
						e.printStackTrace();
					}
				}else{
					System.out.println("out");
					return;
				}
			}
		}
	}
	
	 

}
