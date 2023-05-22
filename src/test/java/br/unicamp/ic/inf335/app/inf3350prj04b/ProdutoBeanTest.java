package br.unicamp.ic.inf335.app.inf3350prj04b;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	@Test
	void testCompareTo_Success() {
		
		ProdutoBean produto = new ProdutoBean("COD1", "PRODname1", "Blablabla", 20.00, "Novo");
		ProdutoBean produto2 = new ProdutoBean("COD2", "PRODname2", "Blablabla", 30.00, "Usado");
		ArrayList<URL> fotosUrlProd1 = new ArrayList<URL>();
		ArrayList<URL> fotosUrlProd2 = new ArrayList<URL>();
		AnuncioBean anuncio1 = new AnuncioBean(produto, fotosUrlProd1, 0.5);		
		AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrlProd2, 0.5);
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
		anuncios.add(anuncio1);
		anuncios.add(anuncio2);
		
		int valorEsperado = -1;
		
		int ResultValorMenor = produto.compareTo(produto2);
		
		assertEquals(valorEsperado, ResultValorMenor);			
	}
}
