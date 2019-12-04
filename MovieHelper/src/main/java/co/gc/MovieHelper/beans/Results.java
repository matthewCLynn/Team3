package co.gc.MovieHelper.beans;

import java.util.List;

public class Results {

	private int page;
	private int total_results;
	private int total_pages;
	List<Movie> results;
	
	public Results() {
		super();
	}

	public Results(int page, int total_results, int total_pages, List<Movie> results) {
		super();
		this.page = page;
		this.total_results = total_results;
		this.total_pages = total_pages;
		this.results = results;
	}

	public int getPage() {
		return page;
	}

	public int getTotal_results() {
		return total_results;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public List<Movie> getResults() {
		return results;
	}

	@Override
	public String toString() {
		return "Results [page=" + page + ", total_results=" + total_results + ", total_pages=" + total_pages
				+ ", results=" + results.get(0) + "]";
	}
	
}
