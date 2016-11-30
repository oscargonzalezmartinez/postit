package org.ogm.postit.api.rest;

import java.util.List;

import org.ogm.postit.api.model.Postit;
import org.ogm.postit.api.repo.PostitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostitRest {
	@Autowired
	private PostitRepository postitRepository = null;
	
	@RequestMapping("/postit/{postitId}")
	public Postit get(@PathVariable("postitId") Long postitId){
		return postitRepository.findOne(postitId);
	}
	
	@RequestMapping("/postit/user/{userId}")
	public List<Postit> find(@PathVariable("userId") Long userId){
		return postitRepository.findByUserId(userId);
	}
}
