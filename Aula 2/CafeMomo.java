import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CafeMomo{

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        
        List<Cafe> cafes = new ArrayList<>();

        for(int i= 0 ; i < 10 ; i++){
            cafes.add(new Cafe());
        }

        

        System.out.println("Bem vindo ao cafe Iandra LTDA.");
        cafe.prepararExpresso(false, false ,false);
        cafe.servirCafe();
        cafe.prepararLongo(true, true, true);
        cafe.servirCafe();
    }

}