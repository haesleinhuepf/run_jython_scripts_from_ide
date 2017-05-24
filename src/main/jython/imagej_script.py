# @ImagePlus input
# @ImageJ ij
from de.mpicbg.scf.scripting import MyModule

# work with classes and methods from java directory
MyModule().myMethod()

# execute a plugin
from ij import IJ;
input.show()
IJ.run(input, "MyPlugin", "")




