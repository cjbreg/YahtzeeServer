package nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared;


import org.apache.tomcat.util.buf.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Greeting {
    private String name;
    private String message;
    private String time;

    public Greeting() {
    }

    public Greeting(String name, String message) {
        this.name = name;
        this.message = message;
        this.time = new SimpleDateFormat("HH:mm").format(new Date());;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTime(){
        return time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(String time){
        this.time = time;
    }
}
