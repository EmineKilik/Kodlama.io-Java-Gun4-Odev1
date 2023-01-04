package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	void create(Language language);
	void delete(int id);
	void update(Language language);
	Language getById(int id);

}
