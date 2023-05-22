package br.unicamp.ic.inf335.app.inf3350prj04b;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {

	ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
	AnuncianteBean anunciante = new AnuncianteBean("Renan", "11111111111", anuncios);
	
	@Test
	void testAddAnuncio_Success() {
		
		ProdutoBean produto = new ProdutoBean("COD1", "PRODname1", "Blablabla", 30.00, "Novo");
		ProdutoBean produto2 = new ProdutoBean("COD2", "PRODname2", "Blablabla", 20.00, "Usado");
		ArrayList<URL> fotosUrlProd1 = new ArrayList<URL>();
		ArrayList<URL> fotosUrlProd2 = new ArrayList<URL>();
		AnuncioBean anuncio1 = new AnuncioBean(produto, fotosUrlProd1, 0.5);		
		AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrlProd2, 0.5);
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();	
		AnuncianteBean anunciante = new AnuncianteBean("Renan", "11111111111", anuncios);
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		assertEquals(2, anunciante.getAnuncios().size());
	}
	
	
	@Test
	void testRemoveAnuncio_Success() {
		
		ProdutoBean produto = new ProdutoBean("COD1", "PRODname1", "Blablabla", 30.00, "Novo");
		ProdutoBean produto2 = new ProdutoBean("COD2", "PRODname2", "Blablabla", 20.00, "Usado");
		ArrayList<URL> fotosUrlProd1 = new ArrayList<URL>();
		ArrayList<URL> fotosUrlProd2 = new ArrayList<URL>();
		AnuncioBean anuncio1 = new AnuncioBean(produto, fotosUrlProd1, 0.5);		
		AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrlProd2, 0.5);
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
		anuncios.add(anuncio1);
		anuncios.add(anuncio2);
		anuncios.remove(anuncio2);
		AnuncianteBean anunciante = new AnuncianteBean("Renan", "11111111111", anuncios);
		
		assertEquals(1, anunciante.getAnuncios().size());
	}
	
	@Test
	void testValorMedioAnuncios_Success() {
		
		ProdutoBean produto = new ProdutoBean("COD1", "PRODname1", "Blablabla", 30.00, "Novo");
		ProdutoBean produto2 = new ProdutoBean("COD2", "PRODname2", "Blablabla", 20.00, "Usado");
		ArrayList<URL> fotosUrlProd1 = new ArrayList<URL>();
		ArrayList<URL> fotosUrlProd2 = new ArrayList<URL>();
		AnuncioBean anuncio1 = new AnuncioBean(produto, fotosUrlProd1, 0.5);		
		AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrlProd2, 0.5);
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
		anuncios.add(anuncio1);
		anuncios.add(anuncio2);
		AnuncianteBean anunciante = new AnuncianteBean("Renan", "11111111111", anuncios);
		Double Result = anunciante.valorMedioAnuncios();
		Double ExpectedResult = 12.50; // valor com os descontos aplicados.
		
		assertEquals(Result, ExpectedResult);
		
		/*Obs: se o valor médio dos anúncios precisar retornar a média dos valores dos produtos anunciados SEM DESCONTO, é necessário corrigir
		 * o método valorMedioAnuncios em AnuncianteBeans para considerar an.getProduto().valor ao invés de simplesmente an.getValor()*/
	}
}
