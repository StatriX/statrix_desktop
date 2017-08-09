
import model.*;
import service.*;

import java.time.LocalDate;
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

        //test Statistic general;
        System.out.println();
        System.out.println("---test generalStatistic");
        System.out.print("-print full statistics: \n");

        List<String> tempSiteNameList = siteService.getAll()
                .stream()
                .map( s -> s.getName())
                .collect(Collectors.toList());

        List<String> tempPersonNameList = personService.getAll()
                .stream()
                .map( p -> p.getName())
                .collect(Collectors.toList());

        Map<GeneralStatistic, Integer> tempStatisticService = statisticService.generalStatistic(tempSiteNameList, tempPersonNameList);

        for (Map.Entry<GeneralStatistic, Integer> tempMap : tempStatisticService.entrySet()) {
            System.out.println(tempMap.getKey().getSiteName() + " " + tempMap.getKey().getPersonName() + " " + tempMap.getValue());
        }


        // test statistic by period1
        System.out.println();
        System.out.println("---test periodical Statistic");
        System.out.print("-print periodical statistics: \n");
        Map<PeriodicalStatistic, Integer> periodicalStatisticIntegerMap = statisticService.statisticByPeriod(tempSiteNameList.get(0), LocalDate.of(2017, 07, 01), LocalDate.of(2017, 07, 31), tempPersonNameList);

        for (Map.Entry<PeriodicalStatistic, Integer> tempMap : periodicalStatisticIntegerMap.entrySet()) {
            System.out.println(tempMap.getKey().getDate() + " " + tempMap.getKey().getPerson() + " " + tempMap.getValue());
        }

    }



}
