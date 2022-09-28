package project1;

public class ShowInWeek {

	private String week;
	private String category;
	private String weeklyRank;
	private String showTitle;
	private String seasonTitle;
	private int weeklyHours;
	private int weeksInTop10;
	private boolean purge;

	public ShowInWeek() {
		week = "not set";
		category = "not set";
		weeklyRank = "not set";
		showTitle = "not set";
		seasonTitle = "not set";
		weeklyHours = 0;
		weeksInTop10 = 0;
		purge = false;
	}

	public ShowInWeek(String w, String c, String r,String s, String t, int h, int i) {
		week = w;
		category = c;
		weeklyRank = r;
		showTitle = s;
		seasonTitle = t;
		weeklyHours = h;
		weeksInTop10 = i;
	}

	public void setWeek(String w) {
		week = w;
	}
	
	public void setCategory(String c) {
		category = c;
	}
	
	public void setWeeklyRank(String r) {
		weeklyRank = r;
	}
	
	public void setShowTitle(String s) {
		showTitle = s;
	}
	
	public void setSeasonTitle(String t) {
		seasonTitle = t;
	}
	
	public void setWeeklyHours(int h) {
		weeklyHours = h;
	}
	
	public void setWeeksInTop10(int i) {
		weeksInTop10 = i;
	}
	
	public void setPurge(boolean p) {
		purge = p;
	}
	
	public String getWeek() {
		return week;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getWeeklyRank() {
		return weeklyRank;
	}
	
	public String getShowTitle() {
		return showTitle;
	}
	
	public String getSeasonTitle() {
		return seasonTitle;
	}
	
	public int getWeeklyHours() {
		return weeklyHours;
	}
	
	public int getWeeksInTop10() {
		return weeksInTop10;
	}
	
	public boolean getPurge() {
		return purge;
	}
	
	public String toString() {
		return week + "\n" + category + "\n" + weeklyRank + "\n" 
				+ showTitle + "\n" + seasonTitle + "\n" + weeklyHours + "\n" +weeksInTop10;
	}
}