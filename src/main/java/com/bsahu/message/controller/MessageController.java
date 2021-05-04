package com.bsahu.message.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bsahu.message.model.MessageBO;
import com.bsahu.message.service.IncommingMessageService;


/**
 * @author bsahu
 *
 */
@RestController
public class MessageController{
    @Value("${spring.application.name}")
    String appName;

    @Autowired
    IncommingMessageService service;
    
    private final static Logger logger = LoggerFactory.getLogger(MessageController.class);
    
	@PostMapping("/postMessage")
	public ModelAndView postMessage(@ModelAttribute MessageBO msg,Model model,RedirectAttributes redirAttrs) {
	
		logger.info("MessageController.postMessage()");
				
		service.pushMessage(msg);
		//redirAttrs.addFlashAttribute("added", "Your Message has been queued to send");	
		//return "redirect:/success";
		model.addAttribute("added", "Your Message has been queued to send");
		return new ModelAndView("success");
	}

	@GetMapping("/")
    public ModelAndView homePage(Model model) {
		logger.info("MessageController.homePage()");
        model.addAttribute("appName", appName);
        return new ModelAndView("home");
    }
	@GetMapping("/error")
    public ModelAndView errorPage(Model model) {
		logger.info("MessageController.errorPage()");
        model.addAttribute("appName", appName);
        return new ModelAndView("exception");
    }
}
