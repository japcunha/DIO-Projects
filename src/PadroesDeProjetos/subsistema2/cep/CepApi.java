package PadroesDeProjetos.subsistema2.cep;

import PadroesDeProjetos.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){

        return instancia;
    }
    public String recuperarCidade(String cep){
        return "São Paulo";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
