package records;

public class Shoe
{
    private String style;
    private int size;
    private boolean hasLaces;

    public Shoe(String style, int size)
    {
        this.style = style;
        this.size = size;
        hasLaces = true;
    }
    public String getStyle() {
        return style;
    }
    public int getSize() {
        return size;
    }
    public void setStyle (String newStyle) {
        this.style = newStyle;
    }
    public void setSize (String newSize) {
        this.style = newSize;
    }
    public String toString () {
        return "A style shoe size " + size + " has laces " + hasLaces ;
    }
    public boolean equals(Shoe shoe) {
        return (this.size == shoe.getSize()
                && this.style.equals(shoe.getStyle()));
    }
}

