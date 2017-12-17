package model;

public class Model {
    private String superString;
    public Model(){
        superString = "";
    }

    public void add(String addtion){
        superString+= addtion;
    }

    public void remove(String removeStr){
        superString = superString.replace(removeStr,"");
    }

    public String getSuperString(){
        return this.superString;
    }
}
