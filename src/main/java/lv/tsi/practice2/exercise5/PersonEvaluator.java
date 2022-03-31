package lv.tsi.practice2.exercise5;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PersonEvaluator {

    private final List<Person> personList;

    public void findAndPrint(String prefix) {
        personList.stream()
                .filter(person -> person.getName().startsWith(prefix))
                .forEach(person -> System.out.println(person.getName()));
    }

    public void findAndPrint(int age) {
        personList.stream()
                .filter(person -> person.getAge() > age)
                .forEach(person -> System.out.println(person.getName()));
    }

    public void groupAndPrint() {
        Map<Integer, List<Person>> personsByAge = personList
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

        personsByAge.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.format("Age %s: %s\n", e.getKey(), e.getValue()));
    }

    public int getAverageAge() {
        return (int) personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
}
