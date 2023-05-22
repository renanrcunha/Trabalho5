package br.unicamp.ic.inf335.app.inf3350prj04b;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void testGetValor_Success() {
		
		ProdutoBean produto = new ProdutoBean("COD1", "PRODname1", "Blablabla", 30.00, "Novo");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		AnuncioBean anuncio = new AnuncioBean(produto, fotosUrl, 0.5);
		
		Double Result = anuncio.getValor();
				
		assertEquals(Result, 15.00);
	}

}
