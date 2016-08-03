/**
 * 
 */
package com.quoioln.springinpractice.jdbc.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quoioln.springinpractice.jdbc.model.Contact;
import com.quoioln.springinpractice.jdbc.service.dao.ContactDAO;

/**
 * @author quoioln
 *
 */
@Controller
@RequestMapping(value = "contacts")
public class ContactController {
//	private final Logger logger = LoggerFactory.
	@Inject private ContactDAO contactDAO;
	
	@Value("#{viewNames.contactList}")
	private String contactListViewName;
	
	@Value("#{viewNames.contactForm}")
	private String contactFormViewName;
	
	@Value("#{viewNames.createContactSuccess}")
	private String createContactSuccessViewName;
	
	@Value("#{viewNames.deleteContactSuccess")
	private String deleteContactSuccessViewName;
	
	@Value("#{viewNames.contactSerp")
	private String contactSerpViewName;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAllowedFields(new String[] {
				"id", "firstName", "lastName", "email"
		});
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String createContactForm(HttpServletRequest request, Model model) {
		prepareNewContactForm(request);
		model.addAttribute(new Contact());
		return contactFormViewName;
	}
	
	private void prepareNewContactForm(HttpServletRequest request) {
		setActionAndMethod(request, "/contacts.html", "POST");
	}
	
	private void prepareExistingContactForm(HttpServletRequest request, long id) {
		setActionAndMethod(request, "/contacts/" + id + ".html", "POST");
	}
	
	private void setActionAndMethod(HttpServletRequest request, String action, String method) {
		request.setAttribute("action", action);
		request.setAttribute("method", method);
	}
}
