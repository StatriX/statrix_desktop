import model.BaseDirectory;
import model.Keyword;
import model.Site;

public class Main {
    public static void main(String[] args) {
        BaseDirectory aClass = new Keyword(1, "aaa", true);
        System.out.println(aClass);

        BaseDirectory bClass = new Site(2, "bbb", false);

    }



}
