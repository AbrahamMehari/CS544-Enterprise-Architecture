package edu.miu.cs.cs544.exercise15x.repository;

import edu.miu.cs.cs544.exercise15x.domain.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActorRepo extends CrudRepository<Actor, Long> {

    List<Actor> findAll();

    Optional<Actor> findActorById(long id);

    Optional<Actor> findActorByFirstName(String firstName);

}