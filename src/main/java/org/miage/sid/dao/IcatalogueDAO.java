package org.miage.sid.dao;

import java.util.List;

public interface IcatalogueDAO {
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String re);
	public void updateProduit(Produit p);
		
}
