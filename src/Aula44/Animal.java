package Aula44;

public abstract class Animal {

    private String name;

    public abstract void emitirSom();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
