package com.pegasus.arithmeticoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pegasus.arithmeticoperation.model.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {

}
