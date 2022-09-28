//Alvin Zheng
package project1;

public class main {

	public static void main(String[] args) {
		ShowInWeek Show1 = new ShowInWeek("2022-09-04", "Films (English)", "1","Me Time","N/A",56560000,2);
		ShowInWeek Show2 = new ShowInWeek("2022-09-04", "Films (English)", "2", "Love in the Villa", "N/A", 41220000, 1);
		ShowInWeek Show3 = new ShowInWeek("2022-09-05", "Films (English)", "3", "I Came By", "N/A", 30790000, 1);

		Shows ShowList = new Shows();

		ShowList.addShow(Show1);
		ShowList.addShow(Show2);
		ShowList.addShow(Show3);

		System.out.println("First Print");
		System.out.println(ShowList);
		//a1.writeFile("./javaproject1/netflixProcessed");


		System.out.println("\nRandom Suggestion");
		String randomSuggest = ShowList.RandomSuggestion();
		System.out.println(randomSuggest);
		ShowList.getShow(randomSuggest);

		System.out.println("\nPredictive Suggestion");
		String prediction = ShowList.PredictiveSuggestion(Show3);
		ShowList.getShow(prediction);

		System.out.println("\nPurge Test");
		ShowList.purge("2022-09-05");

		System.out.println(ShowList);
		ShowList.writeFile("./project1/netflixProcessed");
	}

}
