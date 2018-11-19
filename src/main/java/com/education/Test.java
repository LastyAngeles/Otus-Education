import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<Integer> list;
    private int id;
    private String name;

    public Test() {
        list = new ArrayList<Integer>();
        id = 1;
        name = "testing";
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

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
}
