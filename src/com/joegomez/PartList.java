package com.joegomez;

import java.util.ArrayList;

/**
 * Created by joeandrewgomez on 10/18/17.
 */
public class PartList {
    private ArrayList<String> partList = new ArrayList<>();
    public ArrayList<String> getPartList(){return partList;}
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
        partList.set(position, newItem);
        System.out.println();
    }
    public void removeComputerPart(String item){

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

