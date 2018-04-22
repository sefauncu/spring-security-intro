package hello.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@RequestMapping("/list")
	public String list(){
		return "mesajlar...";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts(){
		return "taslaklar...";
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/add")
	public String addPost(){
		return "mesaj ekle...";
	}
	
	@RequestMapping("/admin/create")
	public String createAdmin(){
		return "kullanıcı ekle...";
	}
	
	
}
