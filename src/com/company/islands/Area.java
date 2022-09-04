package com.company.islands;

import com.company.Coordinates;
import com.company.PropertiesIsland;
import com.company.entities.BaseEntity;
import com.company.entities.CanEat;
import com.company.entities.animals.Spawn;
import com.company.entities.animals.impl.*;
import com.company.entities.plants.Plant;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Area /*implements Runnable*/ {
   
   
    private int cntSheep;
    private int cntWolf;
    
    private int cntPlants;
    private int cntBoas;
    private int cntBoars;
    
    private int cntEagles;
    private int cntFoxes;
    private int cntBears;
    
    private int cntDeer;
    private int cntDucks; 
    private int cntMouses;
    private int cntRabbits;
    private int cntBuffaloes;
    private int cntCaterpillars;
    private int cntGoats;
    private int cntHorses;

    private final Coordinates coordinates;


    public Coordinates getCoordinates() {
        return coordinates;
    }


    public Area(int x, int y) {
        coordinates = new Coordinates(x, y);
        entities = new HashMap<>();
        initArea();
    }

    public int getCntWolf() {
        return cntWolf;
    }

    public int getCntSheep() {
        return cntSheep;
    }

    public int getCntBears() {
        return cntBears;
    }

    public int getCntBoas() {
        return cntBoas;
    }

    public int getCntBoars() {
        return cntBoars;
    }

    public int getCntEagles() {
        return cntEagles;
    }

    public int getCntFoxes() {
        return cntFoxes;
    }

    public int getCntBuffaloes() {
        return cntBuffaloes;
    }

    public int getCntCaterpillars() {
        return cntCaterpillars;
    }

    public int getCntDeer() {
        return cntDeer;
    }

    public int getCntDucks() {
        return cntDucks;
    }

    public int getCntGoats() {
        return cntGoats;
    }

    public int getCntHorses() {
        return cntHorses;
    }

    public int getCntMouses() {
        return cntMouses;
    }

    public int getCntRabbits() {
        return cntRabbits;
    }

    private final Map<String, BaseEntity> entities;
    
    private final Lock lock = new ReentrantLock(true);

    public Set<String> getentities() {
        return entities.keySet();
    }

    public BaseEntity getItemByKey(String key) {
        return entities.get(key);
    }

    public Lock getLock() {
        return lock;
    }


    private void initArea() {
        initWolf(PropertiesIsland.getMaxCntWolf());
        initSheep(PropertiesIsland.getMaxCntSheep());
        initBears(PropertiesIsland.getMaxCntBear());
        initBoa(PropertiesIsland.getMaxCntBoa());
        initBoars(PropertiesIsland.getMaxCntBoar());
        initEagles(PropertiesIsland.getMaxCntEagle());
        initBuffalo(PropertiesIsland.getMaxCntBuffalo());
        initCaterpillars(PropertiesIsland.getMaxCntCaterpillar());
        initDeer(PropertiesIsland.getMaxCntDeer());
        initDucks(PropertiesIsland.getMaxCntDuck());
        initGoats(PropertiesIsland.getMaxCntGoat());
        initHorses(PropertiesIsland.getMaxCntHorse());
        initMouses(PropertiesIsland.getMaxCntMouse());
        initRabbits(PropertiesIsland.getMaxCntRabbit());
        initFox(PropertiesIsland.getMaxCntFox());
        initPlants(PropertiesIsland.getCntPlants());
    }

    private void initWolf(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Wolf wolf = new Wolf();
            entities.put(wolf.getName(), wolf);
            rnd--;
            cntWolf++;
        }
    }

    private void initSheep(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Sheep sheep = new Sheep();
            entities.put(sheep.getName(), sheep);
            rnd--;
            cntSheep++;
        }
    }

    private void initBears(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Bear bear = new Bear();
            entities.put(bear.getName(), bear);
            rnd--;
            cntBears++;
        }
    }
    private void initBoars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boar bear = new Boar();
            entities.put(bear.getName(), bear);
            rnd--;
            cntBoars++;
        }
    }
    private void initBuffalo(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Buffalo bear = new Buffalo();
            entities.put(bear.getName(), bear);
            rnd--;
            cntBuffaloes++;
        }
    }
    private void initCaterpillars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Caterpillar bear = new Caterpillar();
            entities.put(bear.getName(), bear);
            rnd--;
            cntCaterpillars++;
        }
    }

    private void initDeer(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Deer bear = new Deer();
            entities.put(bear.getName(), bear);
            rnd--;
            cntDeer++;
        }
    }

    private void initDucks(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Duck bear = new Duck();
            entities.put(bear.getName(), bear);
            rnd--;
            cntDucks++;
        }
    }

    private void initGoats(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Goat bear = new Goat();
            
            entities.put(bear.getName(), bear);
            rnd--;
            cntGoats++;
        }
    }

    private void initHorses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Horse bear = new Horse();
            entities.put(bear.getName(), bear);
            rnd--;
            cntHorses++;
        }
    }

    private void initMouses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Mouse bear = new Mouse();
            entities.put(bear.getName(), bear);
            rnd--;
            cntMouses++;
        }
    }

    private void initRabbits(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Rabbit bear = new Rabbit();
            entities.put(bear.getName(), bear);
            rnd--;
            cntRabbits++;
        }
    }
    private void initFox(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Fox bear = new Fox();
            entities.put(bear.getName(), bear);
            rnd--;
            cntFoxes++;
        }
    }
    private void initEagles(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Eagle bear = new Eagle();
            entities.put(bear.getName(), bear);
            rnd--;
            cntEagles++;
        }
    }
    private void initBoa(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boa bear = new Boa();
            entities.put(bear.getName(), bear);
            rnd--;
            cntBoas++;
        }
    }

    private void initPlants(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Plant plant = new Plant();
            entities.put(plant.getName(), plant);
            rnd--;
            cntPlants++;
        }
    }

    public boolean eatAnimals() {
        for (Map.Entry<String, BaseEntity> entityEntry : entities.entrySet()) {
            if (entityEntry.getValue() instanceof CanEat) {
                Animal hunter = (Animal) entityEntry.getValue();
                if (hunter.isHungry()) {
                    for (Map.Entry<String, BaseEntity> prey : entities.entrySet()) {
                        BaseEntity food = prey.getValue();
                        if (food.isAlive()) {
                            if (PropertiesIsland.getDietByAnimal(hunter.getKind(), food.getKind()) >= ThreadLocalRandom.current().nextInt(1, 101)) {
                                hunter.eat(prey.getValue().getFood(), prey.getValue().getName());
                                prey.getValue().die();
                                break;
                            }
                        }
                    }
                }
            }
        }
        Map<String, BaseEntity> copyItems = new HashMap<>(entities);
        for (Map.Entry<String, BaseEntity> object : copyItems.entrySet()) {
            if (!object.getValue().isAlive())
                comeOrAway(object.getValue(), false);
        }
        return true;
    }
    public boolean reproduceAnimals() {
        Map<String, BaseEntity> copyItems = new HashMap<>(entities);
        for (Map.Entry<String, BaseEntity> item : copyItems.entrySet()) {
            if (item.getValue() instanceof Spawn) {
                Animal parent1 = (Animal) item.getValue();
                if (parent1.isReadyToSpawn()) {

                    for (Map.Entry<String, BaseEntity> item2 : copyItems.entrySet()) {
                        Animal parent2 = (Animal) item2.getValue();
                        if (parent2.isReadyToSpawn()) {
                            int population = ThreadLocalRandom.current().nextInt(parent1.getMaxPopulationToSpawn());
                            if (checkPopulation(parent1) < population) {
                                population = checkPopulation(parent1);
                            }
                            if (parent1.spawn(population, parent2)) {
                                while (population > 0) {
                                    birthOrDieAnimalOnLocation(parent1, true);
                                    population--;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private int checkPopulation(Animal animal) {
        if (animal instanceof Bear)
            return PropertiesIsland.getMaxCntBear() - cntBears;
        else if (animal instanceof Boa)
            return PropertiesIsland.getMaxCntBoa() - cntBoas;
        else if (animal instanceof Eagle)
            return PropertiesIsland.getMaxCntEagle() - cntEagles;
        else if (animal instanceof Fox)
            return PropertiesIsland.getMaxCntFox() - cntFoxes;
        else if (animal instanceof Wolf)
            return PropertiesIsland.getMaxCntWolf() - cntWolf;
        else if (animal instanceof Boar)
            return PropertiesIsland.getMaxCntBoar() - cntBoars;
        else if (animal instanceof Buffalo)
            return PropertiesIsland.getMaxCntBuffalo() - cntBuffaloes;
        else if (animal instanceof Caterpillar)
            return PropertiesIsland.getMaxCntCaterpillar() - cntCaterpillars;
        else if (animal instanceof Deer)
            return PropertiesIsland.getMaxCntDeer() - cntDeer;
        else if (animal instanceof Duck)
            return PropertiesIsland.getMaxCntDuck() - cntDucks;
        else if (animal instanceof Goat)
            return PropertiesIsland.getMaxCntGoat() - cntGoats;
        else if (animal instanceof Horse)
            return PropertiesIsland.getMaxCntHorse() - cntHorses;
        else if (animal instanceof Mouse)
            return PropertiesIsland.getMaxCntMouse() - cntMouses;
        else if (animal instanceof Rabbit)
            return PropertiesIsland.getMaxCntRabbit() - cntRabbits;
        else if (animal instanceof Sheep)
            return PropertiesIsland.getMaxCntSheep() - cntSheep;
        else
            return 0;
    }

    private void birthOrDieAnimalOnLocation(Animal animal, boolean isAlive) {
        if (animal instanceof Bear)
            comeOrAway(new Bear(), isAlive);
        else if (animal instanceof Boa)
            comeOrAway(new Boa(), isAlive);
        else if (animal instanceof Boar)
            comeOrAway(new Boar(), isAlive);
        else if (animal instanceof Eagle)
            comeOrAway(new Eagle(), isAlive);
        else if (animal instanceof Fox)
            comeOrAway(new Fox(), isAlive);
        else if (animal instanceof Wolf)
            comeOrAway(new Wolf(), isAlive);
        else if (animal instanceof Buffalo)
            comeOrAway(new Buffalo(), isAlive);
        else if (animal instanceof Caterpillar)
            comeOrAway(new Caterpillar(), isAlive);
        else if (animal instanceof Deer)
            comeOrAway(new Deer(), isAlive);
        else if (animal instanceof Duck)
            comeOrAway(new Duck(), isAlive);
        else if (animal instanceof Goat)
            comeOrAway(new Goat(), isAlive);
        else if (animal instanceof Horse)
            comeOrAway(new Horse(), isAlive);
        else if (animal instanceof Mouse)
            comeOrAway(new Mouse(), isAlive);
        else if (animal instanceof Rabbit)
            comeOrAway(new Rabbit(), isAlive);
        else if (animal instanceof Sheep)
            comeOrAway(new Sheep(), isAlive);
    }

    public boolean lifeCycleAnimals() {
        for (Map.Entry<String, BaseEntity> item : entities.entrySet()) {
            Animal animal;
            if (item.getValue() instanceof Animal) {
                animal = (Animal) item.getValue();
                animal.lostEnergy();
                if (animal.getHealth() < 1) {
                    comeOrAway(animal, false);
                    animal.die();
                }
            }
        }
        return true;
    }

    // посадить травку
    public void plantGrass() {
        int plant = 0;
        if (cntPlants > 50) {
            plant = ThreadLocalRandom.current().nextInt(PropertiesIsland.getCntPlants() / 2);
        }
        else {
            plant = ThreadLocalRandom.current().nextInt(PropertiesIsland.getCntPlants());
        }
        if (plant > PropertiesIsland.getCntPlants())
            plant = PropertiesIsland.getCntPlants();
        while(plant > 0) {
            comeOrAway(new Plant(), true);
            plant--;
        }
    }


    public void comeOrAway(BaseEntity object, boolean come) {
        int value;
        if (come)
            value = 1;
        else
            value = -1;
        if (object instanceof Bear)
            cntBears += value;
        else if (object instanceof Boa)
            cntBoas += value;
        else if (object instanceof Boar)
            cntBoars += value;
        else if (object instanceof Eagle)
            cntEagles += value;
        else if (object instanceof Fox)
            cntFoxes += value;
        else if (object instanceof Wolf)
            cntWolf += value;
        else if (object instanceof Buffalo)
            cntBuffaloes += value;
        else if (object instanceof Caterpillar)
            cntCaterpillars += value;
        else if (object instanceof Deer)
            cntDeer += value;
        else if (object instanceof Duck)
            cntDucks += value;
        else if (object instanceof Goat)
            cntGoats += value;
        else if (object instanceof Horse)
            cntHorses += value;
        else if (object instanceof Mouse)
            cntMouses += value;
        else if (object instanceof Rabbit)
            cntRabbits += value;
        else if (object instanceof Sheep)
            cntSheep += value;
        else if (object instanceof Plant)
            cntPlants += value;
        if (come) {
            if (object instanceof Animal)
                entities.put((object).getName(), object);
            else if (object instanceof Plant)
                entities.put((object).getName(), object);
        }
        else {
            if (object instanceof Animal)
                entities.remove((object).getName());
            else if (object instanceof Plant)
                entities.remove((object).getName());
        }
    }

    @Override
    public String toString() {
        return "Локация х:" + coordinates.getX() + " y:" + coordinates.getY() +
                "\n" + Wolf.icon + " " + cntWolf + " | " + Boa.icon + " " + cntBoas + " | " + Buffalo.icon + " " + cntBuffaloes + " | " + Goat.icon + " " + cntGoats +
                "\n" + Sheep.icon + " " + cntSheep + " | " + Boar.icon + " " + cntBoars + " | " + Caterpillar.icon + " " + cntCaterpillars + " | " + Horse.icon + " " + cntHorses +
                "\n" + Plant.icon + " " + cntPlants + " | " + Eagle.icon + " " + cntEagles + " | " + Deer.icon + " " + cntDeer + " | " + Mouse.icon + " " + cntMouses +
                "\n" + Bear.icon + " " + cntBears + " | " + Fox.icon + " " + cntFoxes + " | " + Duck.icon + " " + cntDucks + " | " + Rabbit.icon + " " + cntRabbits + "\n";
    }
    
   /* //общее количество локаций на островe
    private final int areasTotalCount;

    // индекс локации (для доступа)
    final private int areaId;
    // координаты локации X и Y (для навигации животных)
    final private int areaX;
    final private int areaY;
    //наименование локации
    final private String areaName;
    //массив с макс значениями популяций в локации
    final private int[] objectsMaxCountsInArea;

    //массив с живыми объектами в локации
    private ArrayList<LiveObject> objectsInArea;
    //фабрика потоков
//    private ExecutorService oThreads;
    //массив с текущими популяциями объектов на локации (не ID) для проверки при создании и перемещении
    private int[] currentObjectsInAreaCounts;
    //массив с популяциями животных на локации при первичной инициализации (заполняется рандомом)
    private int[] initialObjectsInAreaCounts;
    //Id создаваемого объекта в локации - используется для доступа к объекту в массиве
    private int liveObjectId;
    //наименования типов объектов
    final private String[] objectsTypesNames;
    //колличество видов объектов на острове
    final private int liveObjectsCount;
    //текущее количество объектов, завершивших работу
    private int finishedObjects = 0;
    //количество объектов в локации перед запуском потоков
    //используется для проверки, что все объекты отчитались о выполнении
    private long totalObjectsInAreaCount;
    //максимальное количество объектов в локации
    private int totalMaxObjectsInAreaCount;*/


   /* Area(int areaId, int areaX, int areaY) {
        //общее количество локаций на островe
        this.areasTotalCount = ISLAND.getAreasTotalCount();
        // индекс локации (для доступа)
        this.areaId = areaId;
        // координаты локации X и Y (для навигации животных)
        this.areaX = areaX;
        this.areaY = areaY;
        //наименование локации
        this.areaName = CONFIG.getAreaNamePrefix() + "[" + areaX + "." + areaY + "]";
        //колличество видов объектов на острове
        this.liveObjectsCount = CONFIG.getliveObjectsCount();
        //массив с макс значениями популяций в локации
        this.objectsMaxCountsInArea = CONFIG.getObjectMaxCountOnArea();
        ////максимальное количество объектов в локации
        for (int objectMaxCountInArea : this.objectsMaxCountsInArea) {
            this.totalMaxObjectsInAreaCount += objectMaxCountInArea;
        }
        //массив с живыми объектами в локации
        this.objectsInArea = new ArrayList<>();
        //массив с текущими популяциями объектов на локации (не ID) для проверки при создании и перемещении
        this.currentObjectsInAreaCounts = new int[CONFIG.getliveObjectsCount()];
        //массив с популяциями животных на локации при первичной инициализации (заполняется рандомом)
        this.initialObjectsInAreaCounts = new int[CONFIG.getliveObjectsCount()];
        //индекс создаваемого объекта на локации
        //используется для доступа к объекту в массиве
        this.liveObjectId = -1;
        //наименование типов животных и растений
        this.objectsTypesNames = CONFIG.getObjectsTypesNames();
        //фабрика потоков объектов
//        oThreads = Executors.newFixedThreadPool((45000 - areasTotalCount) / areasTotalCount);
        //записываем соообщение о создании локации
        //LOG.addToLog(areaName + " : локация создана");

        //создаем изначальные популяции рандомом
        for (int liveObjectTypeId = 0; liveObjectTypeId < liveObjectsCount; liveObjectTypeId++) {
            initialObjectsInAreaCounts[liveObjectTypeId] = ThreadLocalRandom.current().nextInt(0, objectsMaxCountsInArea[liveObjectTypeId] + 1);
            if ((initialObjectsInAreaCounts[liveObjectTypeId]) > objectsMaxCountsInArea[liveObjectTypeId])
                this.initialObjectsInAreaCounts[liveObjectTypeId] = objectsMaxCountsInArea[liveObjectTypeId];
            for (int liveObject = 0; liveObject < initialObjectsInAreaCounts[liveObjectTypeId] - 1; liveObject++) {
                createObject(liveObjectTypeId, true);
                //LOG.addToLog(areaName + "\t: создан " + objectsInArea.get(liveObjectId).getObjectName());
            }
        }
    }

    @Override
    public void run() {
        finishedObjects = 0;
        totalObjectsInAreaCount = objectsInArea.size();
//        LOG.addToLog(ISLAND.currentStep + " " + areaName + " " + finishedObjects + " " + totalObjectsInAreaCount);
        for (int liveObject = 0; liveObject < totalObjectsInAreaCount; liveObject++)
//            oThreads.submit(objectsInArea.get(liveObject));

            objectsInArea.get(liveObject).run();
        checkArea();

        //ждем когда отработают все объекты
        //если работают, то спим
//        while (finishedObjects < totalObjectsInAreaCount) {
//            try {
//                Thread.sleep(totalObjectsInAreaCount / 1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        LOG.addToLog(ISLAND.currentStep + " " + areaName + " " + finishedObjects + " " + totalObjectsInAreaCount);
        //после выполнения всех действий итерации отчитываемся перед Island
//        ISLAND.appendFinishedAreas();
    }

    //инкремент текущего количества объектов, завершивших работу
//    public synchronized void appendFinishedObjects() {
//        finishedObjects++;
//    }

    //предоставление текущей популяции в локации
    //используется для проверок при создании нового объекта или перемещении
    public synchronized int getCurrentObjectsInAreaCounts(int liveObjectTypeId) {
        return currentObjectsInAreaCounts[liveObjectTypeId];
    }

    //инкремент текущего значения популяции в локации
    //используется при создании нового объекта или перемещении
    public synchronized void appendCurrentObjectsInAreaCount(int liveObjectTypeId) {
        this.currentObjectsInAreaCounts[liveObjectTypeId]++;
    }

    //декремент текущего значения популяции в локации
    //используется при удалении объекта или перемещении
    public synchronized void subtractCurrentObjectsInAreaCount(int liveObjectTypeId) {
        this.currentObjectsInAreaCounts[liveObjectTypeId]--;
    }

    public String getAreaName() {
        return areaName;
    }

    public int getLiveObjectId() {
        return liveObjectId;
    }

    public void appendLiveObjectId() {
        this.liveObjectId++;
    }

    public int getAreaX() {
        return areaX;
    }

    public int getAreaY() {
        return areaY;
    }

    //проверка на то, что макс. популяция для объекта в локации не достигнута
    public boolean isCreateAvaibleInArea(int liveObjectTyepId) {
        if ((currentObjectsInAreaCounts[liveObjectTyepId] + 1) <= objectsMaxCountsInArea[liveObjectTyepId])
            return true;
        else {
            //записываем соообщение в лог
//          LOG.addToLog(areaName + " : достигнута максимальная популяция " + CONFIG.getObjectTypeName(liveObjectTyepId) + " в локации");
            return false;
        }
    }

    //создание нового объекта
    public synchronized void createObject(int liveObjectTypeId, boolean initFlag) {
        synchronized (objectsInArea) {
            synchronized (currentObjectsInAreaCounts) {
                if (isCreateAvaibleInArea(liveObjectTypeId)) {
                    //увеличиваем счетчик для именования
                    ISLAND.appendCountForName(liveObjectTypeId);
                    //увеличиваем текущую популяцию объектов на локации
                    appendCurrentObjectsInAreaCount(liveObjectTypeId);
                    //вычисляем будущий Id создаваемого объекта
                    liveObjectId = objectsInArea.size();
                    switch (liveObjectTypeId) {
                        case 0 -> objectsInArea.add(new Plant(areaId, liveObjectId, initFlag));
                        case 1 -> objectsInArea.add(new Wolf(areaId, liveObjectId, initFlag));
                        case 2 -> objectsInArea.add(new Boa(areaId, liveObjectId, initFlag));
                        case 3 -> objectsInArea.add(new Fox(areaId, liveObjectId, initFlag));
                        case 4 -> objectsInArea.add(new Bear(areaId, liveObjectId, initFlag));
                        case 5 -> objectsInArea.add(new Eagle(areaId, liveObjectId, initFlag));
                        case 6 -> objectsInArea.add(new Horse(areaId, liveObjectId, initFlag));
                        case 7 -> objectsInArea.add(new Deer(areaId, liveObjectId, initFlag));
                        case 8 -> objectsInArea.add(new Rabbit(areaId, liveObjectId, initFlag));
                        case 9 -> objectsInArea.add(new Mouse(areaId, liveObjectId, initFlag));
                        case 10 -> objectsInArea.add(new Goat(areaId, liveObjectId, initFlag));
                        case 11 -> objectsInArea.add(new Sheep(areaId, liveObjectId, initFlag));
                        case 12 -> objectsInArea.add(new Boar(areaId, liveObjectId, initFlag));
                        case 13 -> objectsInArea.add(new Buffalo(areaId, liveObjectId, initFlag));
                        case 14 -> objectsInArea.add(new Duck(areaId, liveObjectId, initFlag));
                        case 15 -> objectsInArea.add(new Caterpillar(areaId, liveObjectId, initFlag));
                    }
                }
            }
        }
    }
//??????????????????????????????????????????????????????????????????????????????????????????????
    //перемещение объекта из одной локации в другую
    public void moveObject(int currentliveObjectId, int fromAreaId, int toAreaId) {
        ISLAND.getArea(toAreaId).appendCurrentObjectsInAreaCount(ISLAND.
                getArea(fromAreaId).objectsInArea.get(liveObjectId).getLiveObjectTypeId());
        liveObjectId = this.objectsInArea.size();
        ISLAND.getArea(toAreaId).objectsInArea.add(ISLAND.getArea(fromAreaId).getObject(liveObjectId));

    }
//?????????????????????????????????????????????????????????????????????????????????????????????
    //удаление объекта
    public synchronized void deleteObject(int liveObjectId) {
//        synchronized (objectsInArea) {
//            synchronized (currentObjectsInAreaCounts) {
        //уменьшаем значение текущей популяции в локации
        subtractCurrentObjectsInAreaCount(objectsInArea.get(liveObjectId).getLiveObjectTypeId());
        //удаление элемента из массива
        objectsInArea.remove(liveObjectId);
        for (int i = 0; i < objectsInArea.size(); i++) {
            objectsInArea.get(i).currentLiveObjectId = i;
        }
//            }
//        }
    }

    //проверка объектов на то, что они должны быть удалены
    public void checkArea() {
        for (int i = objectsInArea.size() - 1; i >= 0; i--) {
            if ((objectsInArea.get(i).isDeleteFlag())||(objectsInArea.get(i).isMoveFlag())) deleteObject(i);
        }
    }

    public LiveObject getObject(int liveObjectId) {
        return objectsInArea.get(liveObjectId);
    }

    public int getObjectsMaxCountsInArea(int liveObjectTypeId) {
        return this.objectsMaxCountsInArea[liveObjectTypeId];
    }

    //    public synchronized void shutdown() {
//        oThreads.shutdownNow();
//    }
*/
}


