package za.co.agent.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import za.co.agent.demo.entity.TeamInfo;
import za.co.agent.demo.repository.AgentRepository;
import za.co.agent.demo.repository.TeamRepository;

/**
 * @author Vasu
 *
 */
@Component
public class TeamService {
	
	@Autowired
	private TeamRepository repository;
	
	@Autowired
	private AgentRepository agentRepository;
	
	List<TeamInfo> teamList=new ArrayList();;
	
	/**
	 * default constructor
	 */
	public TeamService() {
		/* A declared default constructor is required by spring boot */
	}
	
	public TeamInfo createTeam(TeamInfo info) {
		
		TeamInfo teamInfo=null;
		Iterator  it1=teamList.iterator();
		while(it1.hasNext()){
			teamInfo=(TeamInfo) it1.next();
			if(teamInfo.getName().equalsIgnoreCase(info.getName())){
				System.out.println("Name alredy exists");
				info.setId("can't create, team-name already exists.");
				return info;
			}
		}
		info.setId(UUID.randomUUID()+"");
		teamList.add(info);
		System.out.println("Created a team: "+teamList.toString());
		return info;//agentList.toString();
		
		/*
		 *IF YOUR MONGO DB DOESN'T WANT TO START YOU CAN USE ABOVE ARRAY LIST TO TEST
		AgentInfo e=agentRepository.findByPhoneNumber(info.getPhoneNumber());
		if(e==null) {
			e=agentRepository.insert(info);
			System.out.println("INSERTED "+e.getId());
		}else {
			System.out.println("Alredy exists TRUE");
			return "Alredy exists";
		}
		return e.getId();*/		
	}
	
	public List<TeamInfo> listAll() {
		return teamList;
	}
	
	public TeamInfo getTeam(String id) {
		
		/*AgentInfo agentInfo = (AgentInfo) agentRepository.findOne(id);
		if (agentInfo == null) {
			try {
				throw new Exception("The agent-id (" + id + ") was not found.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return agentInfo;*/
		
		//agentInfo
		TeamInfo teamInfo=null;
		Iterator  it1=teamList.iterator();
		while(it1.hasNext()){
			teamInfo=(TeamInfo) it1.next();
			if(teamInfo.getId().equalsIgnoreCase(id)){
				return teamInfo;
			}
		}
		return null;
		
		
	}
	/////////////////////////////////////////AGENT//////////////////////////////
		

	

	
	

	
}
