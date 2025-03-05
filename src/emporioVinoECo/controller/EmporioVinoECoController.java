package emporioVinoECo.controller;

import java.util.ArrayList;

import emporioVinoECo.model.Produto;

import emporioVinoECo.repository.IEmporioECoRepository;

public class EmporioVinoECoController implements IEmporioECoRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\n O produto: " + produto.getId() + " foi cadastrado com sucesso");		
	}

	@Override
	public void procurarProduto(int id) {
		var produto = buscarNaCollection(id);
		if(produto != null) {
			produto.visualizar();
		}else
			System.out.println("\nO produto id: " + id + " não foi encontrado!");
	
	}

	@Override
	public void listarProdutos() {
		for( var produto : listaProdutos) {
			produto.visualizar();
			
		}
		
	}

	@Override
	public void atualizarProdutos(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		
		if(buscaProduto != null ) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\n Produto id: " + produto.getId() + " foi atualizado com sucesso!");
		}
		else {
			System.out.println("\n Produto id: " + produto.getId() + " não foi encontrado!");
		}
		
	}

	@Override
	public void excluir(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println("\n O produto id: " + id + " foi deletado com sucesso!");
		}
		else
			System.out.println("\n Produto id: " + id + " não foi encontrado!");
		
	}

	@Override
	public void estoque() {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++ numero;
	}
	
	public Produto buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
}