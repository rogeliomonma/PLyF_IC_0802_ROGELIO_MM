

public class Principal{
	public static void main(String[]args){
		
		
		//Solucion 2
		Principal.engine((CalculadoraInt)( x, y) -> x - y);
		Principal.engine((CalculadoraLong)( x, y) ->x % y); 

		
	}

	//Sobrecarga de Métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}


}