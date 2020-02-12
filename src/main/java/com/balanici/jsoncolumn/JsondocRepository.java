package com.balanici.jsoncolumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsondocRepository extends JpaRepository<Jsondoc, Long> {
}
