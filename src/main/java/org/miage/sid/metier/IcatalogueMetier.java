package org.miage.sid.metier;

import java.util.List;

import org.miage.sid.dao.Produit;

public interface IcatalogueMetier {
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String re);
	public void updateProduit(Produit p);
}

