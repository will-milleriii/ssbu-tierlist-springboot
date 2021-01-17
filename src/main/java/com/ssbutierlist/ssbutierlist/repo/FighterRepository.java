package com.ssbutierlist.ssbutierlist.repo;

import com.ssbutierlist.ssbutierlist.model.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {

    @Query("SELECT f FROM Fighter f WHERE f.name = '*'")
    Optional<Fighter> findFighterByName(String tier);

}
