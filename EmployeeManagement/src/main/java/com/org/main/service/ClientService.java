package com.org.main.service;

import java.util.List;

import org.com.main.ResponseDTO.ClientResponseDTO;
import org.com.main.ResponseDTO.EmployeeResponseDto;

import com.org.main.RequestDTO.ClientRequestDto;

public interface ClientService {

	ClientResponseDTO createClient(ClientRequestDto clientRequestDto);

	List<ClientResponseDTO> getClientByName(String clientName);

	ClientResponseDTO getClientById(int clientID);

	ClientResponseDTO deleteById(int clientID);

	ClientResponseDTO updateEmployee(int clientId, ClientRequestDto requestDto);


}
