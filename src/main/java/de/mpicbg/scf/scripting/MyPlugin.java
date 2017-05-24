package de.mpicbg.scf.scripting;

import net.imagej.ImageJ;
import ij.ImagePlus;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

/**
 * Created by haase on 5/24/17.
 */
@Plugin(type = Command.class, menuPath = "Plugins>MyPlugin")
public class MyPlugin implements Command {
    @Parameter
    ImagePlus input;

    @Parameter
    ImageJ ij;

    @Override
    public void run() {
        ij.log().info("MyPlugin executed.");
        ij.log().info("Image: " + input.getTitle());
    }
}
