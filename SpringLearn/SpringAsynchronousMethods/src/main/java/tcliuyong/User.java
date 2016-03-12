package tcliuyong;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by liuyong on 2016/3/11.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
//如果属性对不上就不理睬
public class User {
    private String name;
    private String blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", blog=" + blog + "]";
    }
}
