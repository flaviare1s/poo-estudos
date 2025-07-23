package exercicio03_petshop;

public class MaquinaBanho {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque um pet na máquina para iniciar o banho.");
            return;
        }

        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Não há água ou shampoo suficiente para dar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar um pet, é necessário limpá-la.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + pet.getName() + " está na máquina neste momento.");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + pet.getName() + " está limpo e foi removido da máquina.");
        this.pet = null;
    }

    public void wash() {
        if (this.water < 3 || this.shampoo < 1) {
            System.out.println("Não há recursos suficientes para limpar a máquina.");
            return;
        }
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
