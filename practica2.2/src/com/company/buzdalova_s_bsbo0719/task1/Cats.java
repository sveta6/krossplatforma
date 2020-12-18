package com.company.buzdalova_s_bsbo0719.task1;

public class Cats {
    public String name;

    public void show() { System.out.println("name:"+this.name); }

    public static class Gepards extends com.company.buzdalova_s_bsbo0719.task1.Cats {
        public Gepards(String name) { this.name=name;}
    }

    public static class Lions extends com.company.buzdalova_s_bsbo0719.task1.Cats {
        public Lions(String name) { this.name=name;}
    }

    public static class Tigers extends com.company.buzdalova_s_bsbo0719.task1.Cats {
        public Tigers(String name) { this.name=name; }
    }
}
