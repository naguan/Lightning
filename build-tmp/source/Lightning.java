import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = (int)random(100, 200);
int endX = 0;
int endY = startY;

public void setup()
{
  size(300,300);
  background(255, 255, 255);
  strokeWeight(5);  
}
public void draw()
{
  stroke(random(0,256), random(0,256),random(0,256));
  while( endX < 300 )
  {
    line( startX, startY,endX, endY );
    endX = startX + (int)random(0, 10);
    endY = startY + (int)random(-10 , 10);
  
    startX = endX;
    startY = endY;
  }
}
public void mousePressed()
{
  background(255, 255, 255);
  startX = 0;
  startY = (int)random(100, 200);
  endX = 0;
  endY = startY;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
