package de.luca.db.model;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TodoStatus {
    UNCHECKED,
    CHECKED
}
