public class Substring 
{
	public static void main(String args[]) 
	{//					  4    8   12 15
		//String str = "Java ������ �缺�� ���� ����������!!";
		/*String str1 = str.substring(5);
		System.out.println(str1);

		String str2 = str.substring(0, 6);
		System.out.println(str2);

		String str3 = str.substring(12, 15);
		System.out.println(str3);*/
		
		/*int idx1 = str.indexOf(" "); //4
		String s1 = str.substring(0, idx1); // Java
		
		int idx2 = str.indexOf(" ", idx1 + 1); //8
		String s2 = str.substring(idx1 + 1, idx2); // ������

		System.out.println(s1);
		System.out.println(s2);*/
		
		/*int s_idx = 0;
		int e_idx = 0;
		while(true)
		{
			e_idx = str.indexOf(" ", s_idx + 1);
			
			String s1 = str.substring(s_idx, e_idx);
			
			System.out.println(s1);
			
			s_idx = e_idx;
		}*/
		
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		int idx = 0;
		while(true)
		{
			idx = str.indexOf(" ", idx + 1);
			
			if(idx == -1)
			{
				System.out.println(str);
				break;
			}
			String s1 = str.substring(0, idx);
			System.out.println(s1);
		}
	}
}