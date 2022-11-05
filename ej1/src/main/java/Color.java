import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Color extends ObjetoJuego{
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void mostrate (){
        System.out.println(this.color);
    }
}
