package co.gc.MovieHelper.beans;

import java.util.ArrayList;

public class GenreResults {
	
	ArrayList<Genre> genres = new ArrayList<>();

	public GenreResults() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenreResults(ArrayList<Genre> genres) {
		super();
		this.genres = genres;
	}

	public ArrayList<Genre> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "GenreResults [genres=" + genres + "]";
	}
}
