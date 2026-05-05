package structures;

/**
 *
 * @author ream_
 */
public class Node {
    public String code;
    public String name;
    public String salary;
    public Node next;

    public Node(String code, String name, String salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }
}
