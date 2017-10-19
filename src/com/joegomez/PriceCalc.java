package com.joegomez;

import java.util.ArrayList;

/**
 * Created by joeandrewgomez on 10/19/17.
 */
public class PriceCalc extends PartList {
    private ArrayList<Integer> priceCalc = new ArrayList<>();
    public ArrayList<Integer> getPriceCalc(){return priceCalc;}
    public void addPriceCalcIndex(Integer item){ priceCalc.add(item);}
    public void printPriceCalc(){
        System.out.println(priceCalc.size());
    }
    public void modCalculator(int anotherPosition, int anotherItemCounter){

        System.out.println("Boom!");

        priceCalc.set(anotherPosition, anotherItemCounter );

    }

}
