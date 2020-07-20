package programa;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Usuario maria = new Usuario("Maria");
		Usuario joice = new Usuario("Joice");
		Usuario joao = new Usuario("Jo�o");
		Usuario jose = new Usuario("Jos�");
		Usuario carla = new Usuario("Carla");
		Usuario marcelo = new Usuario("Marcelo");
		
		Comentario c1 = new Comentario(maria, "Uau, maravilhoso!");
		Comentario c2 = new Comentario(joice, "Tenha uma boa viagem.");
		Comentario c3 = new Comentario(joao, "Boa noite.");
		Comentario c4 = new Comentario(jose, "Que a for�a esteja com voc�!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data1 = sdf.parse("21/06/2018 13:05:44");
		Postagem post1 = new Postagem(data1, "Viajando para Nova Zel�ndia", "Vou para este pa�s maravilhoso!", carla);
		post1.receberLike(maria);
		post1.receberLike(joice);
		post1.adicionarComentario(c1);
		post1.adicionarComentario(c2);
		
		Date data2 = sdf.parse("28/07/2018 23:14:19");
		Postagem post2 = new Postagem(data2, "Boa noite, caras", "Vejo voc�s amanh�.", marcelo);
		post2.receberLike(joao);
		post2.receberLike(jose);
		post2.adicionarComentario(c3);
		post2.adicionarComentario(c4);
		
		System.out.println("--- Postagem #1 ---");
		System.out.println(post1.toString());
		System.out.println("\n--- Postagem #2 ---");
		System.out.println(post2.toString());
	}

}
