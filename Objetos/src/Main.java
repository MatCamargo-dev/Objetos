public class Main {
    public static void main(String[] args) {
        //Petalas

        JardimDeFlores.Petala p1 = new JardimDeFlores.Petala();
        p1.setCorPetala("Amarela");

        JardimDeFlores.Petala p2 = new JardimDeFlores.Petala();
        p2.setCorPetala("Azul");

        JardimDeFlores.Petala p3 = new JardimDeFlores.Petala();
        p3.setCorPetala("Branca");

        JardimDeFlores.Petala p4 = new JardimDeFlores.Petala();
        p4.setCorPetala("Vermelha");

        JardimDeFlores.Petala p5 = new JardimDeFlores.Petala();
        p5.setCorPetala("Verde");

        //Flores

        //inserindo uma cor no girassol
        JardimDeFlores.Flor girassol = new JardimDeFlores.Flor();
        girassol.setPetala(p1);

        //inserindo uma cor na rosa
        JardimDeFlores.Flor rosa = new JardimDeFlores.Flor();
        rosa.setPetala2(p4);

        //nserindo uma cor na orquidea
        JardimDeFlores.Flor orquidea = new JardimDeFlores.Flor();
        orquidea.setPetala3(p2);

        //Jardins

        //Jardim 1
        JardimDeFlores.Jardim jardim = new JardimDeFlores.Jardim();
        jardim.setFlor(girassol);


        //Jardim 2
        JardimDeFlores.Jardim jardim2 = new JardimDeFlores.Jardim();
        jardim2.setFlor2(rosa);
        jardim.setFlor3(orquidea);

        //Pracas

        JardimDeFlores.Pracinha praca = new JardimDeFlores.Pracinha();
        praca.setJardim(jardim);
        praca.setJardim(jardim2);

        System.out.println("");
    }
}
