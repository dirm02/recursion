package koch_curve_fractal;

import javax.swing.*;
import java.applet.Applet;

public class Main extends Applet {

    public void init() {
        Fractal fractal = new Fractal();
        fractal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
