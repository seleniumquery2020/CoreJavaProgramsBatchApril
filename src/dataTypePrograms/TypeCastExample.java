package dataTypePrograms;

public class TypeCastExample {

public static void main(String args[])
{
    byte a = 10;
	byte b = 11;

    byte c = (byte) (a + b); //TypeCasting
	int result = a+ b;

   System.out.println("Addition of a and b = "+c);

   int num = 51;

   byte num1 = (byte)num;
    System.out.println("num1 = "+num1);
}
}

//Addition/Subtraction/Division/Mul/Mod(int , dataType of a , DataType b,...DataType n)

