package caelum.exemplo2;

public class ItemBuilder {
	
	String nome;
	double valor;
	
	ItemBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	ItemBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	ItemNovo constroiItem() {
		return new ItemNovo(nome, valor);
	}
}
