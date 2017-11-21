/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_line;

/**
 *
 * @author DH00049
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Artem
 */
public class MyCanvas {
    
    public int width = 0;
    public int height = 0;
    public int offsetX = 0;
    public int offsetY = 0;
    public Graphics g;
    
    
    public MyCanvas(JPanel myPanel)
    {
        width = myPanel.getWidth();
        height = myPanel.getHeight();
        
        offsetX = width / 2;
        offsetY = height / 2;    
        
        g = myPanel.getGraphics();        
    }
    
    
    public void showCoordinate()
    {
        g.setColor(Color.BLACK);
        g.drawLine(0, offsetY, width,  offsetY);
        g.drawLine(offsetX, 0,offsetX, height);
    }
    
    public void showDiagonalLines()
    {
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, width,  height);
        g.drawLine(0, height,width, 0);
    }
    
    public void showPixel(int x, int y)
    {
        g.drawLine(offsetX + x, offsetY - y, offsetX + x, offsetY - y);        
    }
    
    public void showColorPixel(int x, int y, Color col)
    {
         g.setColor(col);
         showPixel(x, y);
    }
    
    public void showBlackPixel(int x, int y)
    {
         g.setColor(Color.BLACK);
         showPixel(x, y);
    }
    
    
    public void showPoint(int x, int y)
    {
        g.drawOval(offsetX + x, offsetY-y, 3, 3);
    }
    
     public void showPointWithText(int x, int y, String str)
    {
        g.drawString(str,
                        offsetX+x, offsetY-y - 6);
        showPoint(x,y);
    }
     
     public void showColorPointWithText(int x, int y, String str,Color col)
     {
          g.setColor(col);
          showPointWithText(x,y,str);
     }
     
     public void setColor(Color col)
     {
        g.setColor(col); 
     }
     
     
     public void clear()
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);       
    }     
    
}