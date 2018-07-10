package br.com.angrybits.angrybitsWeb.view;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.UsuarioBC;
import br.com.angrybits.angrybitsCore.entity.Usuario;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@Controller
@PreviousView("/cadastrar_cliente.xhtml")
public class ClienteEditMB  extends AbstractEditPageBean<Usuario, Long>{
		
	private static final long serialVersionUID = 1L;
	@Inject
	private UsuarioBC clienteBC;

	
	@Override
	@Transactional	
	public String delete() {
		this.clienteBC.delete(getId());
		return getCurrentView();
	}

	@Override
	@Transactional
	public String insert() {
		this.clienteBC.insert(getBean());
		return getCurrentView();
	}

	@Override
	@Transactional
	public String update() {
		this.clienteBC.update(getBean());
		return null;
	}

	@Override
	protected Usuario handleLoad(Long id) {
		return this.clienteBC.load(id);
	}

}
