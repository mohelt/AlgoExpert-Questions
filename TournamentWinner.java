/*
There's an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as possible. Teams compete in a round robin, where each team faces off against all other teams. Only two teams compete against each other at a time, and for each competition, one team is designated the home team, while the other team is the away team. In each competition there's always one winner and one loser; there are no ties. A team receives 3 points if it wins and 0 points if it loses. The winner of the tournament is the team that receives the most amount of points. 
Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition, write a function that returns the winner of the tournament. The input arrays are named competitions and results , respectively. The competitions array has elements in the form of [homeTeam, awayTeam] , where each team is a string of at most 30 characters representing the name of the team. The results array contains information about the winner of each corresponding competition in the competitions array. Specifically, results [i ] denotes the winner 
of competitions [i ] where a 1 in the results array means that the home team in the 
corresponding competition won and a o means that the away team won. 
It's guaranteed that exactly one team will win the tournament and that each team will compete against all other teams exactly once. It's also guaranteed that the tournament will always have at least two teams. 
*/
import java.util.*;
/*
There's an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as possible. Teams compete in a round robin, where each team faces off against all other teams. Only two teams compete against each other at a time, and for each competition, one team is designated the home team, while the other team is the away team. In each competition there's always one winner and one loser; there are no ties. A team receives 3 points if it wins and 0 points if it loses. The winner of the tournament is the team that receives the most amount of points. 
Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition, write a function that returns the winner of the tournament. The input arrays are named competitions and results , respectively. The competitions array has elements in the form of [homeTeam, awayTeam] , where each team is a string of at most 30 characters representing the name of the team. The results array contains information about the winner of each corresponding competition in the competitions array. Specifically, results [i ] denotes the winner 
of competitions [i ] where a 1 in the results array means that the home team in the 
corresponding competition won and a o means that the away team won. 
It's guaranteed that exactly one team will win the tournament and that each team will compete against all other teams exactly once. It's also guaranteed that the tournament will always have at least two teams. 
*/
//useful hashmap functions
//containsKey
//containsValue
//put
//remove
//get
//getKey
//Map.Entry
//Map.entrySet( )
class Program {

    public String tournamentWinner(
        ArrayList < ArrayList < String >> competitions, ArrayList < Integer > results) {
        HashMap < String, Integer > map = new HashMap < > ();
        for (int i = 0; i < competitions.size(); i++) {
            for (int j = 0; j < competitions.get(i).size();j++) {
                if (!map.containsKey(competitions.get(i).get(j))) {
                    map.put(competitions.get(i).get(j), 0);
                }
            }
        }

        int[] points = new int[map.size()];
        for (int x = 0; x < competitions.size(); x++) {
            if (results.get(x) == 1) {
                map.put(competitions.get(x).get(0), map.get(competitions.get(x).get(0)) + 3);
            } else {
                map.put(competitions.get(x).get(1), map.get(competitions.get(x).get(1)) + 3);
            }
        }
        int maxValueInMap = (Collections.max(map.values()));
        // Iterate through HashMap
       Map.Entry<String, Integer> entryReturn = Map.entry("foo", 1);
        for (Map.Entry <String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
              return entry.getKey();
            }else{
            }
        }
      return entryReturn.getKey();
    }
}