package za.co.agent.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import za.co.agent.demo.entity.AgentInfo;
import za.co.agent.demo.repository.AgentRepository;
import za.co.agent.demo.repository.TeamRepository;

/**
 * @author Vasu
 *
 */
@Component
public class AgentService {
	
	@Autowired
	private TeamRepository repository;
	
	@Autowired
	private AgentRepository agentRepository;
	
	List<AgentInfo> agentList=new ArrayList();;
	
	/**
	 * default constructor
	 */
	public AgentService() {
		/* A declared default constructor is required by spring boot */
	}
	
	public AgentInfo createAgentEntry(AgentInfo info) {
		
		AgentInfo agentInfo=null;
		Iterator  it1=agentList.iterator();
		while(it1.hasNext()){
			agentInfo=(AgentInfo) it1.next();
			if(agentInfo.getName().equalsIgnoreCase(info.getName())){
				System.out.println("Name alredy exists");
				info.setId("can't create, name already exists.");
				return null;
			}
		}
		
		info.setId(UUID.randomUUID()+"");
		agentList.add(info);
		System.out.println("Created an agent: "+agentList.toString());
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
	
	public List<AgentInfo> listAll() {
		return agentList;
	}
	
	public AgentInfo getAgent(String id) {
		
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
		AgentInfo agentInfo=null;
		Iterator  it1=agentList.iterator();
		while(it1.hasNext()){
			agentInfo=(AgentInfo) it1.next();
			if(agentInfo.getId().equalsIgnoreCase(id)){
				return agentInfo;
			}
		}
		return null;
		
		
	}
	/////////////////////////////////////////AGENT//////////////////////////////
	
	
	


	

	
	

	
}
