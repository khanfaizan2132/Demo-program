package JAVA;

public class TypeCasting {
	
	public static void main(String[] args) {
		byte b=10;
		
		int i=b;// will accept - automatic type promoion
		
	    byte c=i;// will not accept - because lower type cannot be put in higher
		
		byte d=(byte)i;// Type casting makes it possible to store compatible types.
		
		byte x=10;
		byte y=20;
		
	    byte sum=x*y; // Error is thrown because when two bytes is used arthmetic operation, the result will be integer

	}

}
