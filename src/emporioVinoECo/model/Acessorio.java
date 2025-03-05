package emporioVinoECo.model;

public class Acessorio extends Produto{
	
	String tipoMaterial;
		
	public Acessorio(int id, int categoria, String paisDeOrigem, String dataValidade, String descricao, float preco,
			String tipoMaterial) {
		super(id, categoria, paisDeOrigem, dataValidade, descricao, preco);
		this.tipoMaterial = tipoMaterial;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}


	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}


	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de material: " + this.tipoMaterial);
	}

}
