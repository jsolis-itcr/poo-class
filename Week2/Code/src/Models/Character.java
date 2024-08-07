package Models;

import Models.Enums.Gender;
import Models.Enums.Status;

import java.util.ArrayList;

public class Character {
    private int id;
    private String name;
    private Status status;
    private Gender gender;
    private ArrayList<String> episode;

    public Character(int id, String name, Status status, Gender gender, ArrayList<String> episode) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.episode = episode;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Status getStatus() {
        return this.status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Gender getGender() {
        return this.gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<String> getEpisode() {
        return episode;
    }

    public void setEpisode(ArrayList<String> episode) {
        this.episode = episode;
    }
    public void addEpisode(String episode) {
        this.episode.add(episode);
    }
}