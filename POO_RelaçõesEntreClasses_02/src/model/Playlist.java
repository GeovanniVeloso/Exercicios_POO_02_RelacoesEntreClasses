package model;

import java.util.List;

public class Playlist {
	
	private String dono;
	private List<Musica>fila;

	public Playlist(String dono, List<Musica>fila) {
		super();
		this.dono = dono;
		this.fila = fila;
	}
	
	public void addMusica(Musica musica) {
		fila.add(musica);
		System.out.println("A música: "+musica.getNome()+" : foi adicionada a playlist.");
	}
	
	public void tocarPlaylist() throws InterruptedException {
		System.out.println("Now Playing: "+fila.get(0).getNome());
		Musica m = fila.get(0);
		fila.remove(0);
		fila.add(m);
		Thread.sleep(1000);
	}
	
	public void tocarAleatorio() throws InterruptedException {
		int size = fila.size();
		size = (int)(Math.random()*size);
		System.out.println("Now Playing: "+fila.get(size).getNome());
		Musica m = fila.get(size);
		fila.remove(size);
		fila.add(m);
		Thread.sleep(1000);
	}

}
