package br.com.angrybits.angrybitsWeb.view;

import java.util.List;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.ConsumoDadosBC;
import br.com.angrybits.angrybitsCore.entity.ConsumoDados;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@Controller
@ViewController
public class ConsumoDadosListMB  extends AbstractListPageBean<ConsumoDados, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConsumoDadosBC consumodadosBC;

	@Override
	protected List<ConsumoDados> handleResultList() {
		
		return consumodadosBC.findAll();
	}

}
