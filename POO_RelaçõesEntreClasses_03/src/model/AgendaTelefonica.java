package model;

import java.util.List;

public class AgendaTelefonica {
	
	private List<Contato>Agenda;

	public AgendaTelefonica(List<Contato>Agenda) {
		super();
		this.Agenda = Agenda;
	}
	
	public void addContato(Contato a) {
		Agenda.add(a);
		System.out.println("O contato: "+a.getNome()+" foi adicionado.");
	}
	
	public void removeContato(String nome) {
		int size = Agenda.size();
		for(int i = 0; i < size; i++) {
			if(Agenda.get(i).getNome().equals(nome)) {
				Agenda.remove(i);
				System.out.println("O contato foi removido.");
				i = size;
			}
		}
	}
	
	public void search(String nome) {
		int size = Agenda.size();
		for(int i = 0; i < size; i++) {
			if(Agenda.get(i).getNome().equals(nome)) {
				System.out.println(Agenda.get(i).toString());
			}
		}
	}

}
