package inheritance;

public class Main 
{
	public static void main(String[] args)
	{
		Child1[] cc1 = new Child1[2];
		
		
		Child1 c1 = new Child1();
		c1.b();
		cc1[0] = c1;
		
		
		Child2 c2 = new Child2();
		c2.b();
		//cc1[1] = c2;	// Child1 배열에 Child2 객체를 넣을 수 없음
		
		Parent[] pp1 = new Parent[2];
		Child1 p1 = new Child1();
		pp1[0] = p1;	// Parent 배열에 Child1 객체를 넣을 수 있음
		Child2 p2 = new Child2();
		pp1[1] = p2;	// Parent 배열에 Child2 객체를 넣을 수 있음
	}
}
