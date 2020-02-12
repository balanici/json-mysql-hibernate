package com.balanici.jsoncolumn;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsondocServiceImpl implements JsondocService {
    private final JsondocRepository jsondocRepository;

    public JsondocServiceImpl(JsondocRepository jsondocRepository) {
        this.jsondocRepository = jsondocRepository;
    }

    @Override
    public List<Jsondoc> findAll() {
        return jsondocRepository.findAll();
    }

    @Override
    public List<String> findAllNamesFromData() {
        return jsondocRepository.findAllNamesFromData();
    }
}
