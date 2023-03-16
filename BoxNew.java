public class BoxNew {
    int length;
    int width;
    int height;

    public BoxNew(int length, int width, int height) {

        this(length, width);

        this.length = length;
        this.width = width;
        this.height = height;

        print();
    }

    public BoxNew(int length, int width) {

        this(length);

        this.length = length;
        this.width = width;
        height = 4;

        print();
    }

    public BoxNew(int length) {

        this();

        this.length = length;
        width = 8;
        height = 6;

        print();
    }

    public BoxNew() {
        length = 4;
        width = 6;
        height = 8;

        print();
    }

    public void print() {
        System.out.println("volume is " + length * width * height + " cubic units");
    }
}
