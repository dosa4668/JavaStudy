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
		//cc1[1] = c2;	// Child1 �迭�� Child2 ��ü�� ���� �� ����
		
		Parent[] pp1 = new Parent[2];
		Child1 p1 = new Child1();
		pp1[0] = p1;	// Parent �迭�� Child1 ��ü�� ���� �� ����
		Child2 p2 = new Child2();
		pp1[1] = p2;	// Parent �迭�� Child2 ��ü�� ���� �� ����
	}
}