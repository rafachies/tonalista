package br.net.tonalista.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.net.tonalista.model.Balada;


@Model
@Stateful
public class BaladaServiceBean {

	@Inject private Logger logger;
	@Inject private EntityManager entityManager;
	
	private Balada newBalada;
	
	public void create () {
		logger.info("[CRUD] [Balada] - Creating");
		entityManager.persist(newBalada);
		logger.info("[CRUD] [Balada] - Created");
	}
	
	@Produces
	@Named
	public Balada getNewBalada() {
		return newBalada;
	}
	
	@PostConstruct
	public void initNewBalada() {
		newBalada = new Balada();
	}
}
