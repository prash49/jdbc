package CRUDOperations.service;

import CRUDOperations.dto.OwnerDTO;
import CRUDOperations.exception.DuplicateOwnerException;
import CRUDOperations.exception.OwnerNotFoundException;

import java.time.LocalDate;
import java.util.List;



/**
 * @author abhishekvermaa10
 *
 */
public interface OwnerService {
	void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException;

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findAllOwners();
	
	List<OwnerDTO> findOwner(String ownerEmailId, LocalDate petBirthDate);
}