package day16.api.obj;

public class Company implements Cloneable { // 깊은복사를뜰려면 하위객체도

    String name; // 회사명
    String address; // 주소

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
