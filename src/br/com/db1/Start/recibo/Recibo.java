package br.com.db1.Start.recibo;

import java.util.Date;
import java.util.List;

public class Recibo {

	private Integer numero;
	
	private Double valor;
	
	private Date dataCadastro;
	
	private Boolean confirmacao;
	
	private Date dataemissao;
	
	private List<Servico> servicos;
	
	private Emitente emitente;
	
	private Pagador pagador;
	
	private Cidade cidade;
	
	public String getValorDescritivo(){
		return "";
	}
	public String getDataEmissaoDescritiva(){
		return "";
	}
}
