
import java.util.Objects;

public class OneItemBox extends Box {

    private Item item;

    public OneItemBox() {
        this.item = new Item("");
    }

    @Override
    public void add(Item item) {
        if (!Objects.equals(this.item.getName(), "")) {
            return;
        }
        this.item = new Item(item.getName(), item.getWeight());
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.equals(item);
    }

}
