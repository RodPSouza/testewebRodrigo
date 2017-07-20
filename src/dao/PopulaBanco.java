package dao;

import modelo.Mercadoria;

import javax.persistence.EntityManager;


public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		Mercadoria selic = geraMercadoria("TÍTULOS_PÚBLICOS", "Tesouro Selic" , 1 , 84.00, "COMPRA");
				
		em.persist(selic);
		
		em.getTransaction().commit();
		em.close();
		
	}
		
	private static Mercadoria geraMercadoria(String  tipo_Merc, String nome_Merc, Integer qtde_Merc,
			double preco_Merc, String tipo_Negoc) {
		
		Mercadoria merc = new Mercadoria();
		
		merc.setTipo_Merc(tipo_Merc);
		merc.setNome_Merc(nome_Merc);
		merc.setQtde_Merc(qtde_Merc);
		merc.setPreco_Merc(preco_Merc);
		merc.setTipo_Negoc(tipo_Negoc);
		
		return merc;
	}

	

}