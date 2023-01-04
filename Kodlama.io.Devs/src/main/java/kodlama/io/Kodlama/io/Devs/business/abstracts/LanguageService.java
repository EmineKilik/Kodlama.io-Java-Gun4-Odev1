package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageService {

	List<Language> getAll();
	void create(Language language) throws Exception;
	void delete(int id);
	void update(Language language) throws Exception;
	Language getById(int id);
	
}
