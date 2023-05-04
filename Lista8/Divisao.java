package Lista8;

public class Divisao {
    private int num1;
    private int num2;
    private double resultado;
    public Divisao(){   
    }
    public double dividir(int num1, int num2) throws ArithmeticException {
        if (num2 == 0 || num1 < 0) {
            throw new ArithmeticException("Divisão inválida!");
        }
        resultado = (double) num1 / num2;
        return resultado;
    }
    public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public double getResultado() {
		return resultado;
    }
    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}

