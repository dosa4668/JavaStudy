package collection;

import java.util.HashSet;

public class SetExam 
{
	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10); // 중복이지만 무시
		
		while(true)
		{
			int n = (int) (Math.random()* 45 + 1);
			set.add(n);
			if(set.size() == 6)
			{
				break;
			}
		}
		System.out.println(set);
	}
}
