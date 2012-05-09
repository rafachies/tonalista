package br.net.tonalista.controller;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.net.tonalista.model.Picked;

@Model
@ConversationScoped
public class PickBaladaBean implements Serializable {

	private static final long serialVersionUID = -2143145046974752139L;

	@Inject private Logger logger;
	@Inject private Conversation conversation;
	
	private Picked userPicked;
	
	@Produces
	@Named
	public Picked getUserPicked() {
		return userPicked;
	}
	
	@PostConstruct
	public void initNewBalada() {
		userPicked = new Picked();
	}

	public String pick() {
		conversation.begin();
		logger.info("woods picked: " + userPicked.isWoods());
		logger.info("clash picked: " + userPicked.isClash());
		return "sendList";
	}
}
