package com.balanici.jsoncolumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JsondocRepository extends JpaRepository<Jsondoc, Long> {

    @Query(value = "SELECT data->>'$.name' FROM jsondoc", nativeQuery = true)
    List<String> findAllNamesFromData();
}
