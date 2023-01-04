package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/create")
	public void create(Language language) throws Exception {
		languageService.create(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		languageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(Language language) throws Exception {
		languageService.update(language);
	}
	
	@GetMapping("/getbyid")
	public Language getById(int id) throws Exception {
		return languageService.getById(id);
	}
	
	
	
}
