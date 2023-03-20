package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.BillingService;
import com.zohocrm.service.ContactService;

@Controller
public class Billingcontroller {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id")long id,Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}

	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("billing")Billing billing,Model model) {
		billingService.saveBill(billing);
		model.addAttribute("billing", billing);
		return "print_bill";
	}
}
