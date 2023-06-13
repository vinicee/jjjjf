package com.example.myapplication;

public class Animal {



        private String name;
        private String animalDescription;
        private int animalResource;
        private String populationSize;


        public Animal(String name, String animalDescription, int animalResource, String populationSize) {
            this.name = name;
            this.animalDescription = animalDescription;
            this.animalResource = animalResource;
            this.populationSize = populationSize;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAnimalDescription() {
            return animalDescription;
        }

        public void setAnimalDescription(String animalDescription) {
            this.animalDescription = animalDescription;
        }

        public int getAnimalResource() {
            return animalResource;
        }

        public void setAnimalResource(int animalResource) {
            this.animalResource = animalResource;
        }

        public String getPopulationSize() {
            return populationSize;
        }

        public void setPopulationSize(String populationSize) {
            this.populationSize = populationSize;
        }
    }

}
