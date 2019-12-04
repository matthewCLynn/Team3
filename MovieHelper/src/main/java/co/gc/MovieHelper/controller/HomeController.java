package co.gc.MovieHelper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.MovieHelper.beans.Results;

@Controller
public class HomeController
{
	@Value("${movie.key}")
	String key;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView homePage()
	{
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=" + key;
		Results output = rt.getForObject(url, Results.class);
		return new ModelAndView("index", "test", output);
	}
	
	@RequestMapping("search-movie")
	public ModelAndView searchDatabase(String filterChoice, String filterInput, String name)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Token "+key);
		headers.add(HttpHeaders.USER_AGENT, "Testing!");
		headers.add("Accept",  MediaType.APPLICATION_JSON_VALUE);
		
		
		
		return null;
	}
	
	

}
