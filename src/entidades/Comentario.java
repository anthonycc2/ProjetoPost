package entidades;

public class Comentario {
	private Usuario usuario;
	private String texto;

	public Comentario(Usuario usuario, String texto) {
		this.texto = texto;
		this.usuario = usuario;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
