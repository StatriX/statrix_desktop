import model.BaseClass;
import model.Keyword;
import model.Site;

public class Main {
    public static void main(String[] args) {
        BaseClass aClass = new Keyword(1, "aaa", true);
        System.out.println(aClass);

        BaseClass bClass = new Site(2, "bbb", false);

    }



}
