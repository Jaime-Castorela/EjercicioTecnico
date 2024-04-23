package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadanoRepository extends JpaRepositoryImplementation<Ciudadano, Integer> {

	@Modifying
	@Query(value="delete from ciudadanos where id = :id", nativeQuery = true)
	void getByidfirmante(@Param("id")Integer id);
}
