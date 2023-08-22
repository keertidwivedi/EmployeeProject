package com.org.main.Repository;

import java.util.List;
import java.util.Optional;

import org.com.main.ResponseDTO.ClientResponseDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.main.Entity.ClientMasterEntity;
import com.org.main.Entity.ProjectManagerEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientMasterEntity, Integer> {

	List<ClientMasterEntity> findByClientName(String clientName);

	ClientMasterEntity findByClientId(int clientId);

	Optional<ClientMasterEntity> deleteByClientId(int clientID);


	
	


}
