package one.digitalinnovetion.gof.Facade;

import Subsistetema1.crm.CrmService;
import one.digitalinnovetion.gof.subsistema2.cep.CepApi;

public class Facade {
    

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
