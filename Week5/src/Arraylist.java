public class Arraylist {
    private String[] arr;
    private int size;

    public Arraylist() {
        this.arr = new String[10];
        this.size = 0;
    }

    public String get(int i) {
        if (i>=0 && i<size)
            return arr[i];
        else
            throw new IndexOutOfBoundsException();
    }

    public void set(int i, String e) {
        if (i >= 0 && i < size) {
            String tmp = arr[i];
        }
    }

    public void main(String[] args) {
        System.out.println("Creating a list...");
    }
}
