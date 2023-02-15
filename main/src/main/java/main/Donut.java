package main;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Torus;
import com.jme3.math.ColorRGBA;



public class Donut extends SimpleApplication {

    public static void main(String[] args) {
        Donut app = new Donut();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Torus torus = new Torus(50, 30, 1, 2);
        Geometry donut = new Geometry("Donut", torus);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        
        mat.setColor("Color", ColorRGBA.Brown);
        donut.setMaterial(mat);
        rootNode.attachChild(donut);
    }

    @Override
    public void simpleUpdate(float tpf) {
        rootNode.rotate(1*tpf, tpf * 3, 2 * tpf);

    }
}
