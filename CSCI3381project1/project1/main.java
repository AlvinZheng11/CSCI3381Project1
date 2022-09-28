package project1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetShows allData = new GetShows("./project1/netflixTopTenProcessed.txt");
		ShowInWeek newSIW = new ShowInWeek("2022-09-04","Films (English)","1","Me Time","N/A",56560000,2);
		allData.addShow (newSIW);
		System.out.println(allData);
	}

}
