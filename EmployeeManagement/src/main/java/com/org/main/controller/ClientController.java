
package com.org.main.controller;

import java.util.List;

import org.com.main.ResponseDTO.ClientResponseDTO;
import org.com.main.ResponseDTO.EmployeeResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.main.RequestDTO.ClientRequestDto;
import com.org.main.RequestDTO.EmployeeRequestDto;
import com.org.main.service.ClientService;
import com.org.main.service.EmployeeService;

@RestController
public class ClientController {

	@Autowired
	ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping(path = "/client")
	public ClientResponseDTO createClient(@RequestBody ClientRequestDto clientRequestDto)

	{
		ClientResponseDTO saveClient = clientService.createClient(clientRequestDto);

		return saveClient;

	}

	@GetMapping(path = "/clientName/{clientName}")
	public List<ClientResponseDTO> getClientByName(@PathVariable String clientName) {

		List<ClientResponseDTO> clientByName = clientService.getClientByName(clientName);
		return clientByName;

	}

	@GetMapping(path = "clientID/{clientID}")
	public ClientResponseDTO getClientById(@PathVariable int clientID) {
		ClientResponseDTO clientBasedOnId = clientService.getClientById(clientID);
		return clientBasedOnId;

	}

	@DeleteMapping(path = "/client/{clientID}")
	public ResponseEntity<ClientResponseDTO> deleteById(@PathVariable("clientID") int clientID) {

		ClientResponseDTO deleteClientById = clientService.deleteById(clientID);
		return ResponseEntity.ok().body(deleteClientById);
	}

	@PutMapping(path = "/client/{clientId}")
	public ResponseEntity<ClientResponseDTO> updateClient(@PathVariable("clientId") int clientId,
			@RequestBody ClientRequestDto requestDto) {
		ClientResponseDTO updateClient = clientService.updateEmployee(clientId, requestDto);
		return ResponseEntity.ok().body(updateClient);
	}

}
