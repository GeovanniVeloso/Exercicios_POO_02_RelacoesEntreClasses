package view;

import java.util.ArrayList;
import java.util.List;

import model.AgendaTelefonica;
import model.Contato;

public class Principal {

	public static void main(String[] args) {
		Contato c1 = new Contato("Geovanni","11 9xxxx-xxxx","geovanni.ferreira@fatec.sp.gov.br");
		Contato c2 = new Contato("Leandro","11 9xxxx-xxxx","leandro.colevati@fatec.sp.gov.br");
		Contato c3 = new Contato("Ricardo","11 9XXXX-XXXX","ricardo.satoshi@fatec.sp.gov.br");
		Contato c4 = new Contato("Wilson","11 9xxxx-xxxx","wilson.vendramel@fatec.sp.gov.br");
		
		List<Contato>Agenda = new ArrayList<Contato>();
		
		AgendaTelefonica AT = new AgendaTelefonica(Agenda);
		
		AT.addContato(c1);
		AT.addContato(c2);
		AT.addContato(c3);
		AT.addContato(c4);
		
		AT.removeContato("Geovanni");
		
		AT.search("Ricardo");
	}

}
