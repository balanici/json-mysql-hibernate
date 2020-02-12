package com.balanici.jsoncolumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "jsondoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jsondoc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "data", nullable=false, columnDefinition = "JSON")
//    private String data;
    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> data;

    @Convert(converter = StringMapConverter.class)
    @Column(name = "some_attributes", columnDefinition = "JSON")
    private Map<String, String> someAttributes;
}
