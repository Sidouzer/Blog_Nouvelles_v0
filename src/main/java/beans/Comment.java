/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.time.LocalDate;

/**
 *
 * @author stag
 */
public class Comment {
    private String title;
    private String content;
    private LocalDate created;
    private int status;
    private long id_person;
    private long id_story;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getId_person() {
        return id_person;
    }

    public void setId_person(long id_person) {
        this.id_person = id_person;
    }

    public long getId_story() {
        return id_story;
    }

    public void setId_story(long id_story) {
        this.id_story = id_story;
    }

    @Override
    public String toString() {
        return "Comment{" + "title=" + title + ", content=" + content + ", created=" + created + ", status=" + status + ", id_person=" + id_person + ", id_story=" + id_story + '}';
    }
}
