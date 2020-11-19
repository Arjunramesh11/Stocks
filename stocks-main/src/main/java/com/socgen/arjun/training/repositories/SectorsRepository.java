package com.socgen.arjun.training.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.arjun.training.entities.Sectors;

@Repository
public interface SectorsRepository extends CrudRepository<Sectors, Integer> {
	
	@Query(nativeQuery=true,value="select * from Sectors")List<Sectors> searchSectors();

}
