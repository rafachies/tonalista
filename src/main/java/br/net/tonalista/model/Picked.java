package br.net.tonalista.model;

import javax.enterprise.inject.Model;

@Model
public class Picked {

	private boolean woods;
	private boolean clash;
	
	public boolean isWoods() {
		return woods;
	}
	public void setWoods(boolean woods) {
		this.woods = woods;
	}
	public boolean isClash() {
		return clash;
	}
	public void setClash(boolean clash) {
		this.clash = clash;
	}
	
	
}
