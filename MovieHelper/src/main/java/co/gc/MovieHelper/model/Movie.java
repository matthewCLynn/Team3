package co.gc.MovieHelper.model;

public class Movie {
	
	private String poster_path;
	private boolean adult;
	private String overview;
	private String release_date;
	private Integer genre_ids;
	private Long id;
	private String original_title;
	private String original_language;
	private String title;
	private String backdrop_path;
	private double popularity;
	private Integer vote_count;
	private boolean video;
	private double vote_average;
	
	public Movie() {
		super();
	}

	public Movie(String poster_path, boolean adult, String overview, String release_date, Integer genre_ids, Long id,
			String original_title, String original_language, String title, String backdrop_path, double popularity,
			Integer vote_count, boolean video, double vote_average) {
		super();
		this.poster_path = poster_path;
		this.adult = adult;
		this.overview = overview;
		this.release_date = release_date;
		this.genre_ids = genre_ids;
		this.id = id;
		this.original_title = original_title;
		this.original_language = original_language;
		this.title = title;
		this.backdrop_path = backdrop_path;
		this.popularity = popularity;
		this.vote_count = vote_count;
		this.video = video;
		this.vote_average = vote_average;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public Integer getGenre_ids() {
		return genre_ids;
	}

	public void setGenre_ids(Integer genre_ids) {
		this.genre_ids = genre_ids;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public Integer getVote_count() {
		return vote_count;
	}

	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}

	public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public double getVote_average() {
		return vote_average;
	}

	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}

	@Override
	public String toString() {
		return "Movie [poster_path=" + poster_path + ", adult=" + adult + ", overview=" + overview + ", release_date="
				+ release_date + ", genre_ids=" + genre_ids + ", id=" + id + ", original_title=" + original_title
				+ ", original_language=" + original_language + ", title=" + title + ", backdrop_path=" + backdrop_path
				+ ", popularity=" + popularity + ", vote_count=" + vote_count + ", video=" + video + ", vote_average="
				+ vote_average + "]";
	}
}
