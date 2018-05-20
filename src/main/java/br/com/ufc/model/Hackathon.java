package br.com.ufc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Hackathon extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String nameEvent;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private String local;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;

    @NotNull
    private Integer numberParticipantsTeam;

    @NotNull
    private Integer  numberTeams;

    @Column
    private Boolean openSubscriptions;

    @JsonIgnore
    @OneToMany(mappedBy = "hackathon", cascade = CascadeType.REMOVE)
    private List<OrganizerHackathon>  organizerHackathonList;

    @JsonIgnore
    @OneToMany(mappedBy = "hackathon", cascade = CascadeType.REMOVE)
    private  List<Team> teamList;

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumberParticipantsTeam() {
        return numberParticipantsTeam;
    }

    public void setNumberParticipantsTeam(Integer numberParticipantsTeam) {
        this.numberParticipantsTeam = numberParticipantsTeam;
    }

    public Integer getNumberTeams() {
        return numberTeams;
    }

    public void setNumberTeams(Integer numberTeams) {
        this.numberTeams = numberTeams;
    }

    public List<OrganizerHackathon> getOrganizerHackathonList() {
        return organizerHackathonList;
    }

    public void setOrganizerHackathonList(List<OrganizerHackathon> organizerHackathonList) {
        this.organizerHackathonList = organizerHackathonList;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public Boolean getOpenSubscriptions() {
        return openSubscriptions;
    }

    public void setOpenSubscriptions(Boolean openSubscriptions) {
        this.openSubscriptions = openSubscriptions;
    }
}