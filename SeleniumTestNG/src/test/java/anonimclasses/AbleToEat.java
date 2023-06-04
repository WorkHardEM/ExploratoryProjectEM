package anonimclasses;

interface AbleToEat {
    void eat();
}

class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Ням-ням-ням");
            }
        };
        ableToEat.eat();
    }
}


