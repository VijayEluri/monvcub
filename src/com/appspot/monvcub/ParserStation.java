package com.appspot.monvcub;

import org.htmlparser.tags.TableRow;

public class ParserStation {

	public static Station parse(TableRow ligne) {
		Station résultat = new Station();
		résultat.setNom(ligne.getColumns()[1].getStringText().trim());

		if (ligne.getColumnCount() == 5) {
			résultat.setEnMaintenance(true);
		} else {
			résultat.setVélosDisponibles(Integer.parseInt(ligne.getColumns()[2].getStringText()));
			résultat.setPlacesDisponibles(Integer.parseInt(ligne.getColumns()[3].getStringText()));
		}
		return résultat;
	}

}
