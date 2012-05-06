package br.net.tonalista.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
@ApplicationScoped
public class ToNaListaApplication extends Application{

}
