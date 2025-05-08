package oops.this_and_super;

public class Box {
    int length, width, height;

    public void setDimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateVolume() {
        return length * width * height;
    }
}

