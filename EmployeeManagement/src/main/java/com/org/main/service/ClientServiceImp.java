package com.org.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.com.main.ResponseDTO.ClientResponseDTO;
import org.com.main.ResponseDTO.EmployeeResponseDto;
import org.com.main.ResponseDTO.ProjectManagerResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.main.Entity.ClientMasterEntity;
import com.org.main.Entity.EmployeeMasterEntity;
import com.org.main.Entity.ProjectManagerEntity;
import com.org.main.Repository.ClientRepository;
import com.org.main.RequestDTO.ClientRequestDto;

@Service()
public class ClientServiceImp implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	ClientService clientService;
	
	ClientResponseDTO clientResponseDTO= new ClientResponseDTO();

	@Override
	public ClientResponseDTO createClient(ClientRequestDto clientRequestDto) {
		
		ClientMasterEntity newClientMasterEntity = new ClientMasterEntity();
		
		newClientMasterEntity.setClientName(clientRequestDto.getClientName());
		newClientMasterEntity.setClientCountry(clientRequestDto.getClientCountry());
		newClientMasterEntity.setRemarks(clientRequestDto.getRemarks());
		
		ClientMasterEntity saveClient = 	clientRepository.save(newClientMasterEntity);
		
		clientResponseDTO.setClientName(saveClient.getClientName());
		clientResponseDTO.setClientCountry(saveClient.getClientCountry());
		clientResponseDTO.setRemarks(saveClient.getRemarks());
		return clientResponseDTO;
		
		
	}

	@Override
	public List<ClientResponseDTO> getClientByName(String clientName) {
		 List<ClientResponseDTO> listClientResponseDTo = new ArrayList<ClientResponseDTO>();
		 List<ClientMasterEntity> searchByClient = clientRepository.findByClientName(clientName);
		 for(ClientMasterEntity clientMaster : searchByClient)
		 {
			 clientResponseDTO = new ClientResponseDTO();
			 clientResponseDTO.setClientName(clientMaster.getClientName());
			 clientResponseDTO.setClientCountry(clientMaster.getClientCountry());
			 clientResponseDTO.setRemarks(clientMaster.getRemarks());
			 listClientResponseDTo.add(clientResponseDTO);
		 }
		return listClientResponseDTo;
	}

	@Override
	public ClientResponseDTO getClientById(int clientId) {
		clientResponseDTO = new ClientResponseDTO();
		ClientMasterEntity searchByClientId = clientRepository.findByClientId(clientId);
		if(searchByClientId.getClientID()== clientId)
		{
			clientResponseDTO.setClientName(searchByClientId.getClientName());
			clientResponseDTO.setClientID(searchByClientId.getClientID());
			clientResponseDTO.setClientCountry(searchByClientId.getClientCountry());
			clientResponseDTO.setRemarks(searchByClientId.getRemarks());
		}
		else
		{
			System.out.println("Client Not FOunt");
		}
		
		return clientResponseDTO;
	}

	@Override
	public ClientResponseDTO deleteById(int clientID) {
Optional<ClientMasterEntity> searchClientById = clientRepository.deleteByClientId(clientID);
		
		if (searchClientById.isEmpty()) {
			System.out.println("Client not found");
		} else {
			ClientMasterEntity valuesfromoptional = searchClientById.get();
			clientResponseDTO = new ClientResponseDTO();
			
			clientResponseDTO.setClientName(valuesfromoptional.getClientName());
			clientResponseDTO.setClientID(valuesfromoptional.getClientID());
			clientResponseDTO.setClientCountry(valuesfromoptional.getClientCountry());
			clientResponseDTO.setRemarks(valuesfromoptional.getRemarks());
			return clientResponseDTO;
		}
		return clientResponseDTO;
	}

	@Override
	public ClientResponseDTO updateEmployee(int clientId, ClientRequestDto requestDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
