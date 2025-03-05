package emporioVinoECo.repository;

import emporioVinoECo.model.Produto;

public interface IEmporioECoRepository {
	
	public void cadastrarProduto(Produto produto);
	
	public void procurarProduto(int id);
	
	public void listarProdutos();
	
	public void atualizarProdutos(Produto produto);
	
	public void excluir(int id);
	
	public void estoque();
	
}
