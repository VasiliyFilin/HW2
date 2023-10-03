public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задачи 6-7
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var bothBoxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + bothBoxersWeight + " кг");
        var weightDiff1 = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров " + weightDiff1 + " кг");
        var weightDiff2 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксеров " + weightDiff2 + " кг");

        //Задача 8
        //1.
        var collectiveHours = 640;
        var eachEmployeeHours = 8;
        var employeesNumber = collectiveHours / eachEmployeeHours;
        System.out.println("Всего работников в компании — " + employeesNumber + " человек(а)");

        //2.
        employeesNumber = employeesNumber + 94;
        collectiveHours = employeesNumber * eachEmployeeHours;
        System.out.println("Если в компании работает " + employeesNumber + " человек(а), то всего " + collectiveHours + " часа(ов) работы может быть поделено между сотрудниками");
    }
}