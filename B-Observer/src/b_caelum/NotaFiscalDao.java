package b_caelum;

public class NotaFiscalDao implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscalBuilder nf) {
		System.out.println("Salva na Base");
	}

}