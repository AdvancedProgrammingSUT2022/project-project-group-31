package Enums;

public enum StrategicResources {
    COAL(0, 1, 0, Technology.MINING, Improvement.MINE),
    HORSE(0, 1, 0, Technology.ANIMAL_HUSBANDRY, Improvement.PASTURE),
    IRON(0, 1, 0, Technology.METALLURGY, Improvement.MINE);

    StrategicResources(int food, int production, int gold, Technology neededTechnology, Improvement neededImprovement) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.neededTechnology = neededTechnology;
        this.neededImprovement = neededImprovement;
    }

    private int food;
    private int production;
    private int gold;
    private Technology neededTechnology;
    private Improvement neededImprovement;

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public Technology getNeededTechnology() {
        return neededTechnology;
    }

    public Improvement getNeededImprovement() {
        return neededImprovement;
    }
}
