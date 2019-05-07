package collection;

import java.util.HashSet;

public class LottoExam
{
	public static void main(String[] args)
	{
		HashSet<Integer> lotto = new HashSet<>();
		lotto.add(6);
		lotto.add(10);
		lotto.add(16);
		lotto.add(28);
		lotto.add(34);
		lotto.add(38);
		
		HashSet<Integer> my = new HashSet<>();
		
		int count = 0;
		
		while(true)
		{
			my.clear(); 	//set 데이터 삭제
			count++;
			while(true)		//랜덤으로 로또 번호 6개 생성하기
			{
				int n = (int)(Math.random() * 45 + 1);
				my.add(n);
				if(my.size() == 6)
				{
					break;
				}
			}
			
			if(lotto.containsAll(my))
			{
				break;
			}
			
			System.out.println("최종 시도 횟수 : " + count);
		}
	}
}
