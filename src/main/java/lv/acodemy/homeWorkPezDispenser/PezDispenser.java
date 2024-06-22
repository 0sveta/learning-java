package lv.acodemy.homeWorkPezDispenser;

public class PezDispenser {

    private String name;
    private String color;
    private String series;
    private int maxAmount;
    private int amount;
    private int newAmount;

    public PezDispenser(String name, String color, String series) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.maxAmount = maxAmount;
        this.amount = amount;
    }

    public PezDispenser() {
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Series='" + series + '\'' +
                ", Max Amount='" + maxAmount + '\'' +
                ", Amount='" + amount + '\'' +
                '}';
    }

    public void takeCandy() {
        if (amount == 0) {
            System.out.println("You can`t take a candy");
        } else {
            System.out.println("Take a candy");
        }
    }

    //отдавать по одной
    public void takeOneCandy() {
        if (amount == 0) {
            System.out.println("You can`t take a candy");
        } else {
            amount--;
            int takeOneCandyAmount = amount--;
            System.out.println("There is" + " " + takeOneCandyAmount + " " + "candy left");
        }
    }

    //отдавать любое количество
    public void giveAwayCandy(int g) {
        int w = (amount - g);
        System.out.println("Dispenser now has" + " " + w + " " + "candies");
    }

    // загружать целиком недостающие
    public void loadAll() {
        newAmount = (maxAmount - amount) + amount;
        if (amount == 15) {
            System.out.println("Is full");
        } else {
            System.out.println("Dispenser now has" + " " + newAmount + " " + "candies");
        }
    }

    // загружать по 1
    public void loadOne() {
        if (amount == 15) {
            System.out.println("Is full");
        } else {
            amount++;
            System.out.println(amount);
        }
    }

    // загружать любое кол-во
    public void addCandy(int c) {
        int d = (amount + c);
        System.out.println("Dispenser now has" + " " + d + " " + "candies");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
