package exerciciosAula2;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public double mostrarSaldo() { // getSaldo
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
