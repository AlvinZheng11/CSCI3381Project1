package project1;

import java.io.*;
import java.util.*;

public class GetShows {
	private int size;
	private static final int DEFAULT_SIZE = 100;
	private ShowInWeek[] showInWeek;
	private String fileName;
	Random rand = new Random();


	Scanner input = new Scanner(System.in);

	public GetShows() {
		showInWeek = new ShowInWeek[DEFAULT_SIZE];
		fileName = "netflixTopTenProcessed.txt";
		readFile();
	}

	public void addShow(ShowInWeek s) {
		showInWeek[size] = s;
		size++;
	}

	public void purge(String week) {
		for(ShowInWeek s: showInWeek)
		{
			if(s.getWeek() == week)
			{
				s.setPurge(true);
			} else {
				System.out.println("Unable to find show.");
			}
		}
	}

	public void unpurge(String week) {
		for(ShowInWeek s: showInWeek)
		{
			if(s.getWeek() == week)
			{
				s.setPurge(false);
			} else {
				System.out.println("Unable to find show.");
			}
		}
	}

	public String RandomSuggestion() {
		int year = rand.nextInt((2022 - 2021) + 1) + 2021;
		int month = rand.nextInt((12 - 1) + 1) + 1;
		int day = rand.nextInt((31 - 1) + 1) + 1;

		String week = year + "-" + month + "-" + day;

		return week;
	}

	public void PredictiveSuggestion(String week) {
		int count = 0;
		for(int i = 0; i < 100; i++)
		{
			if(showInWeek[i].getWeek() == week)
			{
				count++;
			}
		}
		int random = rand.nextInt((1 - count) + 1) + 1;
		//TODO
	}

	public String toString() {
		String toReturn = null;
		for(int i = 0; i < size; i++)
		{
			toReturn += showInWeek[i] + "\n";
		}
		return toReturn;
	}

	private void readFile () {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
				String week = lineReader.readLine();
				String category = lineReader.readLine();
				String weeklyRank = lineReader.readLine();
				String showTitle = lineReader.readLine();
				String seasonTitle = lineReader.readLine();
				String weeklyHours = lineReader.readLine();
				String week10 = lineReader.readLine();

				addShow(new ShowInWeek(week, category, weeklyRank, showTitle, seasonTitle,Integer.parseInt(weeklyHours), Integer.parseInt(week10)));
			}
		} catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");
			try {
				lineReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName.substring(1))));
				String line = null;
				while ((line = lineReader.readLine())!=null) {
					String week = lineReader.readLine();
					String category = lineReader.readLine();
					String weeklyRank = lineReader.readLine();
					String showTitle = lineReader.readLine();
					String seasonTitle = lineReader.readLine();
					String weeklyHours = lineReader.readLine();
					String week10 = lineReader.readLine();
				}
			} catch (Exception e2) {
				System.err.println("there was a problem with the file reader, try again.  either no such file or format error");
			} finally {
				if (lineReader != null)
					try {
						lineReader.close();
					} catch (IOException e2) {
						System.err.println("could not close BufferedReader");
					}
			}			
		} finally {
			if (lineReader != null)
				try {
					lineReader.close();
				} catch (IOException e) {
					System.err.println("could not close BufferedReader");
				}
		}
	}

	public void writeFile () {
		// overloaded method: this calls doWrite with file used to read data
		// use this for saving data between runs
		doWrite(fileName);
	} // end of writeFile method

	public void writeFile(String altFileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		doWrite(altFileName);		
	}// end of writeFile method

	private void doWrite(String fn) {
		// this method writes all of the data in the persons array to a file
		try
		{

			FileWriter fw = new FileWriter(fn);
			BufferedWriter myOutfile = new BufferedWriter(fw);			

			for (int i = 0; i < size; i++) {
				ShowInWeek show = showInWeek[i];
				myOutfile.write (show.getWeek()+"\n");
				myOutfile.write (show.getCategory()+"\n");
				myOutfile.write (show.getWeeklyRank()+"\n");
				myOutfile.write (show.getSeasonTitle()+"\n");
				myOutfile.write (show.getWeeklyHours()+"\n");
				myOutfile.write (show.getWeeksInTop10()+"\n");
			}
			myOutfile.flush();
			myOutfile.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Didn't save to " + fn);
		}
	}	


}
