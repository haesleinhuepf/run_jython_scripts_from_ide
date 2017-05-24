package de.mpicbg.scf.scripting;

import ij.ImagePlus;
import net.imagej.ImageJ;
import net.imglib2.img.Img;
import net.imglib2.img.array.ArrayImgs;
import net.imglib2.img.display.imagej.ImageJFunctions;
import net.imglib2.type.numeric.integer.ShortType;

import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by haase on 5/24/17.
 */
public class Main {
    public static void main(String... args) throws FileNotFoundException, ScriptException {
        // start ImageJ
        ImageJ ij = new ImageJ();
        ij.ui().showUI();

        // get some image to process
        Img<ShortType> testImage = ArrayImgs.shorts(new long[]{100, 100});
        ImagePlus imp = ImageJFunctions.wrap(testImage, "TestImage");

        // run the script, hand over image and imagej instances
        ij.script().run(new File("src/main/jython/imagej_script.py"), false, new Object[]{"input", imp, "ij", ij});

    }
}
