package br.com.ufc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
public class Organizer extends User{

    @JsonIgnore
    @JoinTable(name = "organizer_hackathon", joinColumns = @JoinColumn(name = "organizer_id"), inverseJoinColumns = @JoinColumn(name = "hackathon_id"))
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Hackathon> hackathons;

    public Organizer() {
    }

    public List<Hackathon> getHackathons() {
        return hackathons;
    }

    public void setHackathons(List<Hackathon> hackathons) {
        this.hackathons = hackathons;
    }
}
