package subsistema2.cep;

public class CepApi {
	
	private static CepApi cepApi = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getCepApi() {
		return cepApi;
	}
	
	public String recuperarCidade(String cep) {
		return "Bombinhas";
	}
	
	public String recuperarEstado(String cep) {
		return "Santa Catarina";
	}
}
