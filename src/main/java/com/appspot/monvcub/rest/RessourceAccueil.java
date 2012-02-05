package com.appspot.monvcub.rest;

import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class RessourceAccueil extends ServerResource {
	@Get
	public Representation represente() {
		return FabriqueTemplate.créeTemplate("accueil.ftl");
	}
}
