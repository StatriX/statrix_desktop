
import model.Keyword;
import model.Person;
import model.Site;
import model.User;
import service.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        SiteService siteService = new SiteServiceImpl();
        UserService userService = new UserServiceImpl();
        KeywordService keywordService = new KeywordServiceImpl();
        StatisticService statisticService = new StatisticServiceImp();


        // test Person
        System.out.println("---test Persons");
        System.out.print("-print: ");
        System.out.println(personService.getAll());
        System.out.println("--delete person id 1---");
        personService.delete(1);
        System.out.print("-print: ");
        System.out.println(personService.getAll());
        System.out.println("---add new Person---");
        personService.save(new Person("Person5", false));
        System.out.print("-print: ");
        System.out.println(personService.getAll());

        // test site
        System.out.println();
        System.out.println("---test Sites---");
        System.out.print("-print: ");
        System.out.println(siteService.getAll());
        System.out.println("--delete site id 1---");
        siteService.delete(1);
        System.out.print("-print: ");
        System.out.println(siteService.getAll());
        System.out.println("---add new Site---");
        siteService.save(new Site("site11", false));
        System.out.print("-print: ");
        System.out.println(siteService.getAll());

        //test Keyword
        System.out.println();
        System.out.println("---test Keyword---");
        System.out.print("-print keyword for person id2: ");
        System.out.println(keywordService.getAllByPersonId(2));
        System.out.println("--delete keyword id 4 from person id2 ---");
        keywordService.delete(4);
        System.out.print("-print keyword for person id2: ");
        System.out.println(siteService.getAll());
        System.out.println("---add new keyword to person 4---");
        keywordService.save(new Keyword(4, "Person4Keyword1", false));
        System.out.print("-print keyword for person id4: ");
        System.out.println(keywordService.getAllByPersonId(4));

        //test users
        System.out.println("---test Users");
        System.out.print("-print: ");
        System.out.println(userService.getAll());
        System.out.println("--delete user id 2---");
        personService.delete(2);
        System.out.print("-print: ");
        System.out.println(userService.getAll());
        System.out.println("---add new Person---");
        userService.save(new User("user4", "123123", "user4@statrix.ru", false));
        System.out.print("-print: ");
        System.out.println(userService.getAll());
        System.out.println("---update person 1---");
        userService.save(new User(1, "admin2", "123123", "admin1@statrix.ru", true));
        System.out.print("-print: ");
        System.out.println(userService.getAll());

        //test Statistic;
        System.out.println("---test Statistic");
        System.out.print("-print full statistics: ");

        List<String> tempSiteNameList = siteService.getAll()
                .stream()
                .map( s -> s.getName())
                .collect(Collectors.toList());

        List<String> tempPersonNameList = personService.getAll()
                .stream()
                .map( p -> p.getName())
                .collect(Collectors.toList());

        Map<String, Map<String, Integer>> tempStatisticService = statisticService.commonStatistic(tempSiteNameList, tempPersonNameList);

        Collections.sort(tempPersonNameList);
        Collections.sort(tempSiteNameList);

        System.out.println(tempSiteNameList.size());
        System.out.println(tempPersonNameList.size());
        System.out.println(tempStatisticService.size());

        for(int i = 0; i < tempSiteNameList.size(); i++) {
            for(int j = 0; j < tempPersonNameList.size(); j++) {
                System.out.print(tempStatisticService.get(tempSiteNameList.get(i)).get(tempPersonNameList.get(j)) + "\t");
            }
            System.out.println();
        }

    }



}
