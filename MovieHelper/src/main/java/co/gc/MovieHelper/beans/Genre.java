package co.gc.MovieHelper.beans;

import java.util.ArrayList;

public class Genre {
	
	private int id;
	private String name;
	public Genre() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Genre(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}
	public static int findIdFromName(String name, ArrayList<Genre> genres) {
		for (Genre g : genres) {
			if (name.equalsIgnoreCase(g.getName())) {
				return g.getId();
			}
		}
		return 0;
	}

}
