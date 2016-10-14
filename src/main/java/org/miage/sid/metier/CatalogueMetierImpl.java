package org.miage.sid.metier;

import java.util.List;

import org.miage.sid.dao.IcatalogueDAO;
import org.miage.sid.dao.Produit;

public class CatalogueMetierImpl implements IcatalogueMetier{
	private IcatalogueDAO dao;
	/*Setter pour l'injection de dépendances  */
	public void setDao(IcatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return dao.getAllProduits();
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getProduitsParMC(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return dao.getProduit(ref);
	}

	@Override
	public void deleteProduit(String re) {
		// TODO Auto-generated method stub
		dao.deleteProduit(re);
	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.updateProduit(p);
	}

}
