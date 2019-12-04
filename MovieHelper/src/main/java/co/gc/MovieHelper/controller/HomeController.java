package co.gc.MovieHelper.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
	public int pageCount =5;
	
	@RequestMapping("/")
	public ModelAndView homePage()
	{
		String url = "https://api.themoviedb.org/3/discover/movie?api_key=" + key+"&page=";
		String url2 = url + 1;
		Results output = rt.getForObject(url2, Results.class);
		ArrayList<Results> arrayOfResults = new ArrayList<>();
		arrayOfResults.add(output);
		arrayOfResults=loopPages(url, arrayOfResults);
//		System.out.println(arrayOfResults.get(4).getResults().get(3));
		return new ModelAndView("index", "test", arrayOfResults);
	}
	
	@RequestMapping("search-movie")
	public ModelAndView searchDatabase(String category, String input, int page)
	{
		String url = "";
		if(category.equals("title"))
		{
			System.out.println(input);
			url = "https://api.themoviedb.org/3/search/movie?api_key=" + key + "&query=" + input + "&page=";
		}
		else
		{
			url = "https://api.themoviedb.org/3/discover/movie?api_key=" + key + "&"+ category + "=" + input + "&page=";
		}
		String url2 = url + "1";
		Results output = rt.getForObject(url2, Results.class);
		ArrayList<Results> arrayOfResults = new ArrayList<>();
		arrayOfResults.add(output);
		arrayOfResults=loopPages(url, arrayOfResults);
		System.out.println(arrayOfResults.get(0));
		return new ModelAndView("index", "test", arrayOfResults);
	}
	
	public ArrayList<Results> loopPages(String url, ArrayList<Results> arrayOfResults)
	{
		for(int i = 2; i<pageCount + 1; i++)
		{
			String tempUrl = url;
			arrayOfResults.add(rt.getForObject(tempUrl+i, Results.class));
		}
		
		return arrayOfResults;
	}
	

}
