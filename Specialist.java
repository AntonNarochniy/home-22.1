public class Specialist extends Employee {
    int levels;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }


    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public Specialist() {
    }

    @Override
    public void print() {
        super.print();
    }


    public void workWithClients(){
        System.out.println("Специалист: чем могу быть полезен?");
    }
}
