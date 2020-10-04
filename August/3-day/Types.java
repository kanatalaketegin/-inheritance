
public class Types{
	public static void main(String[] args) {
		
		System.out.println("1-преобразование из byte");
		byte byteType = 50;
		String nameByte = "byte";
		String nameShort = "short";
		String nameInt = "int";
		String nameLong = "long";
		String nameFloat = "float";
		String nameDouble = "double";
		String nameChar = "char";
		String nameBoolean = "boolean";
		
		short shortType = byteType;  // преобразования тип byte на short
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameShort + "=" + shortType + " неявное");
		
		char charType = (char)byteType;  // преобразования тип byte на char
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameChar + "=" + charType + " явное");
		
		int intType = byteType;  // преобразования тип byte на Integer
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameInt + "=" + intType + " неявное");
		
		float floatType = byteType;  // преобразования тип byte на float
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameFloat + "=" + floatType + " неявное");
		
		long longType = byteType;  // преобразования тип byte на long
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameLong + "=" + longType + " неявное");
		
		double doubleType = byteType;  // преобразования тип byte на double
		System.out.println("Преобразование из " + nameByte + "=" + byteType + " в " + nameDouble + "=" + doubleType + " неявное");

		boolean boolType;  // преобразования тип boolean на byte
		if (boolType = shortType == byteType) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType + " в " + nameByte + "=" + byteType + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType + " в " + nameByte + "=" + byteType + " не преобразуется");
		}
		
		System.out.println();
		
		System.out.println("2-преобразование из short");
		short shortType1 = 500;
		
		byte byteType1 = (byte)shortType1;  // преобразования тип short на byte
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameByte + "=" + byteType1 + " явное");
		
		char charType1 = (char)shortType1;  // преобразования тип short на char
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameChar + "=" + charType1 + " явное");
		
		int intType1 = shortType1;  // преобразования тип short на Integer
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameInt + "=" + intType1 + " неявное");
		
		float floatType1 = shortType1;  // преобразования тип short на float
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameFloat + "=" + floatType1 + " неявное");
		
		long longType1 = shortType1;  // преобразования тип short на long
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameLong + "=" + longType1 + " неявное");
		
		double doubleType1 = shortType1;  // преобразования тип short на double
		System.out.println("Преобразование из " + nameShort + "=" + shortType1 + " в " + nameDouble + "=" + doubleType1 + " неявное");

		boolean boolType1;  // преобразования тип boolean на short
		if (boolType1 = byteType == shortType1) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType1 + " в " + nameShort + "=" + shortType1 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType1 + " в " + nameShort + "=" + shortType1 + " не преобразуется");
		}

		System.out.println();

		System.out.println("3-преобразование из char");
		char charType6 = 'G';
		
		byte byteType6 = (byte)charType6;  // преобразования тип char на byte
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameByte + "=" + byteType6 + " явное");
		
		short shortType6 = (short)charType6;  // преобразования тип char на chort
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameShort + "=" + shortType6 + " явное");
		
		int intType6 = (int)charType6;  // преобразования тип char на Integer
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameInt + "=" + intType6 + " явное");

		float floatType6 = (float)charType6;  // преобразования тип char на float
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameFloat + "=" + floatType6 + " явное");

		long longType6 = (long)charType6;  // преобразования тип char на long
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameLong + "=" + longType6 + " явное");

		double doubleType6 = (double)charType6;  // преобразования тип char на double
		System.out.println("Преобразование из " + nameChar + "=" + charType6 + " в " + nameDouble + "=" + doubleType6 + " явное");

		boolean boolType2;  // преобразования тип boolean на char
		if (boolType2 = shortType1 == charType6) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType2 + " в " + nameChar + "=" + charType6 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType2 + " в " + nameChar + "=" + charType6 + " не преобразуется");
		}

		System.out.println();

		System.out.println("4-преобразование из Integer");
		int intType2 = 200000;
		
		byte byteType2 = (byte)intType2;  // преобразования тип Integer на byte
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameByte + "=" + byteType2 + " явное");
		
		short shortType2 = (short)intType2;  // преобразования тип Integer на short
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameShort + "=" + shortType2 + " явное");
		
		char charType2 = (char)intType1;   // преобразования тип Integer на char
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameChar + "=" + charType2 + " явное");
		
		float floatType2 = intType2;   // преобразования тип Integer на float
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameFloat + "=" + floatType2 + " неявное");
		
		long longType2 = intType2;  // преобразования тип Integer на long
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameLong + "=" + longType2 + " неявное");
		
		double doubleType2 = intType2;   // преобразования тип Integer на double
		System.out.println("Преобразование из " + nameInt + "=" + intType2 + " в " + nameDouble + "=" + doubleType2 + " неявное");

		boolean boolType3;  // преобразования тип boolean на Integer
		if (boolType3 = charType6 == intType2) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType3 + " в " + nameInt + "=" + intType2 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType3 + " в " + nameInt + "=" + intType2 + " не преобразуется");
		}

		System.out.println();

		System.out.println("5-преобразование из Float");
		float floatType3 = 250000.00f;
		
		byte byteType3 = (byte)floatType3;   // преобразования тип float на byte
		System.out.println("Преобразование из " + nameFloat + "=" + floatType3 + " в " + nameByte + "=" + byteType3 + " явное");
		
		short shortType3 = (short)floatType3;  // преобразования тип float на short
		System.out.println("Преобразование из " + nameFloat + "="  + floatType3 + " в " + nameShort + "=" + shortType3 + " явное");
		
		char charType3 = (char)floatType3;  // преобразования тип float на Integer
		System.out.println("Преобразование из " + nameFloat + "="  + floatType3 + " в " + nameChar + "=" + charType3 + " явное");
		
		int intType3 = (int)floatType3;  // преобразования тип float на Integer
		System.out.println("Преобразование из " + nameFloat + "="  + floatType3 + " в " + nameInt + "=" + intType3 + " явное");
		
		long longType3 = (long)floatType3;   // преобразования тип float на long
		System.out.println("Преобразование из " + nameFloat + "="  + floatType3 + " в " + nameLong + "=" + longType3 + " явное");
		
		double doubleType3 = floatType3;   // преобразования тип float на doubl
		System.out.println("Преобразование из " + nameFloat + "="  + floatType3 + " в " + nameDouble + "=" + doubleType3 + " неявное");

		boolean boolType4;  // преобразования тип boolean на float
		if (boolType4 = intType2 == floatType3) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType4 + " в " + nameInt + "=" + floatType3 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType4 + " в " + nameInt + "=" + floatType3 + " не преобразуется");
		}

		System.out.println();

		System.out.println("6-преобразование из Long");
		long longType4 = 100000000l;
		
		byte byteType4 = (byte)longType4;  // преобразования тип long на byte
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameFloat + "=" + byteType4 + " явное");
		
		short shortType4 = (short)longType4;  // преобразования тип long на short
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameShort + "=" + shortType4 + " явное");
		
		char charType4 = (char)longType4;  // преобразования тип long на char
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameChar + "=" +  charType4 + " явное");
		
		int intType4 = (int)longType4;  // преобразования тип long на Integer
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameInt + "=" + intType4 + " явное");
		
		float floatType4 = (float)longType4;  // преобразования тип long на float
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameFloat + "=" + floatType4 + " явное");
		
		double doubleType4 = longType4;   // преобразования тип long на double
		System.out.println("Преобразование из " + nameLong + "=" + longType4 + " в " + nameDouble + "=" + doubleType4 + " неявное");

		boolean boolType5;  // преобразования тип boolean на char
		if (boolType5 = floatType3 == longType4) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType5 + " в " + nameLong + "=" + longType4 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType4 + " в " + nameLong + "=" + longType4 + " не преобразуется");
		}

		System.out.println();

		System.out.println("7-преобразование из double");
		double doubleType5 = 122344242.232;
		
		byte byteType5 = (byte)doubleType5;  // преобразования тип double на byte
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameByte + "=" + byteType5 + " явное");
		
		short shortType5 = (short)doubleType5;  // преобразования тип double на short
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameShort + "=" + shortType5 + " явное");

		char charType5 = (char)doubleType5;  // преобразования тип double на char
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameChar + "=" + charType5 + " явное");
		
		int intType5 = (int)doubleType5;  // преобразования тип double на Integer
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameInt + "=" + intType5 + " явное");
		
		float floatType5 = (float)doubleType5;  // преобразования тип double на float
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameFloat + "=" + floatType5 + " явное");
		
		long longType5 = (long)doubleType5;  // преобразования тип double на long
		System.out.println("Преобразование из " + nameDouble + "=" + doubleType5 + " в " + nameLong + "=" + longType5 + " явное");

		boolean boolType6;  // преобразования тип boolean на double
		if (boolType6 = longType5 == doubleType5) {
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType6 + " в " + nameDouble + "=" + doubleType5 + " не преобразуется");
		}
		else{
			System.out.println("Преобразование из " + nameBoolean + "=" + boolType6 + " в " + nameDouble + "=" + doubleType5+ " не преобразуется");
		}

	}
}