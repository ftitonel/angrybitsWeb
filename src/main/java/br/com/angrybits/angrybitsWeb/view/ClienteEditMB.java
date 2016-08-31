package br.com.angrybits.angrybitsWeb.view;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.ClienteBC;
import br.com.angrybits.angrybitsCore.entity.Cliente;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;

@ViewController
public class ClienteEditMB  extends AbstractEditPageBean<Cliente, Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ClienteBC clienteBC;

	@Override
	public String delete() {
		this.clienteBC.delete(getId());
		return null;
	}

	@Override
	public String insert() {
		this.clienteBC.insert(getBean());
		Cliente cliente1 = new Cliente("felipe.titonel@gmail.com", "(85)999383404", "PF", null, null);
		this.clienteBC.insert(cliente1);
		return null;
	}

	@Override
	public String update() {
		this.clienteBC.update(getBean());
		return null;
	}

	@Override
	protected Cliente handleLoad(Long arg0) {
		return null;
	}

}
