package modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mercadoria
{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer cod_Merc;
   private String  tipo_Merc;
   private String nome_Merc;
   private Integer qtde_Merc;
   private double preco_Merc;
   private String tipo_Negoc;

	public Integer getCod_Merc() {
		return cod_Merc;
	}

	public void setCod_Merc(Integer cod_Merc) {
		this.cod_Merc = cod_Merc;
	}
	
	public String getTipo_Merc() {
		return tipo_Merc;
	}

	public void setTipo_Merc(String tipo_Merc) {
		this.tipo_Merc = tipo_Merc;
	}

	public String getNome_Merc() {
		return nome_Merc;
	}

	public void setNome_Merc(String nome_Merc) {
		this.nome_Merc = nome_Merc;
	}

	public Integer getQtde_Merc() {
		return qtde_Merc;
	}

	public void setQtde_Merc(Integer qtde_Merc) {
		this.qtde_Merc = qtde_Merc;
	}

	public double getPreco_Merc() {
		return preco_Merc;
	}

	public void setPreco_Merc(double preco_Merc2) {
		this.preco_Merc = preco_Merc2;
	}

	

	public String getTipo_Negoc() {
		return tipo_Negoc;
	}

	public void setTipo_Negoc(String tipo_Negoc) {
		this.tipo_Negoc = tipo_Negoc;
	}
  
   
}
