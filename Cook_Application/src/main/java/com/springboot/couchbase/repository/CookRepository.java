package com.springboot.couchbase.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.couchbase.entity.Cook;

//couchbase annotations
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "cook")
//spring annotation
@Repository
public interface CookRepository extends CrudRepository<Cook, String> {

	List<Cook> findAllByEmail(String email);
}
