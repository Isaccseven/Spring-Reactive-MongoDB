package de.luca.db.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Document(collation = "tutorial")
public class Todo {

    @Id
    private String id;

    private String name;

    private String description;

    private TodoStatus status;

}
