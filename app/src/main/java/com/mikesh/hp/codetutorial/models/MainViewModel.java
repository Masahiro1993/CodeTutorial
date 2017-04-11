package com.mikesh.hp.codetutorial.models;

/**
 * Created by HP on 08-Apr-17.
 */

public class MainViewModel {

    private String course;
    private int gridimage;

    public String getCourses() {
        return course;
    }

    public void setCourses(String courses) {
        this.course = courses;
    }

    public int getGridimage() {
        return gridimage;
    }

    public void setGridimage(int gridimage) {
        this.gridimage = gridimage;
    }
}
