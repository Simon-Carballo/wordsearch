import greenfoot.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Actor
{
    GreenfootImage imgSelected;
    GreenfootImage imgNormal;
    int fontsize = 50; // change as desired
    Color fontColor = Color.BLACK; // change as desired
    Color bgColor = new Color(0, 0, 0, 0); // transparent background
    char letter;
    boolean letterSelected=false;
    public Letter (){
        imgNormal= new GreenfootImage("letter-plain.png");
        imgSelected= new GreenfootImage("letter-selected.png");
        setImage(imgNormal);
    }

    public Letter (char l){
        letter=l;
        imgNormal= new GreenfootImage("letter-plain.png");
        imgSelected= new GreenfootImage("letter-selected.png");
        GreenfootImage txtImg = new GreenfootImage(Character.toString(l), fontsize, fontColor, bgColor);
        imgNormal.drawImage(txtImg, 10, 5); 
        imgSelected.drawImage(txtImg, 10, 5); 
        //imgNormal.drawString(L,imgNormal.getWidth()/2,imgNormal.getHeight()/2);
        //imgSelected= new GreenfootImage("letter-selected.png");
        //imgSelected.drawString(Character.toString(l),imgSelected.getWidth()/2,imgSelected.getHeight()/2);
        setImage(imgNormal);
    }
    /**
     * Act - do whatever the Letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int x = 0;
    public int y = 0;
    public int lastx;
    public int lasty;
    public int newx;
    public int newy;
    public int threshold;
    public int click;
    public int combx;
    public int comby;
ArrayList<String> current = new ArrayList<String>();

    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        

        if (mouse != null)
        {
            x = mouse.getX();
            y = mouse.getY();
            // Add your action code here.
            if (Greenfoot.mouseClicked(this)){
                String chartoletter = Character.toString(letter);
                current.add(chartoletter);
                System.out.println(current);
                
                if (letterSelected){
                    setImage(imgNormal);
                    letterSelected=false;

                }
                else {
                   
                    lastx = newx;
                    lasty = newy;
                    newx = x;
                    newy = y;
                    combx = lastx - newx;
                    comby = lasty - newy;
                    System.out.println(combx);
                    System.out.println(comby);
                
                    setImage(imgSelected);
                    letterSelected=true;
       
                }
            }
        }    
    }
}
