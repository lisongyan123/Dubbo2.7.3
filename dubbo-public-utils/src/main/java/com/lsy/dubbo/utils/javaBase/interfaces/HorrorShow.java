package com.lsy.dubbo.utils.javaBase.interfaces;

public class HorrorShow {

    interface Monster {
        void menace();
    }

    interface DangerousMonster extends Monster {
        void destroy();
    }

    interface Lethal {
        void kill();
    }

    static class DragonZilla implements DangerousMonster {
        @Override
        public void menace() {}

        @Override
        public void destroy() {}
    }

    interface Vampire extends DangerousMonster, Lethal {
        void drinkBlood();
    }

    static class VeryBadVampire implements Vampire {
        @Override
        public void menace() {}

        @Override
        public void destroy() {}

        @Override
        public void kill() {}

        @Override
        public void drinkBlood() {}
    }

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

