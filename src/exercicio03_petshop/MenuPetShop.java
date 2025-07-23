package exercicio03_petshop;

import java.util.Scanner;

public class MenuPetShop {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinaBanho maquinaBanho = new MaquinaBanho();
    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água");
            System.out.println("5 - Verificar shampoo");
            System.out.println("6 - Verificar se tem pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> maquinaBanho.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 ->  maquinaBanho.removePet();
                case 9 ->  maquinaBanho.wash();
                case 0 ->  System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

        } while(option !=0);
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina.");
        maquinaBanho.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina.");
        maquinaBanho.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = maquinaBanho.getShampoo();
        System.out.println("A máquina está com " + amount + " litros de shampoo");
    }

    private static void verifyWater() {
        var amount = maquinaBanho.getWater();
        System.out.println("A máquina está com " + amount + " litros de água");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = maquinaBanho.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        maquinaBanho.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

}
