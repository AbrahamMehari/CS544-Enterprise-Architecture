package edu.miu.cs.cs544.exercise15x.controller;

import edu.miu.cs.cs544.exercise15x.aspect.ExecutionTime;
import edu.miu.cs.cs544.exercise15x.domain.Actor;
import edu.miu.cs.cs544.exercise15x.domain.dto.ActorDto;
import edu.miu.cs.cs544.exercise15x.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/actors")
public class ActorController {

    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @ExecutionTime
    @GetMapping("/")
    public List<Actor> getAllActors() {
        return actorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Actor> findActorById(@PathVariable Long id) {
        return actorService.findActorById(id);
    }

    @ExecutionTime
    @GetMapping("/firstName/{firstName}")
    public Optional<Actor> findActorByFirstName(@PathVariable String firstName) {
        return actorService.findActorByFirstName(firstName);
    }

    @ExecutionTime
    @PutMapping()
    public void updateActor(@RequestBody ActorDto actorDto) {
        actorService.update(actorDto);
    }

}
