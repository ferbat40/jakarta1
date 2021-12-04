package projeto.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("porra")
@RequestScoped
public class IndexBean implements Serializable{

	
	public String getTexto() {
		return "homen de ferro da porra";
	}
}
