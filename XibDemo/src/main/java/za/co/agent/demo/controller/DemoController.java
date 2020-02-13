
package za.co.agent.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import za.co.agent.demo.entity.AgentInfo;
import za.co.agent.demo.entity.TeamInfo;
import za.co.agent.demo.service.AgentService;
import za.co.agent.demo.service.TeamService;

/**
 * @author Vasu
 *
 */
@Controller
@RequestMapping("/demo/v1")
public class DemoController {
	
	@Autowired
	private AgentService agentService;
	
	@Autowired
	private TeamService teamService;

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/agent",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AgentInfo createAgent(@RequestBody AgentInfo agent) {
		System.out.println("agent-name "+agent.getName()+", phone number "+agent.getPhoneNumber());
		agentService.createAgentEntry(agent);
		return agent;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/agents",method = RequestMethod.GET)
	@ResponseBody
	public List<AgentInfo> getAll() {
		return agentService.listAll();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/agent/{id}",method = RequestMethod.GET)
	@ResponseBody
	public AgentInfo getAgent(@PathVariable("id") String id) {
		
		return agentService.getAgent(id);
	}
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/team",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public TeamInfo createTeam(@RequestBody TeamInfo info) {
		teamService.createTeam(info);
		return info;
	}
	 
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/teams",method = RequestMethod.GET)
	@ResponseBody
	public List<TeamInfo> getAllTeams() {
		return teamService.listAll();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/team/{id}",method = RequestMethod.GET)
	@ResponseBody
	public TeamInfo getTeam(@PathVariable("id") String id) {
		
		return teamService.getTeam(id);
	}
	
	
}
