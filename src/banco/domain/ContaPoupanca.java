package banco.domain;

// =============================== //
public class ContaPoupanca extends Conta {

	// =============================== //
	public ContaPoupanca() {
		super.agencia = gerarValoresAleatorios(true);
		super.conta = gerarValoresAleatorios(false);
	}
}
