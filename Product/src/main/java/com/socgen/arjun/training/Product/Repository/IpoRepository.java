package com.socgen.arjun.training.Product.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.arjun.training.Product.Entity.Ipo;


@Repository
public interface IpoRepository extends CrudRepository<Ipo, Integer>{
	
	@Query(nativeQuery=true,value="select * from ipo where ipo_id=1")List<Ipo> searchById();
	
	@Query(nativeQuery=true,value="select * from ipo")List<Ipo> searchIpos();
	

}
