package br.com.erickfreire.baralho;

public class Teste {

	public static void main(String[] args) {
		
		DeckDeCartas meuDeck = new DeckDeCartas();
		meuDeck.embaralhar();
		
		for(int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", meuDeck.distribuiCartas());
			
			if(i % 4 == 0)
				System.out.println();
			
		}

	}

}
