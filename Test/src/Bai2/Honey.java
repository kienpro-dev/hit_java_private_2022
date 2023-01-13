package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Honey extends Person {
    private String id;
    private boolean status;
    private List<Favorite> listF = new ArrayList<>();
    
    public Honey() {
    
    }

    public Honey(String name, int age, String gender, String phone, String id, boolean status, List<Favorite> listF) {
        super(name, age, gender, phone);
        this.id = id;
        this.status = status;
        this.listF = listF;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Favorite> getListF() {
        return listF;
    }

    public void setListF(List<Favorite> listF) {
        this.listF = listF;
    }

    @Override
    public String toString() {
        return "Honey [id=" + id + ", status=" + status + ", listF=" + listF + "]";
    }

    
}
