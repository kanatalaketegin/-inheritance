
public class AutoConvert{
	public static void main (String[] args){

	byte numByte = 125;
	short numShort = numByte;
	System.out.println("Преобразование byte => short, " + numShort); 

	int numInt = numShort;
	System.out.println("Преобразование short => int, " + numInt);

	char c = 'A';
	int numInt2 = c;
	System.out.println("Преобразование char => int, " + numInt2);

	long numLong = numInt;
	System.out.println("Преобразование int => long, " + numLong);

	float numFloat = numInt2;
	System.out.println("Преобразование int => float, " + numFloat);

	float numFloat2 = numLong;
	System.out.println("Преобразование long => float, " + numFloat2);

	double numDouble = numInt;
	System.out.println("Преобразование int => double, " + numDouble);

	double numDouble2 = numFloat;
	System.out.println("Преобразование float => double, " + numDouble2);

	double numDouble3 = numLong;
	System.out.println("Преобразование long => double, " + numDouble3);


	
	}
}