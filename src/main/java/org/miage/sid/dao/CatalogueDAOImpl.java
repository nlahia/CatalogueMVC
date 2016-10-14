package org.miage.sid.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CatalogueDAOImpl implements IcatalogueDAO{
	private Map<String,Produit> produits=new HashMap<String, Produit>();
	Logger logger = Logger.getLogger(CatalogueDAOImpl.class);
	
	@Override
	public void addProduit(Produit p) {
		 
		produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> getAllProduits() {
		Collection<Produit> Prods = produits.values();
		return  new ArrayList<Produit>(Prods);
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p:produits.values()){
			if(p.getDesignation().indexOf(mc)>=0){
				prods.add(p);
			}
		}
		return prods ;
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	@Override
	public void deleteProduit(String re) {
		// TODO Auto-generated method stub
		produits.remove(re);
	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		produits.put(p.getReference(), p);
	}
	
	public void init(){
		logger.info("initilisation du catalogue");
		addProduit(new Produit("HP645","Ordinateur HP",8000,12));
		addProduit(new Produit("AEA","Imprimante 534",6000,10));
		addProduit(new Produit("AI321","smartphone LG",5432,14));
	}

}
