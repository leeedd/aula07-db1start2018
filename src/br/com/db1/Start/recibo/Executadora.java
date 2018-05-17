package br.com.db1.Start.recibo;

public class Executadora {

	public static void main(String[] args) {
		//exibirCepFormatado(80540150);
		//exibirCepFormatado(87909990);
		//exibirCepFormatado(89079660);
		
		exibirEmitenteFormatado("07396506964");
		
		
	}

	private static void exibirEmitenteFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}
	private static void exibirEmitenteFormatado(String documentoSemFormatacao){
		Emitente emitente = new Emitente();
		emitente.setDocumento(documentoSemFormatacao);
		System.out.println(emitente.getDocumentoFormatado());
		
	}
}
