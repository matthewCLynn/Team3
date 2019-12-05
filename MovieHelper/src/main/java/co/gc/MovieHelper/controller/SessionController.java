package co.gc.MovieHelper.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.MovieHelper.beans.Movie;

@Controller
public class SessionController {

	@Value("${movie.key}")
	String key;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("add-to-list")
	public ModelAndView addToList(long id) {
		Movie movie = Movie.getMovieById(id, key);
		getList().add(movie);
		for (Movie m : getList()) {
		System.out.println(m.getTitle());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private ArrayList<Movie> getList() {

		if (session.getAttribute("list") == null) {
			
			List<Movie> list = new ArrayList<Movie>();
			session.setAttribute("list", list);
			
		}
		
		return (ArrayList<Movie>)session.getAttribute("list");
		
	}
	
}
