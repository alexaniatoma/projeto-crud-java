package emporioVinoECo.model;

public abstract class Produto {
	
	private int id;
	private int categoria;
	private String paisDeOrigem;
	private String dataValidade;
	private String descricao;
	private float preco;

	
	
		
	public Produto(int id, int categoria, String paisDeOrigem, String dataValidade, String descricao, float preco) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.paisDeOrigem = paisDeOrigem;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}


	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}


	public String getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}

	
	public void visualizar() {
		String categoria = " ";
		
		switch(this.categoria) {
		case 1:
			categoria = "Vinho";
			break;
			
		case 2 :
			categoria = "Cerveja";
			break;
			
		case 3:
			categoria = "Acessorio";
			break;
		}
		
		System.out.println("\n\n***********************************************");
		System.out.println("Dados do Produto:");
		System.out.println("\n***********************************************");
		System.out.println("Id: " + this.getId());
		System.out.println("Categoria: " + categoria);
		System.out.println("País de Origem: " + this.paisDeOrigem);
		System.out.println("Data de Validade: " + this.dataValidade);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Preço: " + this.preco);	
		
	}
	
	

}
