package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("Aprender a programar em java é muito bom");
		Comment c2 = new Comment("Procuro pela minha primeira oportunidade de emprego na área de TI");
		
		
		
		Post p1 = new Post(sdf.parse("04/05/2022 19:00:00"), 
				"Aprendendo a programar", 
				"Estou focado no aprendizado em java a 3 semanas", 
				22);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		
		
		
		
		
		sc.close();
	}

}
