package project1;

public class ShowInWeek {

    private String week;
    private String category;
    private int weeklyRank;
    private String seasonTitle;
    private int weeklyHours;
    private int weeksInTop10;

    public ShowInWeek() {
        week = "not set";
        category = "not set";
        weeklyRank = 0;
        seasonTitle = "not set";
        weeklyHours = 0;
        weeksInTop10 = 0;
    }

    public ShowInWeek(String w, String c, int r, String t, int h, int i) {
        week = w;
        category = c;
        weeklyRank = r;
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

    public void setWeeklyRank(int r) {
        weeklyRank = r;
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

    public String getWeek() {
        return week;
    }

    public String getCategory() {
        return category;
    }

    public int getWeeklyRank() {
        return weeklyRank;
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
}