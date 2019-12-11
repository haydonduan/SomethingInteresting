package com.owl.decorator;

import java.io.*;

public class MainDecorator {
    public static void main(String[] args) {
        Shape redShape = new RedShapeDecorator(new Circle());
        redShape.draw();
    }

    public void testInputSteam() throws Exception {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("file")));
        FilterInputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream("file")));
    }
}
