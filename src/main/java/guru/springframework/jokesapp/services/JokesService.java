package guru.springframework.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesService {
	
	public String getJoke() {
		ChuckNorrisQuotes jokeGenerator = new ChuckNorrisQuotes();
		return jokeGenerator.getRandomQuote();
	}
	
}
