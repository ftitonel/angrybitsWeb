package br.com.angrybits.angrybitsWeb.view;

import java.util.List;

import javax.inject.Inject;

import br.com.angrybits.angrybitsCore.business.ConsumoChamdasBC;
import br.com.angrybits.angrybitsCore.entity.ConsumoChamadas;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@Controller
@ViewController
public class ConsumoChamadasListMB  extends AbstractListPageBean<ConsumoChamadas, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -631501750514981653L;
	
	@Inject
	private ConsumoChamdasBC consumoChamadasBC;

	@Override
	protected List<ConsumoChamadas> handleResultList() {
		
		return this.consumoChamadasBC.findAll();
	}

}
