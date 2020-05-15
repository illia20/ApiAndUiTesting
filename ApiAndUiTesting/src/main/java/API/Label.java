package API;

public class Label {
    private String name;
    private String id;
    private String key = "a02cfff8fb142fa163ee975bc19ae568";
    private String token = "6e683091073911cc4fb12b994115785ed2c2218596f5b85297c4d8bf169ba242";
    private String color;

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }
    public String getToken() {
        return token;
    }
    public String getName() {
        return name;
    }
    public String getColor() { return color; }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) { this.color = color; }
}
