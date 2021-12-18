import java.util.ArrayList;

public class Ort {
    public Ort(String name) {
        this.name = name;
        nachbar = new ArrayList<>();
    }

    private String name;
    private ArrayList<Ort> nachbar;

    public void addNachbar(Ort o){
        nachbar.add(o);


    }

    public boolean hasCircle(Ort o){
        boolean hilf = true;
       if(o.hatNachbar(o, o)){
           return hilf;
       }
       hasCircle(o.getNachbar());
       return false;
    }
    public boolean hatNachbar(Ort o, Ort d){
        boolean hilf = false;
        for(Ort ort: nachbar){
            if (o.equals(d)){ hilf = true;


            }
        }
return hilf;
    }
    public Ort getNachbar(){
        Ort hilf
                = null;
        for (Ort ort: nachbar){
             hilf = ort;

        }
        return hilf;


    }

}
