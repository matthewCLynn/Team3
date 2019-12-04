package co.gc.MovieHelper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@Value("${movie.token}")
	String token;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView homePage()
	{
		
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("search-movie")
	public ModelAndView 
	
	

}
