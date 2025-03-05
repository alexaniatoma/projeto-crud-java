package emporioVinoECo.model;

public class Vinho extends Produto{
	
	private String nomeVinicola;
	private String uva;
	private String qualidade;
	private String classificacao;	
	private int safra;
	private String tipoRolha;
		
	
	public Vinho(int id, int categoria, String paisDeOrigem, String dataValidade, String descricao, float preco,
			String nomeVinicola, String uva, String qualidade, String classificacao, int safra,
			String tipoRolha) {
		super(id, categoria, paisDeOrigem, dataValidade, descricao, preco);
		this.nomeVinicola = nomeVinicola;
		this.uva = uva;
		this.qualidade = qualidade;
		this.classificacao = classificacao;
		this.safra = safra;
		this.tipoRolha = tipoRolha;
	}
		

	public String getNomeVinicola() {
		return nomeVinicola;
	}

	public void setNomeVinicola(String nomeVinicola) {
		this.nomeVinicola = nomeVinicola;
	}

	public String getUva() {
		return uva;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

	public String getTipoRolha() {
		return tipoRolha;
	}

	public void setTipoRolha(String tipoRolha) {
		this.tipoRolha = tipoRolha;
	}


	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome Vinicola: " + this.nomeVinicola);
		System.out.println("Tipo uva: " + this.uva);
		System.out.println("Classificação do Vinho: " + this.qualidade);
		System.out.println("Tipo: " + this.classificacao);
		System.out.println("Ano Safra: " + this.safra);
		System.out.println("Tipo da Rolha: " + this.tipoRolha);
	}	
	
}
