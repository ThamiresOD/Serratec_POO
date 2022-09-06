package br.org.serratec.teste;

import br.org.serratec.model.Atleta;
import br.org.serratec.model.Pais;

public class TesteAtleta {
	public static void main(String[] args) {
		Pais p1 = new Pais("Eua");
		Pais p2 = new Pais("Brasil");
		
		Atleta a1 = new Atleta("Ronda", "Judô", 35, 61., 1.70, 1.75, p1);//pena
		Atleta a2 = new Atleta("Amanda", "Karatê", 34, 61., 1.73, 1.75, p2);//pena
		Atleta a3 = new Atleta("Rose", "Mistas/Jiu-Jitsu BR", 30, 52., 1.65, 1.68, p1);//palha
		
		System.out.println(a1.toString() + "\n" + a1.luta());	
		System.out.println(a2.toString() + "\n" + a2.luta());
		System.out.println(a3.toString() + "\n" + a3.luta());
		
	}
}
