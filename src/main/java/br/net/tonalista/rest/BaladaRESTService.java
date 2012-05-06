package br.net.tonalista.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.net.tonalista.model.Balada;

@Path("/balada")
public class BaladaRESTService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Balada> listAll() {
		List<Balada> fakeResultList = new ArrayList<Balada>();
		Balada balada = new Balada();
		balada.setId(1);
		balada.setNome("clashclub");
		balada.setEndereco("Barra Funda");
		balada.setTelefone("33334444");
		balada.setEmailDaLista("email@clash.club");
		fakeResultList.add(balada);
		return fakeResultList;
	}
}
