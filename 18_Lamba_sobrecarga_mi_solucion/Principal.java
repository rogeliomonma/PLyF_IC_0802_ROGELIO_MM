

public class Principal{
	public static void main(String[]args){
		long res=0,res2=0;
		res=Principal.engine((long)5, (long)5 ). calcular(1,1);
        System.out.println("CalculadoraLong="+res);
		res2=Principal.engine(5,5 ).calcular(1,1);
		System.out.println("CalculadoraLong="+res2);
	}
	private static CalculadoraInt engine(int a, int b){
		return (x , y) -> a * b;
	}
	private static CalculadoraLong engine(long a, long b){
		return (x , y) -> (int)(a + b);
	}


}

	
