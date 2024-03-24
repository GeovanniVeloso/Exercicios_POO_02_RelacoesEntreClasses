package view;

import java.util.ArrayList;
import java.util.List;

import model.Musica;
import model.Playlist;

public class Principal {

	public static void main(String[] args) {
		Musica m1 = new Musica("Through the Valley", "Shawn James","Shawn James Music,Inc.");
		Musica m2 = new Musica("Colors","Black Pumas", "ATO Records,LLC.");
		Musica m3 = new Musica("Can't Stop", "Red Hot Chili Peppers", "Warner Records Inc.");
		Musica m4 = new Musica("Snow","Red Hot Chili Peppers", "Warner Records Inc.");
		Musica m5 = new Musica("Burn the Witch","Shawn James","Shawn James Music,Inc.");
		Musica m6 = new Musica("In the End", "Linkin Park", "Warner Records Inc.");
		Musica m7 = new Musica("Numb", "Linkin Park", "Warner Records Inc.");
		Musica m8 = new Musica("Eruption", "Van Halen", "Warner Records Inc.");
		Musica m9 = new Musica("Wish You Were Here", "Pink Floyd", "Pink Floyd Music Ltd.");
		Musica m10 = new Musica("Confortably Numb", "Pink Floyd", "Pink Floyd Music Ltd.");
		
		List<Musica>pl = new ArrayList<Musica>();
		pl.add(m1);
		pl.add(m2);
		pl.add(m3);
		pl.add(m4);
		pl.add(m5);
		pl.add(m6);
		pl.add(m7);
		pl.add(m8);
		pl.add(m9);
		pl.add(m10);
		Playlist p = new Playlist("Geovanni", pl);
		
		try {
			System.out.println("********************************************************************");
			p.tocarPlaylist();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
		try {
			System.out.println("********************************************************************");
			p.tocarAleatorio();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
		
	}

}
