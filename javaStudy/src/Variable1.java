public class Variable1 
{     
	public static void main(String[] args) 
	{         
		// 0.0 <= X < 1.0
		/*double r = Math.random() * 6;
		r = r + 1;
		int num = (int)r;
		System.out.println(num);
		
		int num2 = (int)((Math.random() * 6) + 1);
		System.out.println(num2);
		// Unix Time
		long ut = System.currentTimeMillis();
		System.out.println(ut);*/
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				printf("*");
			}
			
			printf("\n");
		}
	}
}