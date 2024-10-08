/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author stag
 */
public class Vote {
    private Long id_person;
    private Long id_story;
    private int quality;

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    public Long getId_story() {
        return id_story;
    }

    public void setId_story(Long id_story) {
        this.id_story = id_story;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Vote{" + "id_person=" + id_person + ", id_story=" + id_story + ", quality=" + quality + '}';
    }
    
}
