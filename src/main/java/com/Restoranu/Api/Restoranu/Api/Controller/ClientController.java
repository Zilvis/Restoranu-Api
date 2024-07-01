package com.Restoranu.Api.Restoranu.Api.Controller;


import com.Restoranu.Api.Restoranu.Api.Entity.ClientsEntity;
import com.Restoranu.Api.Restoranu.Api.Service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api/clients")
public class ClientController {

	@Autowired
	private ClientService ClientService;

	@PostMapping("/create")
	public ClientsEntity create(@RequestBody ClientsEntity client){
		return ClientService.create(client);
	}
}
