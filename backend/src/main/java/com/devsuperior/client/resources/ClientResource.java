package com.devsuperior.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		java.util.List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Joao", "99839210811", 500.0, null, 2));
		list.add(new Client(2L, "Maria", "98739229819", 800.0, null, 3));
		return ResponseEntity.ok().body(list);
	}

}