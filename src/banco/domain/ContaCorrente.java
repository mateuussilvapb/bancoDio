package banco.domain;

// =============================== //
public class ContaCorrente extends Conta {

	// =============================== //
	public ContaCorrente() {
		super.agencia = gerarValoresAleatorios(true);
		super.conta = gerarValoresAleatorios(false);
	}

}
