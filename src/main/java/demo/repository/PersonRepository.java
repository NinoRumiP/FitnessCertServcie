package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.FCenter;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<FCenter, Long> {
	List<FCenter> findByName(@Param("name") String name);
	List<FCenter> findByLocation(@Param("location") String location);
	List<FCenter> findByNameContainingIgnoreCase(@Param("name") String name);
	List<FCenter> findByLocationContainingIgnoreCase(@Param("location") String location);
}
