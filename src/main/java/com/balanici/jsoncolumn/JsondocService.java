package com.balanici.jsoncolumn;

import java.util.List;

public interface JsondocService {

    List<Jsondoc> findAll();

    Jsondoc findByName(String name);
}
