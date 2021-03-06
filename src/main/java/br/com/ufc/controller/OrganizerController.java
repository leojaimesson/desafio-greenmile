package br.com.ufc.controller;

import br.com.ufc.model.Organizer;
import br.com.ufc.service.HackathonService;
import br.com.ufc.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("organizers")
public class OrganizerController {
    @Autowired
    OrganizerService organizerService;

    @Autowired
    HackathonService hackathonService;

    @PostMapping("/sign-up")
    public ResponseEntity<Organizer> saveOrganizer(@Valid @RequestBody Organizer organizer) {
        return  new ResponseEntity<>(organizerService.saveOrganizer(organizer), HttpStatus.OK);
    }
}
