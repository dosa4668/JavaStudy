class IndexOf
{
	public static void main(String args[]) 
	{//               012345678
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = str.indexOf(" ");
		System.out.println(idx);//4

		int idx2 = str.lastIndexOf(" ");
		System.out.println(idx2);

		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);//8

		idx2 = str.lastIndexOf(" ", idx2 - 1);
		System.out.println(idx2);//16
	}
}