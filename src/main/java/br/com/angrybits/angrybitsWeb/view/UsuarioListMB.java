package br.com.angrybits.angrybitsWeb.view;

import java.util.List;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.UsuarioBC;
import br.com.angrybits.angrybitsCore.entity.Usuario;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@Controller
@ViewController
public class UsuarioListMB  extends AbstractListPageBean<Usuario, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6045757416690274778L;
	
	@Inject
	private UsuarioBC clienteBC;

	@Override
	protected List<Usuario> handleResultList() {
		return this.clienteBC.findAll();
	}

}
