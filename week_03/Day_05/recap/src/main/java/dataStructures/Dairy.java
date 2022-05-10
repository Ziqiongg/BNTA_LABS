package dataStructures;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Dairy {

    private List tasks;

    public Dairy(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(String.valueOf(task));
    }

    public Task getNextTask(){
        Task foundTask = this.tasks.get(0);
        this.tasks.remove(0);
    }


}
