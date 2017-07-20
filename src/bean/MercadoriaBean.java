package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import modelo.Mercadoria;
import modelo.Tipo_Mercadoria;
import modelo.Tipo_Negocio;

@ManagedBean
@ViewScoped
public class MercadoriaBean {

	private Mercadoria mercadoria = new Mercadoria();
	private Integer codProduto;

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public Mercadoria getMercadoria() {
		return mercadoria;
	}

	public List<Mercadoria> getMercadorias() {

		return new DAO<Mercadoria>(Mercadoria.class).listaTodos();

	}

	public void gravar() {

		new DAO<Mercadoria>(Mercadoria.class).adiciona(this.mercadoria);

		this.mercadoria = new Mercadoria();

	}

	public Tipo_Mercadoria[] getTipo_Mercadorias() {

		return Tipo_Mercadoria.values();

	}

	public Tipo_Negocio[] getTipo_Negocios() {

		return Tipo_Negocio.values();

	}

}