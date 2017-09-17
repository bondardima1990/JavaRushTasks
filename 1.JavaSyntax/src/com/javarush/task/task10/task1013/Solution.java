package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String mother;
        private String father;
        private String sex;
        private String profession;
        private int age;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String mother) {
            this.name = name;
            this.mother = mother;
        }

        public Human(String name, String mother, String father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String mother, String father, String sex) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.sex = sex;
        }

        public Human(String name, String mother, String father, String sex, String profession) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.sex = sex;
            this.profession = profession;
        }

        public Human(String name, String mother, String father, String sex, String profession, int age) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.sex = sex;
            this.profession = profession;
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String mother, int age) {
            this.name = name;
            this.mother = mother;
            this.age = age;
        }

        public Human(String name, String mother, String father, int age) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.age = age;
        }

        public Human(String name, String mother, String father, String sex, int age) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.sex = sex;
            this.age = age;
        }
    }
}
