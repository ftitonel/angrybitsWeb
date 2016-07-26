package br.com.angrybits.angrybitsWeb.persistence;

import br.com.angrybits.angrybitsCore.entity.Bookmark;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class BookmarkDAO extends JPACrud<Bookmark, Long> {
	
	private static final long serialVersionUID = 1L;
	
}
