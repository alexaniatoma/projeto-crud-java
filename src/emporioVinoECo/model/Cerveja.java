package emporioVinoECo.model;

public class Cerveja extends Produto{
	
	private String nomeCerveja;
	private int volumeLitros;
	private String fermentacao;
		
	public Cerveja(int id, int categoria, String paisDeOrigem, String dataValidade, String descricao, float preco,
			String nomeCerveja, int volumeLitros, String fermentacao) {
		super(id, categoria, paisDeOrigem, dataValidade, descricao, preco);
		this.nomeCerveja = nomeCerveja;
		this.volumeLitros = volumeLitros;
		this.fermentacao = fermentacao;
	}


	public String getNomeCerveja() {
		return nomeCerveja;
	}

	public void setNomeCerveja(String nomeCerveja) {
		this.nomeCerveja = nomeCerveja;
	}

	public int getVolumeLitros() {
		return volumeLitros;
	}

	public void setVolumeLitros(int volumeLitros) {
		this.volumeLitros = volumeLitros;
	}

	public String getFermentacao() {
		return fermentacao;
	}

	public void setFermentacao(String fermentacao) {
		this.fermentacao = fermentacao;
	}


	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome da Cerveja: " + this.nomeCerveja);
		System.out.println("Litros: " + this.volumeLitros);
		System.out.println("Fermentação: " + this.fermentacao);
	}

}
