package exerciciosAula2;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public double mostrarSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
