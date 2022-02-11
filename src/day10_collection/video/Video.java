package day10_collection.video;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Video {
	String title, category, name;
	boolean bil;
	Date Date;
	
	Video(String title, String category) {
		this.title = title;
		this.category = category;
		bil = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBil() {
		return bil;
	}

	public void setBil(boolean bil) {
		this.bil = bil;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	@Override
	public String toString() {
		SimpleDateFormat t = new SimpleDateFormat("yy/MM/dd");
		if (bil)
			return "Video [title=" + title + ", category=" + category + ", name=" + name + ", bil=" + bil + ", Date=" + t.format(Date)
				+ "]";
		else
			return "Video [title="+title+", category="+category+", bil="+bil+"]";
	}
	
	
	
}
