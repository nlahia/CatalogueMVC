package org.miage.sid.controllers;

import javax.validation.Valid;

import org.miage.sid.dao.Produit;
import org.miage.sid.metier.IcatalogueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatalogueController {
	
	@Autowired
	private IcatalogueMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.getAllProduits());
		return "produits";
	}
	
	@RequestMapping(value="/saveProduit")
	public String save(@Valid Produit p,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			model.addAttribute("produits",metier.getAllProduits());
			return "produits"; 
		}
		metier.addProduit(p);
		
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.getAllProduits());
		return "produits";
	}
	

}
