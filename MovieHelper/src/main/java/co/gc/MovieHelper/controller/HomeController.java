package co.gc.MovieHelper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.MovieHelper.beans.Movie;
import co.gc.MovieHelper.beans.Results;

@Controller
public class HomeController
{
	@Value("${movie.key}")
	String key;
	
	@Value("${movie.token}")
	String token;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView homePage()
	{
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=" + key + "&language=en-US&include_adult=false&include_video=false&page=1";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + token);
		headers.add(HttpHeaders.USER_AGENT, "Testing!");
		headers.add("Accept",  MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<Results> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<String>("parameters",headers), Results.class);
		Results output = rt.getForObject(url, Results.class);
		
		String url2 = "https://api.themoviedb.org/3/movie/550?api_key=676b3eb17b0eafb015088ceeb38a37c0";
		System.out.println(	rt.getForObject(url2, Movie.class).getTitle());
		return null;
//		return new ModelAndView("index", "test", response.getBody());
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
