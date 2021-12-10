package JardimDeFlores;

public class Flor {
    JardimDeFlores.Petala petala;
    JardimDeFlores.Petala petala2;
    JardimDeFlores.Petala petala3;

    //metodo de petala
    public void setPetala(JardimDeFlores.Petala petala) {
        this.petala = petala;
    }

    public boolean temPetala() {
        if (petala != null) {
            return true;
        } else {
            return false;
        }
    }

    public JardimDeFlores.Petala getPetala() {
        return petala;
    }

    //metodo de petala2
    public void setPetala2(JardimDeFlores.Petala petala) {
        this.petala2 = petala;
    }

    public boolean temPetala2() {
        if (petala2 != null) {
            return true;
        } else {
            return false;
        }
    }

    public JardimDeFlores.Petala getPetala2() {
        return petala2;
    }

    //metodo de petala3
    public void setPetala3(JardimDeFlores.Petala petala) {
        this.petala2 = petala;
    }

    public boolean temPetala3() {
        if (petala3 != null) {
            return true;
        } else {
            return false;
        }
    }

    public JardimDeFlores.Petala getPetala3() {
        return petala3;
    }

}
