package interfaces;

import banco.domain.Conta;

//=============================== //
public interface IConta {

	// =============================== //
	void sacar(double valor);

	// =============================== //
	void depositar(double valor);

	// =============================== //
	void transferir(Conta ctDestino, double valor);

	// =============================== //
	boolean checaValor(double valor);

	// =============================== //
	String extrato(String tpConta);
}
