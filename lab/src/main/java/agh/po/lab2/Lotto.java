package agh.po.lab2;
import java.util.ArrayList;
public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i=0; i<7; i++)
        {
            int randomNum = (int)(Math.random() * 49);
            boolean jest = lista.contains(randomNum);
            while(jest==true)
            {
                randomNum = (int)(Math.random() * 49);
                jest = lista.contains(randomNum);
            }
            lista.add(randomNum);
        }
            System.out.println(lista);

    }

}

