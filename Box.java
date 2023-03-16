public class Box {
    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        print();
    }
    public Box(int length, int width) {
        this.length = length;
        this.width = width;
        height = 4;

        print();
    }
    public Box(int length) {
        this.length = length;
        width = 8;
        height = 6;

        print();
    }
    public Box() {
        length = 4;
        width = 6;
        height = 8;

        print();
    }

    public void print() {
        System.out.println("volume is " + length * width * height + " cubic units");
    }

}
