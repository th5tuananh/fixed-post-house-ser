package com.lhq.thymclient.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/securedPage")
	@SuppressWarnings("unchecked")
    public String securedPage(Model model,@AuthenticationPrincipal OidcUser user) {
		
        model.addAttribute("user", user.getAttributes());
		return "securedPage";
    }
    
    @RequestMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }
    
    @RequestMapping("/postp")
    public String dopost() {
    	return "postp";
    }
}
