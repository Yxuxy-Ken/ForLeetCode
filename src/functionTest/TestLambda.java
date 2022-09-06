package functionTest;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<TestLambdaEntity> testLambdaEntityList =
                Arrays.asList(
                        new TestLambdaEntity(0, "zenshen", "asd"),
                        new TestLambdaEntity(1, "chenkun", "fda"),
                        new TestLambdaEntity(2, "fsdskun", "fda")
                );
        testLambdaEntityList.stream().filter(p -> p.getName().startsWith("z")).forEach(System.out::println);

    }

}
