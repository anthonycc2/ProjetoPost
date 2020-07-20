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
	private ArrayList<Usuario> usuariosLike;
	
	public Postagem(Date momento, String titulo, String conteudo, Usuario usuario) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = 0;
		this.usuario = usuario;
		this.comentarios = new ArrayList<Comentario>();
		this.usuariosLike = new ArrayList<Usuario>();	
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
	
	public void receberLike(Usuario usuario) {
		this.usuariosLike.add(usuario);
		this.likes = this.usuariosLike.size();
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
	
	public ArrayList<Usuario> getUsuariosLike() {
		return usuariosLike;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + titulo);
		sb.append("\nAutor: " + usuario.getNome());
		sb.append("\nMomento: " + FORMATO_DATA.format(momento));
		sb.append("\nConteúdo: " + conteudo);
		sb.append("\nLikes: " + likes);

		sb.append("\nQuem deu like:");
		for (Usuario u : usuariosLike)
			sb.append("\n> " + u.getNome());

		sb.append("\nComentários:");
		for (Comentario c : comentarios)
			sb.append("\n> " + c.getUsuario().getNome() + ": " + c.getTexto());
		
		return sb.toString();
		//return "Postagem [momento=" + momento + ", titulo=" + titulo + ", conteudo=" + conteudo + ", likes=" + likes
		//		+ ", comentarios=" + comentarios + "]";
	}
}
