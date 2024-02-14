package com.aws.codewhsiperdemo.lambda;

// java aws lambda for CricketWinner
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CricketWinner implements RequestHandler<InnerCricketWinner, String> {

	@Override
	public String handleRequest(InnerCricketWinner input, Context context) {
		context.getLogger().log("Input: " + input);
		if(input.teamA().equalsIgnoreCase("Ind") || input.teamA().equalsIgnoreCase("India") || input.teamB().equalsIgnoreCase("Ind") || input.teamB().equalsIgnoreCase("India")){
            
            // generate random number between 1 to 100
            int runs = (int) (Math.random() * 101);
            // generate random number between 1 to 9 
            int wickets = (int) (Math.random() * 10);

            return "India Won by "+ runs +" runs and "+ wickets + " wickets";

        } else {
            // generate random number between 1 to 30
            int runs = (int) (Math.random() * 31);
            // generate random number between 1 and 2 
            int team = (int) (Math.random() * 3); 

            if(team == 1){
                return input.teamA() + " Won by "+ runs +" runs";
            } else {
                return input.teamB() + " Won by "+ runs +" runs";
            }
        }
        
	}
} 

/**
 * InnerCricketWinner
 */
record InnerCricketWinner(String teamA, String teamB) {
}

/* 
{
    "teamA": "India",
    "teamB": "NZ"   
}
{
    "teamA": "Aus",
    "teamB": "NZ"   
}
*/