package com.lhq.postmanagementservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lhq.postmanagementservice.config.HouseClientConfig;
import com.lhq.postmanagementservice.model.Post;
import com.lhq.postmanagementservice.model.PostCata;

@FeignClient(name="house-service", url="localhost:8003", configuration = HouseClientConfig.class)
public interface HomeServiceProxy {
	
	@GetMapping("/api/house/{id}")
	public Post getHouse(@PathVariable("id") long id);
	
	@GetMapping("/api/house")
	public List<PostCata> getallHouse();
	
	@PostMapping("/api/house/")
	Post addHouse(@RequestBody Post house);
}