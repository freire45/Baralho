package br.com.erickfreire.baralho;

/**
 * Programa em Java que simula um baralho de cartas com vetores
 * @author Erick Freire
 * @version 1 - Criado em 26-05-2021 as 15:12
 */

public class Cartas {
	
	private final String face;
	private final String naipe;
	
	public Cartas(String faceCarta, String naipeCarta) {
		this.face = faceCarta;
		this.naipe = naipeCarta;
		
	}
	
	public String toString() {
		return face + " de " + naipe;
	}

}
