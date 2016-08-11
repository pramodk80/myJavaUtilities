package org.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class RatingCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputScoreOne [] = {"1001,505,7", "1001,502,7", "1001,503,7","2001,504,10","3001,505,5","2001,506,5"};
		
		String inputScoreTwo [] = {"1001,505,Seven", "1001,502,7", "1001,503,7","2001,504,10","3001,505,5","2001,506,5"};
		
		
		//Positive Tests
		//TEST 1
		System.out.println("Printing Positive test results One");
		processScore (inputScoreOne,new Integer(5));
//		
		//TEST 2
		System.out.println("Printing Positive test results Two");
		processScore (inputScoreOne,7);
		
		//TEST 3
		System.out.println("Printing Positive test results Three");
		processScore (inputScoreOne,10);
		
		// NEGATIVE TESTS
		System.out.println("Printing Negative test results One");
		processScore (inputScoreOne,0);
		
		
		System.out.println("Printing Negative test results Two");
		processScore (inputScoreOne,-1);
		
		
		System.out.println("Printing Negative test results Two");
		processScore (inputScoreTwo,-1);
		
	}
	
	
	/**
	 * @param scores
	 * @param score
	 */
	private static void processScore(String[] scores, Integer score) {
		Map <Integer, Set<String>> ratingMap = null;
		
		try {
			//ratingMap = getHotelRatingMap (scores);

			Set<String> results = new HashSet<String>();
			
			if(ratingMap.containsKey(score)) {
				results.addAll(ratingMap.get(score));
			}
			
			for(int i=0;i<=ratingMap.size();i++) {
				int key = ++score;
				if(ratingMap.containsKey(key)) {
					results.addAll(ratingMap.get(key));
					break;
				}
			}
			if(results.size()<=0) {
				System.out.println("No results found");
			}
			Iterator<String> itr = results.iterator();
			while(itr.hasNext()) {
				System.out.println("results are "+itr.next());
			}
			
		} catch(NumberFormatException nfe) {
			System.err.println("Could not format the score");
		}

	}
	

	/**
	 * @param scores
	 * @return
	 * @throws NumberFormatException
	 */
	private static Map <Integer, List<Integer>> getHotelRatingMap(String[] scores) throws NumberFormatException {
		Map <Integer, List<Integer>> ratingMap = new HashMap<Integer, List<Integer>>();
		/*List<Integer> ratings = null;
		int avgScore;
		Integer scoreVal;
		
		
			for (String string : scores) {
				int counter;
				String [] str = string.split(",");
				if(str[0]!=null ) {
					ratings = getRating(str[0], ratingMap);
					if(ratings!=null) {
						ratings.add(Integer.valueOf(Integer.parseInt(str[2]));
					} else {
						ratings = new ArrayList<Integer>();
						ratings.add(Integer.valueOf(Integer.parseInt(str[2])));
						ratingMap.put(str[0], ratings);
					}
				}
		}*/
		return ratingMap;
	}
	
	
	
	/**
	 * @param score
	 * @param ratingMap
	 * @return
	 */
	private static List<Integer> getRating(String hotelId, Map <Integer, List<Integer>> ratingMap) {
		return ratingMap.get(hotelId);
	}

}
