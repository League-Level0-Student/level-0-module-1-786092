PImage olive;
PImage mushroom;
void setup() {
  size(500, 500); 
  fill(#E8CF10);
  ellipse(250, 250, 250, 250);
  fill(#FAF208);
  ellipse(250, 250, 225, 225);
  fill(#FF6200);
  ellipse(250, 250, 200, 200);
  olive = loadImage("olive.png");
  olive.resize(50, 50);
  mushroom = loadImage("mushroom.png");
  mushroom.resize(50, 50);
}
void draw() {
  if (mousePressed && (mouseButton == LEFT)) {
    image(olive, mouseX-25, mouseY-25);
  }
  if (mousePressed && (mouseButton == RIGHT)) {
     image(mushroom, mouseX-25, mouseY-25);
  }  
}
