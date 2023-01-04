package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void create(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("İsim boş bırakılamaz.");
		}
		for (Language languages : getAll()) {
			if (languages.getName().equals(language.getName())) {
				throw new Exception("Bu isimde bir programlama dili mevcut.");
			}
		}
		languageRepository.create(language);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

	@Override
	public void update(Language language) throws Exception {
		if (language.getName() == "") {
			throw new Exception("İsim boş bırakılamaz.");
		}
		languageRepository.update(language);
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

}
