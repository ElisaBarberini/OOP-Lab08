package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {
    private String nextString;
    private List<String> history = new ArrayList<>();
   /*
    * setNextStringToPrint , è un metodo che serve per settare il campo nextString con la stringa passata per argomento
    * questo metodo @return void , ovvero nulla
    */
    public void setnextStringToPrint(final String nextString) {
        this.nextString = nextString;
        this.history.add(nextString);
    }
    public String getnextStringToPrint() {
        return this.nextString;
    }
    public List<String> getHistory() {
        return this.history;
    }
    public final String printCurrentString(){
        if (this.nextString == null) {
            throw new IllegalStateException("Error!!");
        }
        System.out.println(" " + this.nextString);
        return this.nextString;
    }
    }

