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
import co.gc.MovieHelper.beans.Results;

@Controller
public class SessionController {

	@Value("${movie.key}")
	String key;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("add-to-list")
	public ModelAndView addToList(long id) {
		Movie movie = Movie.getMovieById(id, key);
		List<Movie> list = getList();
		list.add(movie);
		session.setAttribute("list", list);
		for (Movie m : getList()) {
		System.out.println(m.getTitle());
		}
		return new ModelAndView("index");
	}
	
	@SuppressWarnings("unchecked")
	private ArrayList<Movie> getList() {

		if (session.getAttribute("list") == null) {
			List<Movie> list = new ArrayList<Movie>();
			session.setAttribute("list", list);
			
		}
		
		return (ArrayList<Movie>)session.getAttribute("list");
		
	}
	
	@RequestMapping("user-list")
	public ModelAndView getUserList()
	{
		for (Movie m : getList()) {
			System.out.println(m.getTitle());
			}
		List<Movie> list = getList();
		return new ModelAndView("user-list","movies",list);
	}
}
