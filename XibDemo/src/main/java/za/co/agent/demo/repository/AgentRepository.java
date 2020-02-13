/**
 * 
 */
package za.co.agent.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import za.co.agent.demo.entity.Agent;
import za.co.agent.demo.entity.AgentInfo;

/**
 * @author Vasu
 *
 */
public interface AgentRepository extends MongoRepository<Agent, String> {
	
	public AgentInfo findByPhoneNumber(String phoneNumber);
	public AgentInfo findByName(String name);
	
	public List<AgentInfo> findAllByPhoneNumber(String phoneNumber);
}
