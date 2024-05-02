package cursojsf.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;


@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {

	private String nome;
	private HtmlCommandButton commandButton;
	private List<String> nomes = new ArrayList<String>();

	public String mostrarNome() {
		nomes.add(nome);
		if(nomes.size() >= 2) {
			commandButton.setDisabled(true);
			return "paginanavegada";
		}
		return "";
	}


	public List<String> getNomes() {
		return nomes;
	}


	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}


	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
}
