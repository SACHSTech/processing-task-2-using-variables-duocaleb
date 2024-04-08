import processing.core.PApplet;

public class Sketch extends PApplet {
  int intScreenWidth = 500;
  int intScreenHeight = 200;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(intScreenWidth, intScreenHeight);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 191, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // grass
    fill(0, 255, 0);
    rect(0, (225 * intScreenHeight / 400), intScreenWidth, (175 * intScreenHeight / 400));

    // the house's body
    fill(203, 190, 181);
    rect(150 * intScreenWidth / 400, 150 * intScreenHeight / 400, intScreenWidth / 4, intScreenHeight / 4);

    // the house's roof
    fill(254, 238, 219);
    triangle(150 * intScreenWidth / 400, 150 * intScreenHeight / 400, 250 * intScreenWidth / 400,
        150 * intScreenHeight / 400, 200 * intScreenWidth / 400, 87 * intScreenHeight / 400);

    // the house's door
    fill(150, 75, 0);
    rect(225 * intScreenWidth / 400, 200 * intScreenHeight / 400, 25 * intScreenWidth / 400,
        50 * intScreenHeight / 400);

    // the door's handle
    stroke(0, 0, 0);
    ellipse(245 * intScreenWidth / 400, 225 * intScreenHeight / 400, intScreenWidth / 400, intScreenHeight / 400);

  }

  // define other methods down here.
}