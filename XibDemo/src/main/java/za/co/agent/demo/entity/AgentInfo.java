package za.co.agent.demo.entity;

public class AgentInfo extends Agent {

	public AgentInfo() {
		/* A declared default constructor is required by spring boot */
	}
	
	public AgentInfo(String name, String phoneNumber) {
		super(name, phoneNumber);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AgentInfo " + super.toString() +"]";
	}

	public void createAgentEntry(AgentInfo agent) {
		// TODO Auto-generated method stub
		
	}

}
