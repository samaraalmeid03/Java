import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US); 
		
		double a;
		int b;
		a = 5.0;
		b = (int)a;
		//Casting: Em Java quando queremos atribuir um valor do tipo Double para uma variavel
		//do tipo int, devemos OBRIGATORIAMENTE fazer o casting.
		
		System.out.println(b);
	}
}
