PImage face;
int x = 160;
int y = 250;
void setup() {
  face = loadImage("sad.jpeg");
  
  size(500,500);
  face.resize(500,500);
  
}

void draw() {
  background(face);
  fill(#FFFFFF);
  ellipse(160,250, 125,125);
  //rect(125,210, 75,75);
  
  fill(#FFFFFF);
 ellipse(350,250, 125,125);
 //rect(325,210, 75,75);
 
 fill(#000000);
  ellipse(x,y, 50,50);
  if (mouseX < 200 &&mouseX > 100 &&mouseY < 290 &&mouseY > 160) {
    x = mouseX;
    y = mouseY;
  }
  ellipse(x+200,y, 50,50);
}
