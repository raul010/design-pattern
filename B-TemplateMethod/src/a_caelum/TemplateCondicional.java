package a_caelum;

abstract class TemplateCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}
	
	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	abstract double maximaTaxacao(Orcamento orcamento);
	abstract double minimaTaxacao(Orcamento orcamento);
}