package DuckDesign;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        DuckDesign.Quackable mallardDuck = new DuckDesign.QuackEcho(new DuckDesign.QuackCounter(new DuckDesign.MallardDuck()));
//        DuckDesign.Quackable redheadDuck = new DuckDesign.QuackEcho(new DuckDesign.QuackCounter(new DuckDesign.RedheadDuck()));
//        DuckDesign.Quackable rubberDuck = new DuckDesign.QuackCounter(new DuckDesign.QuackEcho(new DuckDesign.RubberDuck()));
//        DuckDesign.Quackable duckCall = new DuckDesign.QuackCounter(new DuckDesign.QuackEcho(new DuckDesign.DuckCall()));
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable gooseDuck = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pegeonDuck = new QuackCounter(new QuackEcho(new PegeonAdapter(new Pegeon())));

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole DuckDesign.Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard DuckDesign.Flock Simulation");
        simulate(flockOfMallards);

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);
        simulate(pegeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
