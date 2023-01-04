package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	// Veritabanı bağlantısı yapmadığımız için kendi listemizi oluşturuyoruz.

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(0, "C#"));
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C++"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void create(Language language) {	
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(Language language) {
		for(Language languages : languages) {
			if(languages.getId() == language.getId()) {
				languages.setName(language.getName());
			}
		}		
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			} 			
		}
		return null;
	}
}
