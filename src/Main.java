import banco.domain.Conta;
import banco.domain.ContaCorrente;
import banco.domain.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		Conta cp1 = new ContaPoupanca();
		System.out.println(cc1.extrato("Corrente"));
		System.out.println(cp1.extrato("Poupança"));
		cc1.depositar(100);
		cp1.depositar(100);
		System.out.println(cc1.extrato("Corrente"));
		System.out.println(cp1.extrato("Poupança"));
		cc1.transferir(cp1, 50);
		System.out.println(cc1.extrato("Corrente"));
		System.out.println(cp1.extrato("Poupança"));
	}

}
