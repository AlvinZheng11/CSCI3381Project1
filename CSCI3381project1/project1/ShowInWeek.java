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

	//Default Constructor
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

	//Constructor
	public ShowInWeek(String w, String c, String r,String s, String t, int h, int i) {
		week = w;
		category = c;
		weeklyRank = r;
		showTitle = s;
		seasonTitle = t;
		weeklyHours = h;
		weeksInTop10 = i;
	}

	//set Weeks
	public void setWeek(String w) {
		week = w;
	}
	
	//set Category
	public void setCategory(String c) {
		category = c;
	}
	
	//set Weekly Rank
	public void setWeeklyRank(String r) {
		weeklyRank = r;
	}
	
	//set Show Title
	public void setShowTitle(String s) {
		showTitle = s;
	}
	
	//set Season Title
	public void setSeasonTitle(String t) {
		seasonTitle = t;
	}
	
	//set Weekly Hours Viewed
	public void setWeeklyHours(int h) {
		weeklyHours = h;
	}
	
	//set Weeks in Top 10
	public void setWeeksInTop10(int i) {
		weeksInTop10 = i;
	}
	
	//set purge
	public void setPurge(boolean p) {
		purge = p;
	}
	
	//get Week
	public String getWeek() {
		return week;
	}
	
	//get Category
	public String getCategory() {
		return category;
	}
	
	//get Weekly Rank
	public String getWeeklyRank() {
		return weeklyRank;
	}
	
	//get Show Title
	public String getShowTitle() {
		return showTitle;
	}
	
	//get Season Title
	public String getSeasonTitle() {
		return seasonTitle;
	}
	
	//get Weekly Hours Viewed
	public int getWeeklyHours() {
		return weeklyHours;
	}
	
	//get Weeks in Top 10
	public int getWeeksInTop10() {
		return weeksInTop10;
	}
	
	//get Purge
	public boolean getPurge() {
		return purge;
	}
	
	//to String
	public String toString() {
		return week + "\n" + category + "\n" + weeklyRank + "\n" 
				+ showTitle + "\n" + seasonTitle + "\n" + weeklyHours + "\n" +weeksInTop10;
	}
}