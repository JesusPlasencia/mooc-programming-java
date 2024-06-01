public class List<Type> {

    private Type[] array;
    private int freeIndex;
    
    public List() {
        this.array = (Type[]) new Object[10];
        this.freeIndex = 0;
    }
    
    public void add(Type value) {
        if (this.array.length == this.freeIndex) {
            grow();
        }
        
        this.array[freeIndex] = value;
        this.freeIndex++;
    }
    
    public boolean contains (Type item) {
        return indexOfValue(item) >= 0;
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) return ;
        moveToTheLeft(indexOfValue);
        this.freeIndex--;
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }
        return this.array[index];
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public int size() {
        return this.freeIndex;
    }
    
//    Private Methods
    
    private void grow() {
        int newSize = this.array.length + this.array.length / 2;
        Type[] newArray = (Type[]) new Object[newSize];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
    
    private void moveToTheLeft (int fromIndex) {
        for (int i = fromIndex; i < this.freeIndex; i++) {
            this.array[i] = this.array[i + 1];
        }
    }
    
}
