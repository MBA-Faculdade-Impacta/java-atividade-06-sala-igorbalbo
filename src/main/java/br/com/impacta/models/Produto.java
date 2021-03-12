package br.com.impacta.models;

import java.util.ArrayList;

public class Produto{


public int codigo;
public String descricao;
public double valor;
private String telefoneFabricante; 

	public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {


    for(int i = 0 ; i < listaDeProdutos.size() ; i ++){

        Produto produto = listaDeProdutos.get(i);

        if(codigoProduto == produto.codigo ){
        return produto;
      }
    }
    return null;
  }

public void setCodigo(int codigo){
  this.codigo = codigo;
}
public int getCodigo(){
  return this.codigo;
}
public String getTelefoneFabricante(){
  return "(11)"+ this.telefoneFabricante;
}

} 