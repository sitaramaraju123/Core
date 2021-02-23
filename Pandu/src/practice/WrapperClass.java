package practice;

public class WrapperClass {

	public static void main(String[] args) {
		String name ="96";
		int a = Integer.parseInt(name);
		System.out.println("String to Int Convertion: "+a);
		
		Integer b = Integer.valueOf(a);
		System.out.println("Int to String Convertion: "+b.toString());
		
		float c = Float.parseFloat(b.toString());
		System.out.println("String to Float: "+c);
		
		Float d = Float.valueOf(c);
		System.out.println("Float to String: "+d.toString());
		
		short e = Short.parseShort(name);
		System.out.println("String to Short: "+e);
		
		Short f = Short.valueOf(e);
		System.out.println("Short to String: "+f.toString());
		
		byte g = Byte.parseByte(f.toString());
		System.out.println("String to Byte: "+g);
		
		Byte h = Byte.valueOf(g);
		System.out.println("Byte to String: "+h.toString());
		
		long i = Long.parseLong(h.toString());
		System.out.println("String to Long: "+i);
		
		Long j = Long.valueOf(i);
		System.out.println("Long to String: "+j.toString());
		
		double k = Double.parseDouble(d.toString());
		System.out.println("String to Double: "+k);
		
		Double l = Double.valueOf(k);
		System.out.println("Double to String: "+l.toString());
	}

}
