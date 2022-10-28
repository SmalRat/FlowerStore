package flower.store;

import flower.store.flowers.Chamomile;
import flower.store.flowers.Rose;
import flower.store.flowers.Tulip;
import flower.store.groups.instancesclasses.FlowerBucket;
import flower.store.groups.instancesclasses.FlowerPack;
import flower.store.groups.specs.FlowerBucketSpecs;
import flower.store.store.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_AMOUNT = 100;
    private static final int MAX_PRICE = 100;

    private int amFIRST = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            amSECOND = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            amTHIRD = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            amFOURTH = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            amFIFTH = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            amSIXTH = RANDOM_GENERATOR.nextInt(MAX_AMOUNT),
            priceFIRST = RANDOM_GENERATOR.nextInt(MAX_PRICE),
            priceSECOND = RANDOM_GENERATOR.nextInt(MAX_PRICE),
            priceTHIRD = RANDOM_GENERATOR.nextInt(MAX_PRICE);
    private Store store = new Store();
    private Rose roseOne;
    private Tulip tulipOne;
    private Chamomile chamomileOne;
    private FlowerPack flowerPackOne;
    private FlowerPack flowerPackTwo;
    private FlowerPack flowerPackThree;
    private FlowerPack flowerPackFour;
    private FlowerPack flowerPackFive;
    private FlowerPack flowerPackSix;
    private FlowerBucket bucketOne;
    private FlowerBucket bucketTwo;
    private FlowerBucket bucketThree;
    private FlowerBucketSpecs specsOne;
    private FlowerBucketSpecs specsTwo;
    private FlowerBucketSpecs specsThree;

    private List<FlowerBucket> correctAnswerOne;
    private List<FlowerBucket> correctAnswerTwo;
    private List<FlowerBucket> correctAnswerThree;

    @BeforeEach
    public void init() {

        roseOne = new Rose();
        roseOne.setPrice(priceFIRST);

        tulipOne = new Tulip();
        tulipOne.setPrice(priceSECOND);

        chamomileOne = new Chamomile();
        roseOne.setPrice(priceTHIRD);

        flowerPackOne = new FlowerPack(roseOne, amFIRST);
        flowerPackTwo = new FlowerPack(tulipOne, amSECOND);
        flowerPackThree = new FlowerPack(chamomileOne, amTHIRD);
        flowerPackFour = new FlowerPack(roseOne, amFOURTH);
        flowerPackFive = new FlowerPack(tulipOne, amFIFTH);
        flowerPackSix = new FlowerPack(chamomileOne, amSIXTH);

        bucketOne = new FlowerBucket();
        bucketOne.add(flowerPackOne);
        bucketOne.add(flowerPackThree);


        bucketTwo = new FlowerBucket();
        bucketTwo.add(flowerPackTwo);
        bucketTwo.add(flowerPackFive);

        bucketThree = new FlowerBucket();
        bucketThree.add(flowerPackFour);
        bucketThree.add(flowerPackSix);

        store.addBucket(bucketOne);
        store.addBucket(bucketTwo);
        store.addBucket(bucketThree);

        specsOne = new FlowerBucketSpecs();
        specsOne.add(flowerPackOne);
        specsOne.add(flowerPackThree);

        specsTwo = new FlowerBucketSpecs();
        specsTwo.add(flowerPackTwo);
        specsTwo.add(flowerPackFive);

        specsThree = new FlowerBucketSpecs();
        specsThree.add(flowerPackFour);
        specsThree.add(flowerPackSix);

        correctAnswerOne = new ArrayList<>();
        correctAnswerOne.add(bucketOne);

        correctAnswerTwo = new ArrayList<>();
        correctAnswerTwo.add(bucketTwo);

        correctAnswerThree = new ArrayList<>();
        correctAnswerThree.add(bucketThree);
    }

    @Test
    public void testOne() {
        Assertions.assertEquals(correctAnswerOne, store.search(specsOne));
    }

    @Test
    public void testTwo() {
        Assertions.assertEquals(correctAnswerTwo, store.search(specsTwo));
    }

    @Test
    public void testThree() {
        Assertions.assertEquals(correctAnswerThree, store.search(specsThree));
    }

}
