/**
 * 
 */
package za.co.agent.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import za.co.agent.demo.entity.Team;
import za.co.agent.demo.entity.TeamInfo;

/**
 * @author Vasu
 *
 */
public interface TeamRepository extends MongoRepository<Team, String> {
	
	public TeamInfo findByPhoneNumber(String phoneNumber);
	
	public List<TeamInfo> findAllByPhoneNumber(String phoneNumber);
}
