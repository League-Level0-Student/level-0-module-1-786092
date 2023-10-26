
void setup() {
  PImage zombie = loadImage("Zombie.jpg");
  size(500, 500);
  zombie.resize(500, 500);
  image(zombie, 0, 0);
}
void draw() {
  fill(mouseX, 0, mouseY);
  ellipse(230, 160, 47, 47);
  ellipse(280, 160, 47, 47);
  fill(0, 0, 0);
  ellipse(230, 160, 10, 10);
  ellipse(280, 160, 10, 10);
}
