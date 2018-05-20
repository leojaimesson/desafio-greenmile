package br.com.ufc.service.impl;

import br.com.ufc.model.Paper;
import br.com.ufc.model.Participant;
import br.com.ufc.repository.ParticipantRepository;
import br.com.ufc.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;

    @Override
    public Participant save(Participant participant) {
        participant.addPaper(Paper.PARTICIPANT);
        participant.setPassword(new BCryptPasswordEncoder().encode(participant.getPassword()));
        return participantRepository.save(participant);
    }
}