class Rectangle {
    private int x; 
    private int y; 
    private int width;
    private int height; 


    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void print() {
        System.out.println("Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]");
    }

    
    public Rectangle intersection(Rectangle other) {
        int x1 = Math.max(this.x, other.x);
        int y1 = Math.max(this.y, other.y);
        int x2 = Math.min(this.x + this.width, other.x + other.width);
        int y2 = Math.min(this.y + this.height, other.y + other.height);

        
        if (x1 < x2 && y1 < y2) {
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        } else {
            return null; 
        }
    }
}

public class RectangleIntersection {
    public static void main(String[] args) {
    
        Rectangle r1 = new Rectangle(1, 1, 4, 4);
        Rectangle r2 = new Rectangle(3, 3, 4, 4); 


        System.out.println("Rectangle 1:");
        r1.print();
        System.out.println("Rectangle 2:");
        r2.print();

        
        Rectangle r3 = r1.intersection(r2);
        if (r3 != null) {
            System.out.println("Intersection Rectangle:");
            r3.print();
        } else {
            System.out.println("The rectangles do not overlap.");
        }


        Rectangle r4 = new Rectangle(5, 5, 2, 2);
        System.out.println("\nRectangle 3 (non-overlapping):");
        r4.print();

        
        Rectangle r5 = r1.intersection(r4);
        if (r5 != null) {
            System.out.println("Intersection Rectangle with Rectangle 3:");
            r5.print();
        } else {
            System.out.println("The rectangles do not overlap.");
        }
    }
}