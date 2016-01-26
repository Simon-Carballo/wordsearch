import greenfoot.*;

/**
 * Write a description of class WordBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordBoard extends World
{

    /**
     * Constructor for objects of class WordBoard.
     * 
     */
    public WordBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    public void drawWord(String s, int xStart, int yStart, int direction){
        int xInc=0;
        int yInc=0;
        int curX=0;
        int curY=0;
        switch (direction) {
            case 1:
            //"horizontal"
            xInc=61;
            yInc= 0;
            break;
            case 2:
            //"vertical"
            xInc=0;
            yInc=61;
            break;
            case 3:
            //"diag"
            xInc=61;
            yInc=61;
            break;
        }
        char[] letters=s.toCharArray();

        curX=xStart;
        curY=yStart;
        for (char c:letters){
            Letter nextC= new Letter(c);
            addObject(nextC, curX, curY);
            curX+=xInc;
            curY+=yInc;
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */ 
    private void prepare()
    {

        drawWord("hello", 90, 90, 2);
        //drawWord("cat", 100, 100, 1);
        drawWord("this", 210, 90, 3);
        drawWord("our", 450, 90, 3);
        drawWord("project", 210, 450, 1);
        drawWord("jhdfa", 90, 390, 1);
        
        drawWord("mkmwl", 150, 90, 2);
        drawWord("oi", 90, 450, 1);
        
        drawWord("dsjw", 210, 150, 3);
        
        drawWord("wis", 210, 210, 3);
        

        drawWord("quy", 210, 270, 3);
        drawWord("tl", 510, 90, 3);
              drawWord("i", 570, 90, 3);
        drawWord("h", 210, 330, 3);
        drawWord("ancx", 390, 390, 1);
           drawWord("ksa", 450, 330, 1);
                drawWord("oewe", 390, 90, 3);
                   drawWord("pasm", 330, 90, 3);
                      drawWord("mahs", 270, 90, 3);
        //drawWord("hammer", 200, 200, 2);
    }
}
