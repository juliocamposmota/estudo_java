package lambdas;

public class CalculadoraLambda {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // =>(javascript) ->(java)
		System.out.println(calc.executar(2, 3));
		
	}
}
