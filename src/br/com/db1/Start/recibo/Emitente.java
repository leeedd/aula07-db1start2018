package br.com.db1.Start.recibo;

public class Emitente {

	private String nome;
	
	private String documento;
	
	private byte[] assinatura;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public byte[] getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(byte[] assinatura) {
		this.assinatura = assinatura;
	}
	public String getDocumentoFormatado(){
		String documentoFormatado = documento.toString();
		documentoFormatado = documentoFormatado.substring(0, 3) + "." 
		+ documentoFormatado.substring(3, 6) + documentoFormatado.substring(6,9)+"-"
		+ documentoFormatado.substring(9,11);
		
		return documentoFormatado;
		
	}
}
