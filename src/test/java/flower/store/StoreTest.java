package flower.store;

import flower.store.flowers.Chamomile;
import flower.store.flowers.Rose;
import flower.store.flowers.Tulip;
import flower.store.groups.instancesClasses.FlowerBucket;
import flower.store.groups.instancesClasses.FlowerPack;
import flower.store.groups.specs.FlowerBucketSpecs;
import flower.store.store.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Store store = new Store();
    private Rose rose1;
    private Tulip tulip1;
    private Chamomile chamomile1;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;
    private FlowerPack flowerPack3;
    private FlowerPack flowerPack4;
    private FlowerPack flowerPack5;
    private FlowerPack flowerPack6;
    private FlowerBucket bucket1;
    private FlowerBucket bucket2;
    private FlowerBucket bucket3;
    private FlowerBucketSpecs specs1;
    private FlowerBucketSpecs specs2;
    private FlowerBucketSpecs specs3;

    private List<FlowerBucket> correct_answer1;
    private List<FlowerBucket> correct_answer2;
    private List<FlowerBucket> correct_answer3;

    @BeforeEach
    public void init(){

        rose1 = new Rose();
        rose1.setPrice(8);

        tulip1 = new Tulip();
        tulip1.setPrice(12);

        chamomile1 = new Chamomile();
        rose1.setPrice(17);

        flowerPack1 = new FlowerPack(rose1, 10);
        flowerPack2 = new FlowerPack(tulip1, 5);
        flowerPack3 = new FlowerPack(chamomile1, 15);
        flowerPack4 = new FlowerPack(rose1, 13);
        flowerPack5 = new FlowerPack(tulip1, 8);
        flowerPack6 = new FlowerPack(chamomile1, 11);

        bucket1 = new FlowerBucket();
        bucket1.add(flowerPack1);
        bucket1.add(flowerPack3);


        bucket2 = new FlowerBucket();
        bucket2.add(flowerPack2);
        bucket2.add(flowerPack5);

        bucket3 = new FlowerBucket();
        bucket3.add(flowerPack4);
        bucket3.add(flowerPack6);

        store.addBucket(bucket1);
        store.addBucket(bucket2);
        store.addBucket(bucket3);

        specs1 = new FlowerBucketSpecs();
        specs1.add(flowerPack1);
        specs1.add(flowerPack3);

        specs2 = new FlowerBucketSpecs();
        specs2.add(flowerPack2);
        specs2.add(flowerPack5);

        specs3 = new FlowerBucketSpecs();
        specs3.add(flowerPack4);
        specs3.add(flowerPack6);

        correct_answer1 = new ArrayList<>();
        correct_answer1.add(bucket1);

        correct_answer2 = new ArrayList<>();
        correct_answer2.add(bucket2);

        correct_answer3 = new ArrayList<>();
        correct_answer3.add(bucket3);
    }

    @Test
    public void test1(){}

    @Test
    public void test2(){}

    @Test
    public void test3(){}
}
