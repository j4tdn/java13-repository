package builder;

public class Warehouse {
    private String address;
    private Integer minItems;
    private Integer maxItems;
    private String manager;

    public String getAddress() {
        return address;
    }

    public Warehouse address(String address) {
        this.address = address;
        return this;
    }

    public Integer getMinItems() {
        return minItems;
    }

    public Warehouse minItems(Integer minItems) {
        this.minItems = minItems;
        return this;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public Warehouse maxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    public String getManager() {
        return manager;
    }

    public Warehouse manager(String manager) {
        this.manager = manager;
        return this;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "address='" + address + '\'' +
                ", minItems=" + minItems +
                ", maxItems=" + maxItems +
                ", manager='" + manager + '\'' +
                '}';
    }
}
