/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import interfaces.Identifiable;
import java.time.LocalDate;

/**
 *
 * @author stag
 */
public class Story implements Identifiable {
    private Long id;
    private String title;
    private String content;
    private LocalDate created;
    private Long id_person;

    public Long getId() {
        return id;
    }

    public void setId(Long id_story) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    @Override
    public String toString() {
        return "Story{" + "id_story=" + id + ", title=" + title + ", content=" + content + ", created=" + created + ", id_person=" + id_person + '}';
    }
}
