package banco.domain;

import java.text.DecimalFormat;
import java.util.Random;

import interfaces.IConta;

// =============================== //
public abstract class Conta implements IConta {
	// =============================== //
	protected int agencia;
	// =============================== //
	protected int conta;
	// =============================== //
	protected double saldo;

	// =============================== //
	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = 0d;
	}

	// =============================== //
	public Conta() {
	}

	// =============================== //
	public void sacar(double valor) {
		if (checaValor(valor)) {
			if (saldo > valor) {
				this.saldo -= valor;
			} else {
				System.out.println("Valor inválido! Sua conta não possui saldo suficiente.\n"
						+ "O seu saldo atual é de R$" + getSaldo());
			}
		} else {
			System.out.println("Valor inválido! Informe um valor maior que R$0.00");
		}
	}

	// =============================== //
	public void transferir(Conta ctDestino, double valor) {
		this.sacar(valor);
		ctDestino.depositar(valor);
	}

	public void depositar(double valor) {
		if (checaValor(valor)) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido! Informe um valor maior que R$0.00");
		}
	}

	// =============================== //
	public String extrato(String tpConta) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		StringBuilder sb = new StringBuilder();
		sb.append(" === Extrato Conta ");
		sb.append(tpConta);
		sb.append(" ===");
		sb.append("\nAgência: ");
		sb.append(this.agencia);
		sb.append("\nConta: ");
		sb.append(this.conta);
		sb.append("\nSaldo: ");
		sb.append(df.format(this.saldo));
		return sb.toString();
	}

	// =============================== //
	public boolean checaValor(double valor) {
		if (valor > 0d) {
			return true;
		} else {
			return false;
		}
	}

	// =============================== //
	public int gerarValoresAleatorios(boolean ehAgencia) {
		String numero = "";
		Random gerador = new Random();
		if (ehAgencia) {
			for (int i = 0; i < 4; i++) {
				numero += gerador.nextInt(10);
			}
		} else {
			for (int i = 0; i < 6; i++) {
				numero += gerador.nextInt(10);
			}
		}
		return Integer.parseInt(numero);
	}

	// =============================== //
	public int getAgencia() {
		return agencia;
	}

	// =============================== //
	public int getConta() {
		return conta;
	}

	// =============================== //
	public double getSaldo() {
		return saldo;
	}

}
