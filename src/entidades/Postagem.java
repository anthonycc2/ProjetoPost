package entidades;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Postagem {
	private static final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private String titulo;
	private String conteudo;
	private int likes;
	private Usuario usuario;
	private ArrayList<Comentario> comentarios;
	
	public Postagem(Date momento, String titulo, String conteudo, Usuario usuario) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = 0;
		this.usuario = usuario;
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public int getLikes() {
		return likes;
	}
	
	/*public void setLikes(int likes) {
		this.likes = likes;
	}*/
	
	public void darLike() {
		this.likes++;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	/*public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/
	
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + titulo);
		sb.append("\nMomento: " + FORMATO_DATA.format(momento));
		sb.append("\nConteúdo: " + conteudo);
		sb.append("\nLikes: " + likes);
		sb.append("\nComentários:\n");
		
		for (Comentario c : comentarios)
			sb.append("> " + c.getTexto() + "\n");
		
		return sb.toString();
		//return "Postagem [momento=" + momento + ", titulo=" + titulo + ", conteudo=" + conteudo + ", likes=" + likes
		//		+ ", comentarios=" + comentarios + "]";
	}
}
