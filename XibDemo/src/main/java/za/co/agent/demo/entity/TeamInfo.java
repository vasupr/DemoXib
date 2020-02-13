package za.co.agent.demo.entity;

public class TeamInfo extends Agent {

	public TeamInfo() {
		/* A declared default constructor is required by spring boot */
	}
	
	public TeamInfo(String name, String phoneNumber) {
		super(name, phoneNumber);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AgentInfo " + super.toString() +"]";
	}

	public void createAgentEntry(TeamInfo agent) {
		// TODO Auto-generated method stub
		
	}

}
