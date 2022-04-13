package com.company;

public class Weapon {
    public Weapon(String sword, String steel_arms) {
    }

    public String getName() {
        return null;
    }

    public String getType() {
        return null;
    }

    public class weapon {
        private String name;
        private String type;

        public weapon(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
