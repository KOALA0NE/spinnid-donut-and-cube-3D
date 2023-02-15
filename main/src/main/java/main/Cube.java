package main;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;


public class Cube extends SimpleApplication {
    
    public static void main(String[] args) {
        Cube app = new Cube();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
        Geometry cube = new Geometry("Cube", box);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.White);
        cube.setMaterial(mat);
        rootNode.attachChild(cube);
        
    }

    @Override
    public void simpleUpdate(float tpf) {
        
        rootNode.rotate(1*tpf, tpf * 3, 3 * tpf);
         
    }
}
