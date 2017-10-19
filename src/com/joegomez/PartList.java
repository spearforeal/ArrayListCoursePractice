package com.joegomez;

import java.util.ArrayList;

/**
 * Created by joeandrewgomez on 10/18/17.
 */
public class PartList {

    private ArrayList<String> partList = new ArrayList<>();
    public ArrayList<String> getPartList(){return partList;}
    public PriceCalc priceCalc = new PriceCalc();
    public void addComputerPart(String item){
        partList.add(item);
    }
    public void printPartList(){
        System.out.println("You have " + partList.size() + " items in your cart.");
        for(int i=0; i<partList.size(); i++){

        }

    }
    public void modifyComputerPart(String currentItem, String newItem){
        int position = findPart(currentItem);
        if(position >= 0){
            modifyComputerPart(position, newItem);
        }
    }
    private void modifyComputerPart(int position, String newItem){
        int anotherPosition = position;
        partList.set(position, newItem);
        int anotherCounterItem = Integer.parseInt(newItem);
        priceCalc.modCalculator(anotherPosition, anotherCounterItem);
        System.out.println("Part item " + (position+1) + " has been modified");
    }
    public void removeComputerPart(String item) {
        int position = findPart(item);
        if (position >= 0) {
            removeComputerPart(position);
        }
    }

    private void removeComputerPart(int position){
        partList.remove(position);
    }
    private int findPart(String searchItem){return partList.indexOf(searchItem);}
    private boolean onFile(String searchItem){
        int position = findPart(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}

