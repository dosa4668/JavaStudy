package inheritance;

public class PhoneMain 
{
	public static void main(String[] args) 
	{
		Button b = new Button();
		MyOn mo = new MyOn();
		b.setonClickListener(mo);
	}
}

class MyOn extends onClickListener
{
	void onClick()
	{
		System.out.println("������ ����");
	}
}
