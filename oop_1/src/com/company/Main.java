package com.company;
import java.util.Random;
import java.util.ArrayList;



class Button {
    private String ID;
    private boolean pressed;

    public Button(String ID, boolean pressed){
        this.ID=ID;
        this.pressed=pressed;
    }

    public String getID(){
        return ID;
    }
    public void setState(boolean pressed){
        this.pressed=pressed;
    }
    public boolean getState(){
        return pressed;
    }


}
class Controller{
    private ArrayList <Button> buttons;
    public void addButton(Button b){
        buttons.add(b);
    }

    public Controller(){
        buttons=new ArrayList<Button>();
    }
    public void pressAll(){
        for( int i = 0; i < buttons.size(); i++ )
        {
            buttons.get(i).setState(true);
    }
    }

    public void releaseAll(){
        for( int i = 0; i < buttons.size(); i++ )
        {
            buttons.get(i).setState(false);
        }
    }

    public int getNumOfPressedBtns (){
        int pressedbuttons=0;
        for( int i = 0; i < buttons.size(); i++ )
        {
            if(buttons.get(i).getState()){
                pressedbuttons++;
            }
        }
        return pressedbuttons;
    }

    }



public class Main {

    public static void main(String[] args) {
        Controller ctrl = new Controller();
        Button a=new Button("A",true);
        ctrl.addButton(a);
        Button b=new Button("B",false);
        ctrl.addButton(b);
        Button x=new Button("X",false);
        ctrl.addButton(x);
        Button y=new Button("Y",true);
        ctrl.addButton(y);
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
        ctrl.pressAll();
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
        ctrl.releaseAll();;
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());


    }
}