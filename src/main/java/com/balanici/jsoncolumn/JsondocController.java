package com.balanici.jsoncolumn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jsondoc")
public class JsondocController {

    private final JsondocService jsondocService;

    public JsondocController(JsondocService jsondocService) {
        this.jsondocService = jsondocService;
    }

    @GetMapping
    public ResponseEntity<List<Jsondoc>> getAll() {
        List<Jsondoc> response = jsondocService.findAll();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
