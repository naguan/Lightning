int startX = 0;
int startY = (int)random(100, 200);
int endX = 0;
int endY = startY;

void setup()
{
  size(300,300);
  background(255, 255, 255);
  strokeWeight(5);  
}
void draw()
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
void mousePressed()
{
  background(255, 255, 255);
  startX = 0;
  startY = (int)random(100, 200);
  endX = 0;
  endY = startY;
}
