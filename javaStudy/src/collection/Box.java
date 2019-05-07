package collection;

// Á¦³×¸¯, Generic
public class Box 
{
	Apple[] apple = new Apple[10];
	
	Apple a1 = new Apple();
	Apple a2 = new Apple();
}

class Box2<T>
{
	T t;
}