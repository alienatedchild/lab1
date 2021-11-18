import jade.core.Agent;
import jade.core.AID;

//CREATING JADE AGENTS � THE AGENT CLASS

public class FrstAgent1 extends Agent {

	private String targetBookTitle;

	private AID[] sellerAgents = {new AID("seller1", AID.ISLOCALNAME),
	new AID("seller2", AID.ISLOCALNAME)}; 

	protected void setup() {

		System.out.println("Hello! Buyer-agent "+getAID().getName()+" is ready.");
		

		Object[] args = getArguments();
		if (args != null && args.length > 0) {
			targetBookTitle = (String) args[0];
			System.out.println("Trying to buy "+targetBookTitle);
		}
		else {

			System.out.println("No book title specified");
			doDelete();
		}
	}

	protected void takeDown() {

	System.out.println("Buyer-agent "+getAID().getName()+" terminating.");
	}	
} 