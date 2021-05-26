package br.com.erickfreire.baralho;

import java.security.SecureRandom;

public class DeckDeCartas {
	
	private Cartas[] deck;
	private int cartaAtual;
	private static final int NUMEROS_DE_CARTAS = 52;
	private static final SecureRandom numeroAleatorio = new SecureRandom();
	
	public DeckDeCartas() {
		String[] faces = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
		String[] naipes = {"Copas", "Ouro", "Paus", "Espadas"};
		deck = new Cartas[NUMEROS_DE_CARTAS];
		cartaAtual = 0;
		
		for(int contador = 0; contador < deck.length; contador++)
			deck[contador] = new Cartas(faces[contador % 13], naipes[contador / 13]);
	}
	
	public void embaralhar() {
		cartaAtual = 0;
		
		for(int primeiro = 0; primeiro < deck.length; primeiro++) {
			int segundo = numeroAleatorio.nextInt(NUMEROS_DE_CARTAS);
			
			Cartas temp = deck[primeiro];
			deck[primeiro] = deck[segundo];
			deck[segundo] = temp;
		}
	}
	
	public Cartas distribuiCartas() {
		if(cartaAtual < deck.length)
			return deck[cartaAtual++];
		else
			return null;
	}

}
