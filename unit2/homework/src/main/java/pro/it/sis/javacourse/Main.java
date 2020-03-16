package pro.it.sis.javacourse;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Меч Ночи в Якутске, бьет холодом 50
        Weapon frozenSword = new FrozenSword(new Damage(0,0,50));
        // Создаем объект Меч Пылающий асфальт, бьет огнем 50
        Weapon fireSword = new FireSword(new Damage(0,50,0));
        Target iceGiant = new IceGiant();
        Target efreet = new Efreet();
        iceGiant.takeDamage(frozenSword); //вызываем метод тэйкдемедж, в параметрах какое либо оружие
        efreet.takeDamage(fireSword); //вызываем метод тэйкдемедж, в параметрах какое либо оружие
    }
}