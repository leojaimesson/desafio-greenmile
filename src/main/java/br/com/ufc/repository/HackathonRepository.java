package br.com.ufc.repository;

import br.com.ufc.model.Hackathon;
import br.com.ufc.repository.query.HackathonRepositoryQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HackathonRepository extends HackathonRepositoryQuery {
}
