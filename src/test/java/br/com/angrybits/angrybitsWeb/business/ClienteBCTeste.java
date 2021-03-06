package br.com.angrybits.angrybitsWeb.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.angrybits.angrybitsCore.business.UsuarioBC;
import br.com.angrybits.angrybitsCore.entity.Bookmark;
import br.com.angrybits.angrybitsCore.entity.Usuario;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class ClienteBCTeste {

	@Inject
	private UsuarioBC clienteBC;
	
	@Inject
	private BookmarkBC bookmarkBC;
	
	@Before
	public void before() {
		for (Bookmark bookmark : bookmarkBC.findAll()) {
			bookmarkBC.delete(bookmark.getId());
		}
	}

//	@Test
//	public void testLoad() {
//		bookmarkBC.load();
//		List<Bookmark> listaBookmarks = bookmarkBC.findAll();
//		assertNotNull(listaBookmarks);
//		assertEquals(10, listaBookmarks.size());
//	}
	
	@Test
	public void testInsert() {
		Usuario cliente1 = new Usuario("felipe.titonel@gmail.com", "(85)999383404", "PF", null, null);
		clienteBC.insert(cliente1);
		List<Usuario> listaBookmarks = clienteBC.findAll();
		assertNotNull(listaBookmarks);
		assertEquals(1, listaBookmarks.size());
	}
	
//	@Test
//	public void testDelete() {
//		Bookmark bookmark = new Bookmark("Demoiselle Portal", "http://www.frameworkdemoiselle.gov.br");
//		bookmarkBC.insert(bookmark);
//		
//		List<Bookmark> listaBookmarks = bookmarkBC.findAll();
//		assertNotNull(listaBookmarks);
//		assertEquals(1, listaBookmarks.size());
//		
//		bookmarkBC.delete(bookmark.getId());
//		listaBookmarks = bookmarkBC.findAll();
//		assertEquals(0, listaBookmarks.size());
//	}
//	@Test
//	public void testUpdate() {
//		Bookmark bookmark = new Bookmark("Demoiselle Portal", "http://www.frameworkdemoiselle.gov.br");
//		bookmarkBC.insert(bookmark);
//		
//		List<Bookmark> listaBookmarks = bookmarkBC.findAll();
//		Bookmark bookmark2 = (Bookmark)listaBookmarks.get(0);
//		assertNotNull(listaBookmarks);
//		assertEquals("Demoiselle Portal", bookmark2.getDescription());
//		
//		bookmark2.setDescription("Demoiselle Portal alterado");
//		bookmarkBC.update(bookmark2);
//		
//		listaBookmarks = bookmarkBC.findAll();
//		Bookmark bookmark3 = (Bookmark)listaBookmarks.get(0);
//		assertEquals("Demoiselle Portal alterado", bookmark3.getDescription());
//	}
}
