package aulajava25;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			  return true;	
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar){
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			
		} else {
			return false;
		}
      }
	}
	void depositar(double valorDepositado){
		saldo += valorDepositado;
	}
	void consultarSaldo(){
		System.out.println("saldo atual da conta =" + saldo);
	}
	
	boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}
}
		
		