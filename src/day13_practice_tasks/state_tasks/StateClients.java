package day13_practice_tasks.state_tasks;

public class StateClients {
    public static void main(String[] args) {
        California california = new California("California", "CA", "Democratic", "Gavin Newsom", "Dianne Feinstein", 39_128_186);
        System.out.println(california);

        Virginia virginia = new Virginia("Virginia", "VA", "Democratic Party", "Glenn Youngkin", "Tim Kaine", 8_881_195);
        System.out.println(virginia);

        Florida florida = new Florida("Florida", "FL", "Republican Party", "Ron DeSantis", "Marco Rubio", 23_372_215);

        Texas texas = new Texas("Texas", "TX", "Republican Party", "Greg Abbott", "Ted Cruz ", 31_290_831);
        System.out.println(texas);

    }
}
