

public class Principal{
	public static void main(String[]args){
		//Solucion 1
		Principal.engine((long x,long y) -> x +  y);
		Principal.engine((int x,int y) -> x * y);
		Principal.engine((long x,long y) -> x / y);
			
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