package br.com.angrybits.angrybitsWeb.view;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.ClienteBC;
import br.com.angrybits.angrybitsCore.entity.Cliente;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@Controller
@PreviousView("/bookmark_list.xhtml")
public class ClienteEditMB  extends AbstractEditPageBean<Cliente, Long>{
		
	private static final long serialVersionUID = 1L;
	@Inject
	private ClienteBC clienteBC;

	
	@Override
	@Transactional	
	public String delete() {
		this.clienteBC.delete(getId());
		return null;
	}

	@Override
	@Transactional
	public String insert() {
		this.clienteBC.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		this.clienteBC.update(getBean());
		return null;
	}

	@Override
	protected Cliente handleLoad(Long id) {
		return this.clienteBC.load(id);
	}

}
