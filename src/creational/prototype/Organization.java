package creational.prototype;

public abstract class Organization implements Cloneable{
    private int id = -1;
    private String name = "";
    private String address = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
