package javaStudy;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// 코드 작성
		String[] path = file.split("/");
		for(int i = 0; i < path.length; i++)
		{
			System.out.println("/" + path[i]);
		}
		
	}
}
